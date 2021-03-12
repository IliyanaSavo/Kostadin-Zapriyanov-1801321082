package uni.pl.fmi.services;

import java.util.ArrayList;
import java.util.List;

import uni.pl.fmi.User;

public class LoginService {

	public static String login(String username, String password) {
		if(username == null && password == null) {
			return "�������� ��� � ������";
		}
		
		if(username == null) {
			return "�������� ������������� ���";
		}
		
		if(password == null) {
			return "�������� ������";
		}
		
		
		List<User> users = getUsers();
		boolean isUserExist = users.stream().anyMatch(user -> 
		(user.getUsername().equals(username)
		&& user.getPassword().contentEquals(password)));
		
		return isUserExist?"OK":"������ ������������� �����";
	}
	
	public static List<User> getUsers(){
		User user = new User();
		user.setUsername("Kostadin");
		user.setPassword("Password222");
		ArrayList<User> users = new ArrayList<User>();
		users.add(user);
		return users;
	}

}
