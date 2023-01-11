package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup{
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);

	}
	@FindBy(id="orderLink")
	public WebElement orders;

	@FindBy(xpath="//div[@class='order__item']")
	public WebElement firstOrder;

	@FindBy(id="cancelBtn")
	public WebElement cancelOrderButton;

	@FindBy(xpath="//select[@name='reason']//following-sibling::option[1]")
	public WebElement boughtWrongItem;

	@FindBy(xpath="//select[@id='reasonInput']//following-sibling::option[2]")
	public WebElement itemDamaged;


	@FindBy(xpath="//select[@name='dropOff']//following-sibling::option[2]")
	public WebElement dropOffFedex;

	@FindBy(id="orderSubmitBtn")
	public WebElement returnOrderButton;
	
	@FindBy(id="orderSubmitBtn")
	public WebElement cancelOrder1;
	
	@FindBy(xpath="//p[text()='Your Order Has Been Cancelled']")
	public WebElement yourOrderHasBeenCancelled;
	
	@FindBy(xpath="//div[@class='return__confirm-message']")
	public WebElement returnConfirmMessage;
	
	@FindBy(id="reviewBtn")
	public WebElement reviewButton;

	@FindBy(id="headlineInput")
	public WebElement addaHeadline;

	@FindBy(id="descriptionInput")
	public WebElement addaWritten;

	@FindBy(xpath="//div[text()='Your review was added successfully']")
	public WebElement reviewAddedMessage;

	@FindBy(id="reviewSubmitBtn")
	public WebElement addYourReview;
	
	@FindBy(xpath="//div[text()='Your review was added successfully']")
	public WebElement yourReviewWasAddedSuccessfully;
	
	@FindBy(id="placeOrderBtn")
	public WebElement placeYourOrder;
	
	@FindBy(xpath="//p[text()='Order Placed, Thanks']")
	public WebElement orderPlacedThanks;
	
	@FindBy(id ="reasonInput")
	public WebElement cancelationReasonDropDown;
	
	@FindBy(xpath="//button[@class='order__cancel-submit']")
	public WebElement CancelOrderButton;
	
	@FindBy(xpath = "//p[text()='Return was successfull']")
	public WebElement returnWasSuccessfullMessage;
	
	@FindBy(id ="dropOffInput")
	public WebElement dropOffDropDown;
	
	@FindBy(id = "headlineInput")
	public WebElement reviewHeadlineInput;
	
	@FindBy(id ="descriptionInput")
	public WebElement reviewDescriptionInput;
	
	@FindBy(id ="reviewSubmitBtn")
	public WebElement reviewSubmitButton;
	
	@FindBy(xpath = "//div[text()='Your review was added successfully']")
	public WebElement yourReviewWasAddedSuccessfullyMessage;
	


}

	

