package uni.pl.fmi.models;

public class LoginScreenModel {

	private String username;
	private String password;
	private String message;

	public void navigateToMe() {
		System.out.println("Екранът на вход в системата е отворен");
		
	}

	public void setUsername(final String username) {
		this.username=username;
		
	}

	public void setPassword(String password) {
		this.password=password;
		
	}

	public void clickLoginButton() {
		
		
	}

	public String getLoginMessage() {
		
		return message;
	}

}
