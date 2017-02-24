package teacherdao;

import dbc.DBConn;
import userentity.Studentinfo;
import userentity.Plan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class TeacherDaoimpl implements TeacherDao {
	
	DBConn db = new DBConn();

	@Override
	public void addplan(Plan plan) throws Exception {
		Connection conn = db.getConn();
        String sql = "insert into FXYPlan (Eyear,Enum,Ecnum,Etel,Etime,Emoney,Esignuptime) values (?,?,?,?,?,?,?)";
        PreparedStatement prest = db.getprep(conn, sql);
        prest.setString(1, plan.getYear());
        prest.setString(2, plan.getnumber());
        prest.setString(3, plan.getclassnumber());
        prest.setString(4, plan.gettelephone());
        prest.setString(5, plan.getask_time());
        prest.setString(6, plan.getfee());
        prest.setString(7, plan.getsign_up_time());
		prest.executeUpdate();
		return;
	}
	 public Plan selectplaninfo() throws Exception {
	        Connection conn = db.getConn();
	        PreparedStatement prest = null;
	        ResultSet rs = null;
	        String sql = "select Eyear,Enum,Ecnum,Etel,Etime,Emoney,Esignuptime from FXYPlan where Eyear=2017";
	        prest = db.getprep(conn, sql);
	        Plan plan = new Plan();
	        rs = prest.executeQuery();
	        while(rs.next()){	        
	        plan.setYear(rs.getString("Eyear"));
	        plan.setnumber(rs.getString("Enum"));
	        plan.setclassnumber(rs.getString("Ecnum"));
	        plan.settelephone(rs.getString("Etel"));
	        plan.setask_time(rs.getString("Etime"));
	        plan.setfee(rs.getString("Emoney"));
	        plan.setsign_up_time(rs.getString("Esignuptime"));
	        }
	        return plan;
	    }

    @Override
  

public ArrayList selectinfo() throws Exception {
        ArrayList Info = new ArrayList();
        Connection conn = db.getConn();
        PreparedStatement prest = null;
        ResultSet rs = null;
        String sql = "select Sno,Sname,Sid,Ssex,Stel,Sgrade from FXYEnroll";
        prest = db.getprep(conn, sql);
        rs = prest.executeQuery();
        while(rs.next()){
            Studentinfo info = new Studentinfo();
            info.setUserid(rs.getString("Sno"));
            info.setname(rs.getString("Sname"));
            info.setnum(rs.getString("Sid"));
            info.setsex(rs.getString("Ssex"));
            info.settelephone(rs.getString("Stel"));
            //info.setgrade(rs.getString("Sgrade"));
            String sgrade = Double.toString(rs.getDouble("Sgrade"));
            info.setgrade(sgrade);
            Info.add(info);
        } 
        return Info;
    }
    
    @Override
  
    public ArrayList selectinfoReverseorder() throws Exception {
        ArrayList Info = new ArrayList();
        Connection conn = db.getConn();
        PreparedStatement prest = null;
        ResultSet rs = null;
        String sql = "select * from FXYEnroll order by Sgrade desc";
        prest = db.getprep(conn, sql);
        rs = prest.executeQuery();
        while(rs.next()){
            Studentinfo info = new Studentinfo();
            info.setUserid(rs.getString("Sno"));
            info.setname(rs.getString("Sname"));
            info.setnum(rs.getString("Sid"));
            info.setsex(rs.getString("Ssex"));
            info.settelephone(rs.getString("Stel"));
            info.setlocation(rs.getString("Saddress"));
            info.setGschool(rs.getString("Sgschool"));
            info.setGgrade(rs.getString("Sggrade"));
            info.setStateid(rs.getString("Sstate_id"));
            info.setPassword(rs.getString("Spassword"));
            info.setFatherjob(rs.getString("Pjob1"));
            info.setMotherjob(rs.getString("Pjob2"));
            info.setYear(rs.getString("Eyear"));
            String sgrade = Double.toString(rs.getDouble("Sgrade"));
            info.setgrade(sgrade);
            Info.add(info);
        } 
        return Info;
    }
    public void changestate(ArrayList Info) throws Exception {
    	ArrayList info = Info;
        Connection conn = db.getConn();
        String sql = "update FXYEnroll set Sstate_id=2 where Sno=?";
        PreparedStatement prest = db.getprep(conn, sql);
        for(int i=0;i<Info.size();i++){  
        	Studentinfo info2 = (Studentinfo) info.get(i);
            prest.setString(1,info2.getUserid());
            prest.executeUpdate();
        }
    }
    
    public void setstate1(ArrayList Info)throws Exception{
    	ArrayList info = Info;
        Connection conn = db.getConn();
        String sql = "update FXYEnroll set Sstate_id=3 where Sno=?";
        PreparedStatement prest = db.getprep(conn, sql);
        for(int i=0;i<Info.size();i++){  
        	Studentinfo info2 = (Studentinfo) info.get(i);
            prest.setString(1,info2.getUserid());
            prest.executeUpdate();
        }
    }
    
    public void setstate2(ArrayList Info)throws Exception{
    	ArrayList info = Info;
        Connection conn = db.getConn();
        String sql = "update FXYEnroll set Sstate_id=4 where Sno=?";
        PreparedStatement prest = db.getprep(conn, sql);
        for(int i=0;i<Info.size();i++){  
        	Studentinfo info2 = (Studentinfo) info.get(i);
            prest.setString(1,info2.getUserid());
            prest.executeUpdate();
        }
    }
    
    public void setstate3(ArrayList Info)throws Exception{
    	ArrayList info = Info;
        Connection conn = db.getConn();
        String sql = "update FXYEnroll set Sstate_id=5 where Sno=?";
        PreparedStatement prest = db.getprep(conn, sql);
        for(int i=0;i<Info.size();i++){  
        	Studentinfo info2 = (Studentinfo) info.get(i);
            prest.setString(1,info2.getUserid());
            prest.executeUpdate();
        }
    }
    
    public void setstate4(ArrayList Info)throws Exception{
    	ArrayList info = Info;
        Connection conn = db.getConn();
        String sql = "update FXYEnroll set Sstate_id=6 where Sno=?";
        PreparedStatement prest = db.getprep(conn, sql);
        for(int i=0;i<Info.size();i++){  
        	Studentinfo info2 = (Studentinfo) info.get(i);
            prest.setString(1,info2.getUserid());
            prest.executeUpdate();
        }
    }
    @Override

    public ArrayList selectinfoseparate(ArrayList Info) throws Exception {
        ArrayList Info2 = (ArrayList) Info.get(0);
        ArrayList Info3 = (ArrayList) Info.get(1);
        Connection conn = db.getConn();
        PreparedStatement prest = null;
        ResultSet rs = null;
        String sql = "select Sno,Sname,Sid,"
        		+ "Ssex,Stel,Saddress,Sgschool,Sggrade,Sstate_id,"
        		+ "Spassword,Pjob1,Pjob2,Eyear,Sgrade,Sensure from "
        		+ "FXYEnroll order by Sgrade desc";
        prest = db.getprep(conn, sql);
        rs = prest.executeQuery();
        int i = 0;
        while(rs.next()){
        	
            if(i<30) {
                Studentinfo info = new Studentinfo();
                info.setUserid(rs.getString("Sno"));
                info.setname(rs.getString("Sname"));
                info.setnum(rs.getString("Sid"));
                info.setsex(rs.getString("Ssex"));
                info.settelephone(rs.getString("Stel"));
                info.setlocation(rs.getString("Saddress"));
                info.setGschool(rs.getString("Sgschool"));
                info.setGgrade(rs.getString("Sggrade"));
                info.setStateid(rs.getString("Sstate_id"));
                info.setPassword(rs.getString("Spassword"));
                info.setFatherjob(rs.getString("Pjob1"));
                info.setMotherjob(rs.getString("Pjob2"));
                info.setYear(rs.getString("Eyear"));
                String sgrade = Double.toString(rs.getDouble("Sgrade"));
                info.setgrade(sgrade);
                info.setParentstate(rs.getString("Sensure"));
                Info2.add(info);
            }
            else{
                Studentinfo info = new Studentinfo();
                info.setUserid(rs.getString("Sno"));
                info.setname(rs.getString("Sname"));
                info.setnum(rs.getString("Sid"));
                info.setsex(rs.getString("Ssex"));
                info.settelephone(rs.getString("Stel"));
                info.setlocation(rs.getString("Saddress"));
                info.setGschool(rs.getString("Sgschool"));
                info.setGgrade(rs.getString("Sggrade"));
                info.setStateid(rs.getString("Sstate_id"));
                info.setPassword(rs.getString("Spassword"));
                info.setFatherjob(rs.getString("Pjob1"));
                info.setMotherjob(rs.getString("Pjob2"));
                info.setYear(rs.getString("Eyear"));
                String sgrade = Double.toString(rs.getDouble("Sgrade"));
                info.setgrade(sgrade);
                info.setParentstate(rs.getString("Sensure"));
                Info3.add(info);
            }
            i++;
        }
        ArrayList Info4 = new ArrayList();
        Info4.add(Info2);
        Info4.add(Info3);
        return Info4;
    }   
    
    public ArrayList selectinfoseparate2() throws Exception {
        ArrayList Info2 = new ArrayList();
        Connection conn = db.getConn();
        PreparedStatement prest = null;
        ResultSet rs = null;
        String sql = "select FXYEnrolled.Sno,Sname,Sid,Ssex,Stel,Sgrade,Sclassnum,Sclass_id from FXYEnrolled ,FXYCassfication where FXYEnrolled.Sno=FXYCassfication.Sno";
        prest = db.getprep(conn, sql);
        rs = prest.executeQuery();
        int i = 0;
        while(rs.next()){
                Studentinfo info = new Studentinfo();
                info.setUserid(rs.getString("Sno"));
                info.setname(rs.getString("Sname"));
                info.setnum(rs.getString("Sid"));
                info.setsex(rs.getString("Ssex"));
                info.settelephone(rs.getString("Stel"));
                String sgrade = Double.toString(rs.getDouble("Sgrade"));
                info.setgrade(sgrade);
                info.setclass_num(rs.getString("Sclassnum"));
                info.setclass_id(rs.getString("Sclass_id"));
                Info2.add(info);
                i++;
        }
      return Info2;
    }   
    
    public void addintoclasstable(ArrayList info2) throws Exception{
    	ArrayList Info = info2;
    	Connection conn = db.getConn();
    	String sql = "insert into FXYCassfication(Sno) values(?)";
        PreparedStatement prest = db.getprep(conn, sql);
        for (int i=0;i<Info.size();i++) {
        	Studentinfo info = (Studentinfo) Info.get(i);
            prest.setString(1,info.getUserid());
            prest.executeUpdate();
        }
    }
    
  
    public void distribution(ArrayList Info,Plan plan) throws Exception {
        String Eyear = plan.getYear();
        int eyear=Integer.parseInt(Eyear)-2000;
        Connection conn = db.getConn();
        String sql = "update FXYCassfication set Sclassnum=?,Sclass=?,Sclass_id=? where Sno=?";
        PreparedStatement prest = db.getprep(conn, sql);
        int k = Info.size()/5,j = 1,m = 1;
        for (int i=0;i<Info.size();i++,m++) {
            if (m>=k){
                j++;
                m=1;
            }
            Studentinfo info = (Studentinfo) Info.get(i);
            prest.setString(1, String.valueOf(m));
            prest.setString(2, String.valueOf(m)+"°à");
            if(m>=10){
                if(j>=10){
                    prest.setString(3,String.format("%d%s%s",eyear,String.valueOf(m),String.valueOf(j)));
                }
                prest.setString(3, String.format("%d%s%s",eyear,String.valueOf(m),'0'+String.valueOf(j)));
            }
            if(j>=10){
                prest.setString(3, String.format("%d%s%s",eyear,'0'+String.valueOf(m),String.valueOf(j)));
            }
            prest.setString(3, String.format("%d%s%s",eyear,'0'+String.valueOf(m),'0'+String.valueOf(j)));
            prest.setString(4,info.getUserid());
            prest.executeUpdate();
        }
        return;
    }

   
    @Override
    public void addgrades(Studentinfo studentinfo) throws Exception {
        Studentinfo info = studentinfo;
        String[] grades = info.getgrades();
        String[] userids = info.getuserids();
        Connection conn = db.getConn();
        String sql = "UPDATE FXYEnroll SET Sgrade=? WHERE Sno=?";
        PreparedStatement prest = db.getprep(conn, sql);
        for(int i=0;i<userids.length;i++){
           // prest.setString(1, grades[i])
        	double dgrade = Double.parseDouble(grades[i]);
            prest.setDouble(1,dgrade);
            prest.setString(2, userids[i]);
            prest.executeUpdate();
        }
        return;
    }

    @Override
 
    public void changeclass(Studentinfo studentinfo) throws Exception {
        Studentinfo info = studentinfo;
        Connection conn = db.getConn();
        String sql = "UPDATE FXYCassfication SET Sclass=?,Sclassnum=? WHERE Sno=?";
        PreparedStatement prest = db.getprep(conn, sql);
        prest.setString(1, info.getclass_num()+"°à");
        prest.setString(2, info.getclass_num());
        prest.setString(3, info.getUserid());
        prest.executeUpdate();
        return;
    }
    
    @Override
    public void cleargrades(Studentinfo studentinfo) throws Exception {
        Studentinfo info = studentinfo;
        String[] userids = info.getuserids();
        Connection conn = db.getConn();
        String sql = "UPDATE FXYEnroll SET Sgrade=0 WHERE Sno=?";
        PreparedStatement prest = db.getprep(conn, sql);
        for(int i=0;i<userids.length;i++){
            prest.setString(1, userids[i]);
            prest.executeUpdate();
        }
        return;
    }

    @Override
    public void changegrades(Studentinfo studentinfo) throws Exception {
        Studentinfo info = studentinfo;
        String[] userids = info.getuserids();
        Connection conn = db.getConn();
        String sql = "UPDATE FXYEnroll SET Sgrade=100 WHERE Sno=?";
        PreparedStatement prest = db.getprep(conn, sql);
        for(int i=0;i<userids.length;i++){
            prest.setString(1, userids[i]);
            prest.executeUpdate();
        }
        return;
    }

    @Override

    public void addvalue(ArrayList Info) throws Exception {
        Connection conn = db.getConn();
        String sql = "insert into FXYEnrolled (Sno,Sname,Sid,Ssex,Stel,Saddress,Sgschool,"
        		+ "Sggrade,Sstate_id,Spassword,Pjob1,Pjob2,Eyear,Sgrade) "
        		+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement prest = db.getprep(conn, sql);
        for (int i=0;i<Info.size()&&i<30;i++) {
            Studentinfo info = (Studentinfo) Info.get(i);
            info.setStateid("5");
            prest.setString(1,info.getUserid());
            prest.setString(2,info.getname());
            prest.setString(3,info.getnum());
            prest.setString(4,info.getsex());
            prest.setString(5,info.gettelephone());
            prest.setString(6,info.getlocation());
            prest.setString(7, info.getGschool());
            prest.setString(8, info.getGgrade());
            prest.setString(9, info.getStateid());
            prest.setString(10, info.getPassword());
            prest.setString(11, info.getFatherjob());
            prest.setString(12, info.getMotherjob());
            prest.setString(13, info.getYear());
            double dgrade = Double.parseDouble(info.getgrade());
            prest.setDouble(14,dgrade);
            prest.executeUpdate();
        }
        return;
    }
    
    @Override

    public Studentinfo selectsingleinfo(Studentinfo studentinfo) throws Exception {
        Studentinfo info = studentinfo;
        Connection conn = db.getConn();
        PreparedStatement prest = null;
        ResultSet rs = null;
        String sql = "select FXYEnroll.Sno,FXYEnroll.Sname,FXYEnroll.Sid,"
        		+ "FXYEnroll.Ssex,FXYEnroll.Stel,"
        		+ "FXYEnroll.Saddress,FXYEnroll.Sgschool,"
        		+ "FXYEnroll.Sggrade,FXYEnroll.Spassword,FXYEnroll.Pjob1,"
        		+ "FXYEnroll.Pjob2,FXYEnroll.Sgrade,Sclass_id,Sclass,State,"
        		+ "Sboard,Sbus from FXYEnroll,FXYEnrolled,FXYCassfication,"
        		+ "FXYState where FXYEnroll.Sno=FXYEnrolled.Sno and "
        		+ "FXYEnroll.Sno= FXYCassfication.Sno and "
        		+ "FXYEnroll.Sstate_id=FXYState.Sstate_id and FXYEnroll.Sno=?";
        prest = db.getprep(conn, sql);
        prest.setString(1, info.getUserid());
        rs = prest.executeQuery();
        while(rs.next()){
        	 info.setUserid(rs.getString("Sno"));
        	 info.setclass_id(rs.getString("Sclass_id"));
             info.setname(rs.getString("Sname"));
             info.setnum(rs.getString("Sid"));
             info.setsex(rs.getString("Ssex"));
             info.settelephone(rs.getString("Stel"));
             info.setlocation(rs.getString("Saddress"));
             info.setGschool(rs.getString("Sgschool"));
             info.setGgrade(rs.getString("Sggrade"));
             info.setStateid(rs.getString("State"));
             info.setPassword(rs.getString("Spassword"));
             info.setFatherjob(rs.getString("Pjob1"));
             info.setMotherjob(rs.getString("Pjob2"));
             info.setroom(rs.getString("Sboard"));
             info.setcar(rs.getString("Sbus"));
             info.setClassroom(rs.getString("Sclass"));
             String sgrade = Double.toString(rs.getDouble("Sgrade"));
             info.setgrade(sgrade);
        }
        return info;
    }
    @Override
    public ArrayList selectcarinfo() throws Exception {
        ArrayList Info = new ArrayList();
        Connection conn = db.getConn();
        PreparedStatement prest = null;
        ResultSet rs = null;
        String sql = "select FXYEnrolled.Sno,Sname,Ssex,"
        		+ "Sid,Stel,Saddress,Sbus,Sclass_id from "
        		+ "FXYEnrolled,FXYCassfication where FXYEnrolled.Sno=FXYCassfication.Sno and Sbus is not null";
        prest = db.getprep(conn, sql);
        rs = prest.executeQuery();
        while(rs.next()){
            if(rs.getString("Sbus").equals("ÊÇ")) {
                Studentinfo info = new Studentinfo();
                info.setUserid(rs.getString("Sno"));
                info.setname(rs.getString("Sname"));
                info.setsex(rs.getString("Ssex"));
                info.setnum(rs.getString("Sid"));
                info.settelephone(rs.getString("Stel"));
                info.setclass_id(rs.getString("Sclass_id"));
                info.setlocation(rs.getString("Saddress"));
                Info.add(info);
            }
        }

        return Info;
    }

    @Override
    public ArrayList selectroominfo() throws Exception {
        ArrayList Info = new ArrayList();
        Connection conn = db.getConn();
        PreparedStatement prest = null;
        ResultSet rs = null;
        String sql = "select FXYEnrolled.Sno,Sname,Ssex,"
        		+ "Sid,Stel,Saddress,Sboard,Sclass_id from "
        		+ "FXYEnrolled,FXYCassfication where FXYEnrolled.Sno=FXYCassfication.Sno and Sboard is not null";
        prest = db.getprep(conn, sql);
        rs = prest.executeQuery();
        while(rs.next()){
            if(rs.getString("Sboard").equals("ÊÇ")){
                Studentinfo info = new Studentinfo();
                info.setUserid(rs.getString("Sno"));
                info.setname(rs.getString("Sname"));
                info.setsex(rs.getString("Ssex"));
                info.setnum(rs.getString("Sid"));
                info.settelephone(rs.getString("Stel"));
                info.setclass_id(rs.getString("Sclass_id"));
                info.setlocation(rs.getString("Saddress"));
                Info.add(info);
            }
        }

        return Info;
    }

    @Override
    public void addbyrelationship(Studentinfo studentinfo) throws Exception {
        Connection conn = db.getConn();
        String sql = "insert into FXYEnrolled (Sno,Sname,Sid,Ssex,Stel,Eyear) values (?,?,?,?,?,?)";
        PreparedStatement prest = db.getprep(conn, sql);
        prest.setString(1, studentinfo.getUserid());
        prest.setString(2, studentinfo.getname());
        prest.setString(3, studentinfo.getnum());
        prest.setString(4, studentinfo.getsex());
        prest.setString(5, studentinfo.gettelephone());
        prest.setString(6, studentinfo.getYear());
        prest.executeUpdate();
        return;
    }

    public void addclassbyrelationship(Studentinfo studentinfo)throws Exception {
        Connection conn = db.getConn();
        String sql = "insert into FXYCassfication (Sno,Sclassnum,Sclass) values (?,?,?)";
        PreparedStatement prest = db.getprep(conn, sql);
        prest.setString(1, studentinfo.getUserid());
        prest.setString(2, studentinfo.getclass_num());
        prest.setString(3, studentinfo.getclass_num()+"°à");
        prest.executeUpdate();
        return;
    }
    public ArrayList selectclassinfo(String classnum) throws Exception {
        ArrayList Info = new ArrayList();
        Connection conn = db.getConn();
        PreparedStatement prest = null;
        ResultSet rs = null;
        String sql = "select FXYEnrolled.Sno,Sclassnum,FXYPlan.Eyear "
        		+ "from FXYEnrolled,FXYCassfication,FXYPlan "
        		+ "where FXYEnrolled.Eyear=FXYPlan.Eyear and "
        		+ "FXYEnrolled.Sno=FXYCassfication.Sno and Sclassnum=?";
        prest = db.getprep(conn, sql);
        prest.setString(1, classnum);
        rs = prest.executeQuery();
        while(rs.next()){
            Studentinfo info = new Studentinfo();
            info.setUserid(rs.getString("Sno"));
            info.setclass_num(rs.getString("Sclassnum"));
            info.setYear(rs.getString("Eyear"));
            Info.add(info);   
        }
        return Info;
    }


    public void changeclassid(ArrayList Info) throws Exception {
    	Connection conn = db.getConn();
        String sql = "UPDATE FXYCassfication SET Sclass_id=? WHERE Sno=?";
        PreparedStatement prest = db.getprep(conn, sql);
        Studentinfo infoe = (Studentinfo) Info.get(0);
        String Eyear = infoe.getYear();
        int eyear = Integer.parseInt(Eyear)-2000;
        System.out.println(eyear);
        for (int i=0;i<Info.size();i++) {
            Studentinfo info = (Studentinfo) Info.get(i);
            if(Integer.parseInt(info.getclass_num().trim())>=10) {
                if(i>=10){                	
                    prest.setString(1,String.format("%d%s%s",eyear,info.getclass_num().trim(),String.valueOf(i+1)));
                } else {         	
                    prest.setString(1, String.format("%d%s%s",eyear,info.getclass_num().trim(),'0'+String.valueOf(i+1)));
                }
            }
            if(i>=10){
                prest.setString(1, String.format("%d%s%s",eyear,'0'+info.getclass_num().trim(),String.valueOf(i+1)));
            } else {
            	String a=String.format("%d%s%s",eyear,'0'+info.getclass_num().trim(),'0'+String.valueOf(i+1));
                prest.setString(1, String.format("%d%s%s",eyear,'0'+info.getclass_num().trim(),'0'+String.valueOf(i+1)));
            }
            prest.setString(2, info.getUserid());
            prest.executeUpdate();
        }
        return;
    }
}