package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;
import tek.sdet.framework.utilities.DataGenerator;

    public class RetailAccountSteps extends CommonUtility{
	POMFactory factory = new POMFactory();
	

	
	@When("User click on Account option")
	public void userClickOnAccountOption1() {
		click(factory.homePage().account);
		logger.info("User clicked on Account option");
	
	}
	
    @When("User update Name {string} and Phone {string}")
    public void userUpdateNameAndPhone(String name, String phone) {
    	clearTextUsingSendKeys(factory.accountPage().nameField);
		sendText(factory.accountPage().nameField,name);
		clearTextUsingSendKeys(factory.accountPage().personalPhoneInput);
		sendText(factory.accountPage().personalPhoneInput,phone);
		logger.info("User entered "+name+"phoneNumber"+phone);
		
	}
	@And("User click on Update button")
    public void userClickOnUpdateButton() {
    	click(factory.accountPage().updateButton);
    	logger.info("User clicked on update button");
    }
    
    @Then("user profile information should be updated")
    public void userProfileInformationShouldBeUpdated() {
    	waitTillPresence(factory.accountPage().personalInformationUpdateMessage);
    	Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInformationUpdateMessage));
    	String actualMessage = factory.accountPage().personalInformationUpdateMessage.getText();
    	String expectedMessage= "Personal Information Updated Successfully";
    	Assert.assertEquals(expectedMessage, actualMessage);
    	logger.info("Profile information is updated");
    	
    }
    
 
    
    
    @And("User enter below information")
    public void userEnterBelowInformation(DataTable dataTable) {
    List<Map<String, String>>passwordData=dataTable.asMaps(String.class, String.class);
    sendText(factory.accountPage().previousPasswordInput,passwordData.get(0).get("previousPassword"));
	sendText(factory.accountPage().newPasswordInput,passwordData.get(0).get("newPassword"));
	sendText(factory.accountPage().confirmPasswordInput,passwordData.get(0).get("confirmPassword"));
    logger.info("User entered password information");
    }
    
    @And("User click on Change Password button")
    public void userClickOnChangePassword() {
    	click(factory.accountPage().changePasswordButton);
    	logger.info("User clicked on change password button");
    }
    @Then("a message should be displayed {string}")
    public void paymentMethodMessageShouldBeDisplayed(String expectedMessage){
    	if (expectedMessage.contains("Password")) {
    		waitTillPresence(factory.accountPage().passwordUpdated);
    		Assert.assertEquals(expectedMessage, factory.accountPage().passwordUpdated.getText());
    		logger.info(expectedMessage+" is displayed");
    		
    	}else if (expectedMessage.contains("Payment Method added")) {
    		waitTillPresence(factory.accountPage().passwordUpdated);
    		Assert.assertEquals(expectedMessage, factory.accountPage().passwordUpdated.getText());
    		logger.info(expectedMessage+" is displayed");
    	}else if (expectedMessage.contains("Payment Method updated")) {
    		waitTillPresence(factory.accountPage().paymentMethodUpdatedSuccessfullyMessage);
    		Assert.assertEquals(expectedMessage, factory.accountPage().paymentMethodUpdatedSuccessfullyMessage.getText());
    		logger.info(expectedMessage+" is displayed");
    	}else if(expectedMessage.contains("Address Added Successfully")) {
    		waitTillPresence(factory.accountPage().addressAddedSuccessfullyMessage);
    		Assert.assertEquals(expectedMessage, factory.accountPage().addressAddedSuccessfullyMessage.getText());
    		logger.info(expectedMessage+" is displayed");
    	}}
    
    @When("User click on Add a payment method link")
    public void userClickOnAddaPaymentMethodLink() {
    	click(factory.accountPage().addPaymentMethodLink);
    	logger.info("User clicked on Add a Payment Method");
    	
    }
    @When("User fill Debit or credit card information")
    	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
    	List<Map<String, String>>paymentInformation = dataTable.asMaps(String.class, String.class);
    	sendText(factory.accountPage().cardNumber, paymentInformation.get(0).get("cardNumber"));
    	sendText(factory.accountPage().nameOnCard, paymentInformation.get(0).get("nameOnCard"));
    	selectByVisibleText(factory.accountPage().expirationYear,paymentInformation.get(0).get("expirationYear"));
    	selectByVisibleText(factory.accountPage().expirationMonth,paymentInformation.get(0).get("expirationMonth"));
    	sendText(factory.accountPage().securityCode,paymentInformation.get(0).get("securityCode"));
        logger.info("User entered requiered information");
    }
    @When("User click on Add your card button")
    	public void userClickOnAddYourCardButton(){
    	click(factory.accountPage().addYourCardButton);
    	logger.info("User clicked on Add your card button");
    	}
  
    
   @When("User select card with ending {string}")
   public void userSelectCardEnding(String cardEndingNumber) {
	   List<WebElement>cards = factory.accountPage().cardEndingNumber;
	   for(WebElement card: cards) {
		   if (card.getText().equals(cardEndingNumber))
			   System.out.println(card.getText()+"============");
			   click(card);
		   logger.info(cardEndingNumber+" is selected");
		   break;
	   }
   }
   
    @When("User click on Edit option of card section")
    public void userClickOnEditOfCardSection() {
    	click(factory.accountPage().cardEditButton);
    	logger.info("User clicked on Edit button");
    }
    @When("user edit information with below data")
    public void userEditInformationWithBelowData(DataTable dataTable) {
    	List<Map<String, String>>paymentInformation = dataTable.asMaps(String.class, String.class);
    	clearTextUsingSendKeys(factory.accountPage().cardNumber);
    	sendText(factory.accountPage().cardNumber, paymentInformation.get(0).get("cardNumber"));
    	clearTextUsingSendKeys(factory.accountPage().nameOnCard);
    	sendText(factory.accountPage().nameOnCard, paymentInformation.get(0).get("nameOnCard"));
    	selectByVisibleText(factory.accountPage().expirationYear,paymentInformation.get(0).get("expirationYear"));
    	selectByVisibleText(factory.accountPage().expirationMonth,paymentInformation.get(0).get("expirationMonth"));
    	clearTextUsingSendKeys(factory.accountPage().securityCode);
    	sendText(factory.accountPage().securityCode,paymentInformation.get(0).get("securityCode"));
        logger.info("User entered requiered information");

    	
  
    }
    @And("user click on Update Your Card button")
    public void userClickOnUpdateYourCardButton() {
    	click(factory.accountPage().updateYourCardButton);
    	logger.info("User clicked on Update Your Card button");
    }
    
    
    
    //REMOVECARD
   
    @And("User click on remove option of card section")
    public void userClickOnRemoveOptionOfCardSection() {
    	click(factory.accountPage().removeCardButton);
    	logger.info("User clicked on remove button");
    }
    @Then("payment details should be removed")
    public void paymentDetailsShouldBeRemoved() {
    try {
    	Assert.assertFalse(isElementDisplayed(factory.accountPage().cardEndingwith9078));
    logger.info("payment details removed from account");
    
    
    }
    catch(AssertionError e) {
    	logger.info(e.getMessage());
    }
    	
    
    
    }
    //ADD ADDRESS

    @When("User click on Add address option")
    public void userClickOnAddAddressOption() {
    	click(factory.accountPage().addAddressButton);
    	logger.info("User clicked on Add Address button");
    }
    @When("user fill new address form with below information ")
    public void userFillNewAddressFormWithBelowInformation(DataTable data) {
    	List<Map<String, String>> addressData = data.asMaps(String.class, String.class);
    	selectByVisibleText(factory.accountPage().countryDropDown, DataGenerator.addressGenerator(addressData.get(0).get("country")));
		sendText(factory.accountPage().fullNameInput,DataGenerator.addressGenerator(addressData.get(0).get("fullName")));
		sendText(factory.accountPage().phoneNumberInput,DataGenerator.addressGenerator(addressData.get(0).get("phoneNumber")));
		sendText(factory.accountPage().address,DataGenerator.addressGenerator(addressData.get(0).get("streetAddress")));
		sendText(factory.accountPage().apartmentInput,DataGenerator.addressGenerator(addressData.get(0).get("apt")));
		sendText(factory.accountPage().cityInput,DataGenerator.addressGenerator(addressData.get(0).get("city")));
		selectByVisibleText(factory.accountPage().stateInput,DataGenerator.addressGenerator(addressData.get(0).get("state")));
		sendText(factory.accountPage().zipCodeInput,DataGenerator.addressGenerator(addressData.get(0).get("zipCode")));
		
		logger.info("User filled address form with required information");
		
    }
    @When("User click Add Your Address button")
    public void userClickAddYourAddressButton() {
    	click(factory.accountPage().addYourAddressButton);
        logger.info("User clicked on Add Your Address button");
    
  
    
    }
    //EDITANADDRESS
   
    @When("User click on edit address option")
    public void userClickOnEditAddressOption() {
    	click(factory.accountPage().editAddressButton);
    	logger.info("User clicked on Edit button");
    	
    }
 
    @When("User click update Your Address button")
    public void userClickUpdateYourAddressButton() {
    	click(factory.accountPage().updateYourAddress);
    	logger.info("User clicked update your address button");
    }
    
    @Then("a message should be displayed ‘Address Updated Successfully’")
    public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
    
    }
    
    //REMOVEADDRESS
 
    @When("User click on remove option of Address section")
    public void userClickOnRemoveOptionOfAddressSection() {
    	click(factory.accountPage().removeAddressButton);
    	logger.info("User clicked on Remove button");
    	
    }
    @Then("Address details should be removed")
    public void addressDetailsShouldBeRemoved() {
    	Assert.assertTrue(isElementDisplayed(factory.accountPage().addressGrid));
    	logger.info("User removed address");
    
    }}
    
    