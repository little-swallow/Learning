package testsql;

import java.beans.DefaultPersistenceDelegate;
import java.sql.*;

public class test {
	public static void main(String[] args)  {
		 String url = "jdbc:sqlserver://localhost:1433;databaseName=Enroll;user=Frey;password=123456";
		// String url2 = "jdbc:sqlserver://127.0.0.1:1368;databaseName=test;integratedSecurity=true;";//windows集成模式连接    
	    
	        // Declare the JDBC objects.    
	        Connection con = null;    
	        Statement stmt = null;    
	        ResultSet rs = null;    
	    
	        try {    
	            // Establish the connection.    
	            System.out.println("begin.");    
	            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");    
	            con = DriverManager.getConnection(url);
	           
	            System.out.println("end.");    
	    
	            // Create and execute an SQL statement that returns some data.    
	            String SQL = "SELECT* FROM FXYEroll";  
	            //String SQL = "insert into SLog values(2,'123456','admin','2016-10-08','admin','男','1','1') ";
	            //String SQL = "delete from SLog where log_ID=1";
	            stmt = con.createStatement();    
	            rs = stmt.executeQuery(SQL);    
	            //stmt.executeQuery(SQL);
	            // Iterate through the data in the result set and display it.    
	            while (rs.next()) {    
	                System.out.println(rs.getString(4) + " " + rs.getString(6));    
	            }    
	        }    
	    
	        // Handle any errors that may have occurred.    
	        catch (Exception e) {    
	            e.printStackTrace();    
	        }    
	    
	        finally {    
	            if (rs != null)    
	                try {    
	                    rs.close();    
	                } catch (Exception e) {    
	                }    
	            if (stmt != null)    
	                try {    
	                    stmt.close();    
	                } catch (Exception e) {    
	                }    
	            if (con != null)    
	                try {    
	                    con.close();    
	                } catch (Exception e) {    
	                }    
	        }    
	    }    
	}



//private static List<String> parse(Connection connection, String tableName, String type) {
//    List<String> result = new ArrayList<>();
//    try {
//        ResultSet resultSet = null;
//        if (type.equals("primary")) {
//            resultSet = connection.getMetaData().getPrimaryKeys(null, null, tableName);
//        } else {
//            resultSet = connection.getMetaData().getColumns(null, null, tableName, null);
//        }
//        while (resultSet.next()) {
//            result.add(resultSet.getString("COLUMN_NAME").toLowerCase());//INDEX:4 ,name
//        }
//    } catch (SQLException e) {
//        e.printStackTrace();
//    }
//    return result;
//}


