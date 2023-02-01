package n2s.ehc.surekha;

public class UserBean {

	private String userId;
	private String userName;
	private int optionValue;
	
	public UserBean(String userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getOptionValue() {
		return optionValue;
	}
	public void setOptionValue(int optionValue) {
		this.optionValue = optionValue;
	}
	@Override
	public String toString() {
		return "    "+ userId +"    " + userName ;
	}
	
}
