package uni.pl.fmi.models;

import uni.pl.fmi.services.PayService;

public class BuyProductModel {

	private String arts;
	private String startOrder;
	private String enterNames;
	private String enterAdress;
	private String enterPhone;
	private Object expectedMessage;

	public void navigateToMe() {
		System.out.println("ѕотребител€т отвар€ екрана с продукти");
		
	}

	public void setArts(String arts) {
		this.arts = arts;
		
	}

	public void setStartOrder(String startOrder) {
		
		this.startOrder = startOrder;
		
	}

	public void setEnterNames(String enterNames) {
		
		this.enterNames = enterNames;
		
	}

	public void setEnterAdress(String enterAdress) {
		this.enterAdress = enterAdress;
		
	}

	public void setEnterPhone(String enterPhone) {
		this.enterPhone = enterPhone;
		
	}

	public void clickPaymentMethod() {
		
		 expectedMessage = PayService.orderInfo(arts, startOrder, enterNames, enterAdress, enterPhone);
		
	}

	public Object getDisplaysMessage() {
	
		return expectedMessage;
	}
	
	
	
	

	

}
