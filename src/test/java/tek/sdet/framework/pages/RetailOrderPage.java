package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup{
	
	public RetailOrderPage() {
		
	}
	
	@FindBy(id="orderLink")
	public WebElement orderPageOption;
	
	@FindBy(xpath="//button[text()='Cancel The Order']")
	public WebElement CancelTheOrderButton;
	
	@FindBy(id="reasonInput")
	public WebElement reasonOption;
	
	@FindBy(xpath="//span[text()='Arriving']")
	public WebElement firstOrder;
	
	@FindBy(xpath="//button[@id='orderSubmitBtn']")
	public WebElement cancelOrder;
	
	@FindBy(xpath="//p[text()='Your Order Has Been Cancelled']")
	public WebElement cancelOrderMessage;

	@FindBy(id="returnBtn")
	public WebElement returnOption;
	
	@FindBy(id="dropOffInput")
	public WebElement dropOffInput;
	
	@FindBy(xpath="//button[@id='orderSubmitBtn']")
	public WebElement returnButton;
	
	@FindBy(xpath="//p[text()='Return was successfull']")
	public WebElement retutnOrderMessage;
	
	@FindBy(id="reviewBtn")
	public WebElement reviewButton;

	@FindBy(id="headlineInput")
	public WebElement headlineInput;
	
	@FindBy(id="descriptionInput")
	public WebElement descriptionInput;
	
	@FindBy(id="reviewSubmitBtn")
	public WebElement reviewSubmitBtn;
	
	@FindBy(xpath="//div[text()='Your review was added successfully']")
	public WebElement reviewPopup;
	
	
}


