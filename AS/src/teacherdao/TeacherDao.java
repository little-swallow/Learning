package teacherdao;

import userentity.Studentinfo;
import userentity.Plan;

import java.util.ArrayList;

public interface TeacherDao {

	void addplan(Plan plan) throws Exception;
	void addgrades(Studentinfo info) throws Exception;
	void changeclass(Studentinfo studentinfo) throws Exception;
	void cleargrades(Studentinfo studentinfo) throws Exception;
	void changegrades(Studentinfo studentinfo) throws Exception;
	void addvalue(ArrayList Info) throws Exception;
	void addbyrelationship(Studentinfo studentinfo) throws Exception;
	ArrayList selectinfo() throws Exception;
	ArrayList selectinfoReverseorder() throws Exception;
	ArrayList selectinfoseparate(ArrayList Info) throws Exception;
	void distribution(ArrayList Info,Plan plan) throws Exception;
	ArrayList selectcarinfo() throws Exception;
	ArrayList selectroominfo() throws Exception;
	Studentinfo selectsingleinfo(Studentinfo infos) throws Exception;
	void addintoclasstable(ArrayList Info) throws Exception;
	ArrayList selectinfoseparate2() throws Exception;
	Plan selectplaninfo() throws Exception;
    void changestate(ArrayList Info) throws Exception;
    void setstate1(ArrayList Info)throws Exception;
    void setstate2(ArrayList Info)throws Exception;
    void setstate3(ArrayList Info)throws Exception;
    void setstate4(ArrayList Info)throws Exception;
    void changeclassid(ArrayList Info) throws Exception;
    ArrayList selectclassinfo(String classnum) throws Exception;
    void addclassbyrelationship(Studentinfo studentinfo)throws Exception;
}