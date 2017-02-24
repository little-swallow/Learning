package visiterdao;

import dbc.DBConn;
import userentity.Visiter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VisiterDaoimpl implements VisiterDao {
	
	DBConn db = new DBConn();
	public Visiter getyear() throws Exception{
		Visiter visiter=new Visiter();
		Connection conn = db.getConn();
		PreparedStatement prest = null;
		ResultSet rs = null;
		String sql = "select Eyear from FXYPlan";
		prest = db.getprep(conn, sql);
		rs = prest.executeQuery();
		while(rs.next()){
			visiter.setYear(rs.getString("Eyear"));
		}
		return visiter;
		
	}

	@Override
	public boolean addemp(Visiter visiter) throws Exception {
		
		//System.out.println(visiter.getname());
		
		Connection conn = db.getConn();
		String sql = "insert into FXYEnroll (Sno,Sname,Sid,Ssex,Stel,Saddress,Sgschool,Sggrade,Sstate_id,Spassword,Pjob1,Pjob2,Eyear) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement prest = db.getprep(conn, sql);	
		prest.setString(1, visiter.getuid());
		prest.setString(2, visiter.getname());
		prest.setString(3, visiter.getnum());
		prest.setString(4, visiter.getsex());
		prest.setString(5, visiter.gettelephone());
		prest.setString(6, visiter.getAddress());
		prest.setString(7, visiter.getgrdschool());
		prest.setString(8, visiter.getgrdgrade());
		prest.setString(9, "1");
		prest.setString(10, visiter.getpassword());
		prest.setString(11, visiter.getfatherjob());
		prest.setString(12, visiter.getmotherjob());
		prest.setString(13,visiter.getYear());
		int i = prest.executeUpdate();
		if(i>0){
			return true;
		}
		return false;
	}

}
