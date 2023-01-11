package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {

     public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);

	}

	@FindBy(id="signinLink")
	public WebElement signIn;
	
	@FindBy(id="accountLink")
	public WebElement account;
	
	@FindBy(name="name")
	public WebElement name;
	
	@FindBy(id="personalPhoneInput")
	public WebElement phoneNumber;
	
	@FindBy(id="hamburgerBtn")
	public WebElement all;
	
	@FindBy(id="search")
	public WebElement allDepartment;

	@FindBy(xpath="//a[@class='top-nav__logo active']")
	public WebElement logo;

	@FindBy(xpath="//div[@class='sidebar_content-item'])")
	public WebElement electronics;

	@FindBy(xpath="//div[@class='sidebar_content-item'])")
	public WebElement computers;

	@FindBy(xpath="//div[@class='sidebar_content-item'])")
	public WebElement smartHome;

	@FindBy(xpath="//div[@class='sidebar_content-item'])")
	public WebElement sports;

	@FindBy(xpath="//div[@class='sidebar_content-item'])")
	public WebElement automative;

	@FindBy(id="search")
	public WebElement department;

	@FindBy(id="searchInput")
	public WebElement searchField;

	@FindBy(id="searchBtn")
	public WebElement searchButton;
	
	@FindBy(xpath="//select[@id=\"search\"]//following-sibling::option[1]")
	public WebElement electronicsDepartment;
	
	@FindBy(xpath="//img[@class=\"image\"]")
	public WebElement itemPlug;
	
	@FindBy(xpath ="//img[@alt='PlayStation 5 Console']")
	public WebElement playStationItem;
	
	@FindBy(xpath = "//span[text()='All']") 
	public WebElement allElement;

	@FindBy(id="contentHeader")
	public WebElement shopByDepartment;
	
	@FindBy(id="cartBtn")
	public WebElement cart;
	
	@FindBy(xpath = "//div[@class='sidebar_content-item']/span")
	public List<WebElement> sideBar;
	
	@FindBy(xpath ="//p[@class='products__name']")
	public WebElement productNameItem;
	
	@FindBy(xpath ="//select[@class='product__select']")
	public WebElement quantitySelection;
	
	@FindBy(xpath="//span[text()='Add to Cart']")
	public WebElement addToCartButton;
	
	@FindBy(id="cartQuantity")
	public WebElement cartQuantity;
	
	@FindBy(id="proceedBtn")
	public WebElement proceedToCheckOut;
	
	@FindBy(id="addAddressBtn")
	public WebElement addAddressBtnCheckout;
	
	@FindBy(id="addPaymentBtn")
	public WebElement addPaymentBtnCheckout;
	
	@FindBy(id="placeOrderBtn")
	public WebElement placeOrderBtn;
	
	@FindBy(xpath = "//p[text()='Order Placed, Thanks']")
	public WebElement orderPlacedMessage;
	
	@FindBy(id="orderLink")
	public WebElement ordersOption;
	
	
	
	
  






}