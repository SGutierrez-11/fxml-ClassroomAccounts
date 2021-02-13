package model;

public class UserAccounts {

	private String userName;
	private String userPassword;
	private String userGender;
	private String userCareer;
	private String userBirthday;
	private String userBrowser;
	
	public UserAccounts(String name, String password, String gender, String career, String birthday, String browser) {
		userName=name;
		userPassword=password;
		userGender=gender;
		userCareer=career;
		userBirthday=birthday;
		userBrowser=browser;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getUserPassword() {
		return userPassword;
	}
	
	public String getUserGender() {
		return userGender;
	}
	
	public String getUserCareer() {
		return userCareer;
	}
	
	public String getUserBirthday() {
		return userBirthday;
	}
	
	public String getUserBrowser() {
		return userBrowser;
	}
	
	
}
