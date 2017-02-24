package dbc;

/**
 * Created by zpc on 2016/11/29.
 */

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DBConn {

    private static String DRIVER;
    private static String URL;
    private static String USER;
    private static String PWD;
    private static Connection conn;
    private PreparedStatement s;
    private ResultSet rs;

    public DBConn(){
        try {
            Properties dbp = new Properties();
            dbp.load(this.getClass().getClassLoader().getResourceAsStream(
                    "DBConn.properties"));
            DRIVER = (String) dbp.get("DRIVER");
            URL = (String) dbp.get("URL");
            USER = (String) dbp.get("USER");
            PWD = (String) dbp.get("PWD");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Connection getConn(){
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL,USER,PWD);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return conn;

    }

    public PreparedStatement getprep(Connection conn, String sql){
        try {
            s = conn.prepareStatement(sql);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return s;
    }

    public static void main(String[] args) {
        DBConn db = new DBConn();
        System.out.println(db.getConn());
    }
}
