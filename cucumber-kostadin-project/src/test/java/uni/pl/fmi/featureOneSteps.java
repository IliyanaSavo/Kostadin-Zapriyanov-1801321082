package uni.pl.fmi;

import static org.junit.Assert.assertEquals;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pl.fmi.models.BuyProductModel;

public class featureOneSteps {
	
	BuyProductModel buyProductModel = new BuyProductModel();
	
	@Given("^������������ ������ ������ � ��������$")
	public void OpenScreen () throws Throwable {
	    buyProductModel.navigateToMe();
	}

	@When("^���������� �� �������� �� ��� ��������$")
	public void AddArts (String arts) throws Throwable {
	    buyProductModel.setArts(arts);
	}

	@When("^�������� ������� �� �������$")
	public void startOrder (String startOrder) throws Throwable {
	    buyProductModel.setStartOrder(startOrder);
	}

	@When("^������� �����$")
	public void enterNames (String enterNames) throws Throwable {
	    buyProductModel.setEnterNames(enterNames);
	}

	@When("^������� �����$")
	public void enterAdress (String enterAdress) throws Throwable {
	    buyProductModel.setEnterAdress(enterAdress);
	}

	@When("^������� ��������� �����$")
	public void enterPhone (String enterPhone) throws Throwable {
	    buyProductModel.setEnterPhone(enterPhone);
	}

	@When("^������ ����� �� �������$")
	public void clickPaymentMethod() throws Throwable {
	    buyProductModel.clickPaymentMethod();
	}

	@Then("^������� �� ������������� ���������$")
	public void acceptedOrder (String expectedMessage) throws Throwable {
	    assertEquals(expectedMessage, buyProductModel.getDisplaysMessage());
	}
    
}
