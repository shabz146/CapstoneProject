package tek.sdet.framework.pages;

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
	
	@FindBy(id="cartQuantity")
	public WebElement cartQuantity;
	
	@FindBy(xpath="//img[@class=\"image\"]")
	public WebElement itemPlug;
	
	
	
  






}