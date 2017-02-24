package userdao;

import java.util.ArrayList;

import userentity.User;

public interface UserDao {

	boolean logincheck(User user) throws Exception;
	boolean updatebyid(User user) throws Exception;
	User selectuserinfo(User user)throws Exception;
	User selectstate(User user)throws Exception;
	User selectclass(User user)throws Exception;
	void completedemand(User user) throws Exception;
	void makesure(User user) throws Exception;
}
