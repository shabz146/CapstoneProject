package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {
	
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id = "email")
	public WebElement emailField;
	
	@FindBy(id="password")
	public WebElement passwordField;
	
	@FindBy(id="loginBtn")
	public WebElement loginButton;
	
	@FindBy(id="newAccountBtn")
    public WebElement newAccountButton;
	
	@FindBy(id="nameInput")
	public WebElement nameInput;
	
	@FindBy(id="emailInput")
	public WebElement emailInput;
	
	@FindBy(id="passwordInput")
	public WebElement passwordInput;
	
	@FindBy(id="confirmPasswordInput")
	public WebElement confirmPasswordInput;
	
	@FindBy(id="signupBtn")
	public WebElement signUpButton;
	
	@FindBy(id="profileImage")
	public WebElement profileImage;

	@FindBy(id="personalUpdateBtn")
    public WebElement update;

	@FindBy(name="phoneNumber")
	public WebElement phoneNumber;
	
	@FindBy(id="personalInformationForm")
	public WebElement profile;


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
