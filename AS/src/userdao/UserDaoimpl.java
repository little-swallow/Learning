package userdao;

import dbc.DBConn;
import userentity.User;
import userentity.Visiter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UserDaoimpl implements UserDao {
	
	DBConn db = new DBConn();


	@Override
	public boolean logincheck(User user) throws Exception {
		Connection conn = db.getConn();
		PreparedStatement prest = null;
		ResultSet rs = null;
		String sql = "select Sno,Spassword from FXYEnroll where Sno=? and Spassword=?";
		prest = db.getprep(conn, sql);
		prest.setString(1, user.getUserid());
		prest.setString(2, user.getUpass());
		rs = prest.executeQuery();
		while(rs.next()){
			return true;
		}
		
		return false;
	}
	@Override
	public boolean updatebyid(User user) throws Exception {
		Connection conn = db.getConn();
		String sql = "update FXYEnroll set Sname=?,Sid=?,Ssex=?,Stel=?,Saddress=?,Sgschool=?,Sggrade=?,Spassword=?,Pjob1=?,Pjob2=? where Sno=?";
		PreparedStatement prest = db.getprep(conn, sql);
		prest.setString(1, user.getname());
		prest.setString(2, user.getnum());
		prest.setString(3, user.getsex());
		prest.setString(4, user.gettelephone());
		prest.setString(5, user.getAddress());
		prest.setString(6, user.getgrdschool());
		prest.setString(7, user.getgrdgrade());
		prest.setString(8, user.getUpass()); 
		prest.setString(9, user.getfatherjob());
		prest.setString(10, user.getmotherjob());
		prest.setString(11, user.getUserid());
		int i = prest.executeUpdate();
		if(i>0){
			return true;
		}
		return false;
	}
	@Override
	public User selectuserinfo(User user) throws Exception {
		// TODO Auto-generated method stub
		User us = user;
		Connection conn = db.getConn();
		PreparedStatement prest = null;
		ResultSet rs = null;
		String sql="select Sname,Sid,Ssex,Stel,Saddress,Sgschool,Sggrade,Pjob1,Pjob2 from FXYEnroll where Sno = ?";
		prest =db.getprep(conn, sql);
		prest.setString(1, us.getUserid());
		rs = prest.executeQuery();
		while(rs.next()){
			us.setname(rs.getString("Sname"));
			us.setsex(rs.getString("Ssex"));
			us.setnum(rs.getString("Sid"));
			us.settelephone(rs.getString("Stel"));
			us.setAddress(rs.getString("Saddress"));
			us.setfatherjob(rs.getString("Pjob1"));
			us.setmotherjob(rs.getString("Pjob2"));
			us.setgrdschool(rs.getString("Sgschool"));
			us.setgrdgrade(rs.getString("Sggrade"));
		}
		return us;
	}
	@Override
	public User selectstate(User user) throws Exception {
		// TODO Auto-generated method stub
		User us = new User();
		Connection conn = db.getConn();
		PreparedStatement prest = null;
        ResultSet rs = null;
        String sql = "select Sno,Sname,State,Esignuptime"
        		+ " from FXYEnroll,FXYState,FXYPlan where "
        		+ "FXYEnroll.Sstate_id=FXYState.Sstate_id and "
        		+ "FXYEnroll.Eyear=FXYPlan.Eyear AND Sno=?";
        prest = db.getprep(conn, sql);
        prest.setString(1, user.getUserid());
        rs = prest.executeQuery();
        while(rs.next()){
        	us.setUserid(rs.getString("Sno"));
			us.setname(rs.getString("Sname"));
			us.setState(rs.getString("State"));
			us.setSignuptime(rs.getString("Esignuptime"));
		}
		return us;  
        
	}
	public User selectclass(User user) throws Exception{
		User us = new User();
		Connection conn = db.getConn();
		PreparedStatement prest = null;
        ResultSet rs = null;
        String sql = "select Sclass From FXYCassfication where Sno=?";
        prest = db.getprep(conn, sql);
        prest.setString(1, user.getUserid());
        rs = prest.executeQuery();
        while(rs.next()){
        	us.setClassname(rs.getString("Sclass"));
        }
        if(us.getClassname()==null){
        	us.setClassname("");	
        }
        return us;			
	}

	public void completedemand(User user) throws Exception{
		Connection conn = db.getConn();
		PreparedStatement prest = null;
        String sql = "update FXYEnrolled set Sbus=?,Sboard=? where Sno=?";
        prest = db.getprep(conn, sql);
        prest.setString(1, user.getBus());
        prest.setString(2,user.getRoom());
        prest.setString(3, user.getUserid());
        prest.executeUpdate();
	}
	public void makesure(User user) throws Exception{
		Connection conn = db.getConn();
		PreparedStatement prest = null;
        String sql = "update FXYEnroll set Sensure=? where Sno=?";
        prest = db.getprep(conn, sql);
        prest.setString(1, user.getEnsure());
        prest.setString(2, user.getUserid());
        prest.executeUpdate();
	}
}