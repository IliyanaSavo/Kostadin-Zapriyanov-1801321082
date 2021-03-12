package uni.pl.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pl.fmi.models.LoginScreenModel;

public class LoginSteps {
	
	LoginScreenModel loginScreen = new LoginScreenModel(); 

@Given("^?Потребителят отваря екрана за вход в системата$")
public void openLoginScreen() throws Throwable {
	loginScreen.navigateToMe();
}

@When("^Потребителят въведе потребителското си име \"([^\"]*)\"$")
public void addUsername(final String username) throws Throwable {
	loginScreen.setUsername(username);
}

@When("^Въведе парола \"([^\"]*)\"$")
public void addPassword(final String password) throws Throwable {
     loginScreen.setPassword(password);
}

@When("^Натисне бутона за вход в системата$")
public void clickLoginButton() throws Throwable {
	loginScreen.clickLoginButton();
}

@Then("^Вижда съобщение \"([^\"]*)\"\\.$")
public void checkLoginMessage(String expectedMessage) throws Throwable {
    assertEquals(expectedMessage, loginScreen.getLoginMessage());
}

}
