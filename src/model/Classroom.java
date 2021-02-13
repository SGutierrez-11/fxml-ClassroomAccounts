package model;

import java.util.ArrayList;

public class Classroom {

	private ArrayList<UserAccounts> users;
	
	public Classroom() {
		users = new ArrayList<UserAccounts>();
	}
	
	public ArrayList<UserAccounts> getUsers(){
		return users;
	}
	
	public void addUser(String name, String password, String gender, String careers, String birthday, String browser){
        UserAccount userAccount = new UserAccount(name, password, gender, careers, birthday, browser);
        users.add(userAccount);
	}
	
}
