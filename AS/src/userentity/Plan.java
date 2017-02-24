package userentity;

/**
 * Created by zpc on 2016/12/5.
 */
public class Plan {
    private String number;
    private String sign_up_time;
    private String ask_time;
    private String telephone;
    private String fee;
    private String class_number;
    public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	private String year;
    public String getnumber() {
        return number;
    }
    public void setnumber(String number) {
        this.number = number;
    }
    public String getsign_up_time() {
        return sign_up_time;
    }
    public void setsign_up_time(String sign_up_time) {
        this.sign_up_time = sign_up_time;
    }
    public String getask_time() {
        return ask_time;
    }
    public void setask_time(String ask_time) {
        this.ask_time = ask_time;
    }
    public String gettelephone() {
        return telephone;
    }
    public void settelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getfee() {
        return fee;
    }
    public void setfee(String fee) {
        this.fee = fee;
    }
    public String getclassnumber() { return class_number; }
    public void setclassnumber(String class_number) {
        this.class_number = class_number;
    }
}
