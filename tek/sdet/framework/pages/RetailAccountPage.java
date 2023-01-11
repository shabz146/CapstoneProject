package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {

    public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
@FindBy(id = "nameInput")
public WebElement nameField;

@FindBy(id = "personalPhoneInput")
public WebElement personalPhoneInput;

@FindBy(id = "emaiLlInput")
public WebElement emailInputField;

@FindBy(xpath="//button[text()='Update']")
public WebElement updateButton;

@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
public WebElement personalInformationUpdateMessage;

@FindBy(id="previousPasswordInput")
public WebElement previousPasswordInput;

@FindBy(id="newPasswordInput")
public WebElement newPasswordInput;

@FindBy(id="confirmPasswordInput")
public WebElement confirmPasswordInput;

@FindBy(xpath="//p[text()='Add a payment method']")
public WebElement addPaymentMethod;

@FindBy(id="credentialsSubmitBtn")
public WebElement changePasswordButton;

@FindBy(xpath="//div[text()='Password Updated Successfully']")
public WebElement passwordUpdated;

@FindBy(xpath="//p[text()='Add a payment method']")
public WebElement addPaymentMethodLink;

@FindBy(id="cardNumberInput")
public WebElement cardNumber;

@FindBy(id="nameOnCardInput")
public WebElement nameOnCard;

@ FindBy(id="expirationMonthInput")
public WebElement expirationMonth;

@FindBy(id="expirationYearInput")
public WebElement expirationYear;

@FindBy(id="securityCodeInput")
public WebElement securityCode;

@FindBy(id="paymentSubmitBtn")
public WebElement addYourCardButton;

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

@FindBy(xpath="//span[text()='Add to Cart']")
public WebElement addToCartButton;

@FindBy(xpath="//p[text()='Cart ']")
public WebElement cart;

@FindBy(xpath="//select[@name='country']//following-sibling::option[236]")
public WebElement country;

@FindBy(id="fullNameInput")
public WebElement fullNameInput;

@FindBy(id="phoneNumberInput")
public WebElement phoneNumberInput;

@FindBy(id="streetInput")
public WebElement address;

@FindBy(id="apartmentInput")
public WebElement apartmentInput;

@FindBy(id="cityInput")
public WebElement cityInput;

@FindBy(xpath="//select[@name='state']")
public WebElement selectState;

@FindBy(xpath="//select[@name='state']//following-sibling::option[55]")
public WebElement selectVirginia;

@FindBy(id="zipCodeInput")
public WebElement zipCodeInput;

@FindBy(id="addressBtn")
public WebElement addYourAddressButton;

@FindBy(xpath="//img[@alt='PlayStation 5 Console']")
public WebElement playStationItem;

@FindBy(id="contentHeader")
public WebElement shopByDepartment;

@FindBy(xpath="//div[text()='Payment Method added successfully']")
public WebElement paymentMethodAddedSuccessfullyMessage;

@FindBy(xpath="//div[@class='account__payment-selected account__payment-item']//p")
public List<WebElement> cardEndingNumber;

@FindBy(id="paymentSubmitBtn")
public WebElement updateYourCardButton;

@FindBy(xpath="//div[text()='Payment Method updated Successfully']")
public WebElement paymentMethodUpdatedSuccessfullyMessage;

@FindBy(xpath="//button[text()='remove']")
public WebElement removeCardButton;

@FindBy(xpath="//p[text()='Add Address']")
public WebElement addAddressButton;

@FindBy(xpath="//div[text()='Address Added Successfully']")
public WebElement addressAddedSuccessfullyMessage;

@FindBy(xpath="//button[text()='Edit']")
public WebElement editAddressButton;

@FindBy(id="addressBtn")
public WebElement updateYourAddress;

@FindBy(xpath="//button[text()='Remove']")
public WebElement removeAddressButton;

@FindBy(xpath="//div[@class='account__payment-new']")
public WebElement accountFormAccountPage;

@FindBy(xpath="//div[@class='account__address-grid']")
public WebElement addressGrid;

@FindBy(xpath="//button[text()='Edit']")
public WebElement cardEditButton;

@FindBy(xpath="//p[@class='account__payment__sub-text']")
public WebElement cardEndingwith9078;

@FindBy(id="countryDropdown")
public WebElement countryDropDown;

@FindBy(xpath="//select[@name='state']")
public WebElement stateInput;


@FindBy(xpath ="//div[text()='Address Updated Successfully']")
public WebElement addressUpdatedSuccessfullyMessage;

}
