package pt2_ch07;

public class UserInfo {

	public String userId;
	public String userPassword;
	public String userName;
	public String userAddress;
	public String userNumber;
	
	public UserInfo(String userId, String userPassword, String userName) {
		this.userId = userId; 
		this.userPassword = userPassword;
		this.userName = userName;
	}
	
	public String showUserInfo() {
		return userName+"사용자의id는"+userId+" p/w는"+userPassword+"입니다" ;
	}
}
