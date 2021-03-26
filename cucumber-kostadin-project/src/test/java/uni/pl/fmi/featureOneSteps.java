package uni.pl.fmi;

import static org.junit.Assert.assertEquals;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pl.fmi.models.BuyProductModel;

public class featureOneSteps {
	
	BuyProductModel buyProductModel = new BuyProductModel();
	
	@Given("^Потребителят отваря екрана с продукти$")
	public void OpenScreen () throws Throwable {
	    buyProductModel.navigateToMe();
	}

	@When("^Възможност за добавяне на още артикули$")
	public void AddArts (String arts) throws Throwable {
	    buyProductModel.setArts(arts);
	}

	@When("^Стартира правене на поръчка$")
	public void startOrder (String startOrder) throws Throwable {
	    buyProductModel.setStartOrder(startOrder);
	}

	@When("^Въвежда имена$")
	public void enterNames (String enterNames) throws Throwable {
	    buyProductModel.setEnterNames(enterNames);
	}

	@When("^Въвежда адрес$")
	public void enterAdress (String enterAdress) throws Throwable {
	    buyProductModel.setEnterAdress(enterAdress);
	}

	@When("^Въвежда телефонен номер$")
	public void enterPhone (String enterPhone) throws Throwable {
	    buyProductModel.setEnterPhone(enterPhone);
	}

	@When("^Избира начин на плащане$")
	public void clickPaymentMethod() throws Throwable {
	    buyProductModel.clickPaymentMethod();
	}

	@Then("^Изписва се потвърдително съобщение$")
	public void acceptedOrder (String expectedMessage) throws Throwable {
	    assertEquals(expectedMessage, buyProductModel.getDisplaysMessage());
	}
    
}
