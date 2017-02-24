package visiterdao;

import userentity.Visiter;

public interface VisiterDao {
	
	boolean addemp(Visiter visiter) throws Exception;
	Visiter getyear() throws Exception;
}
