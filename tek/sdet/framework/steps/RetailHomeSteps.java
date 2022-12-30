package tek.sdet.framework.steps;

import org.junit.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailHomeSteps extends CommonUtility{
	POMFactory factory = new POMFactory();
	
	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().all);
		logger.info("All section is opened");
		
	}
@Then("below options are present in Shop by Department sidebar")
public void belowOptionsArePresentInShopByDepartmentSidebar() {
Assert.assertTrue(isElementDisplayed(factory.homePage().electronics));
Assert.assertTrue(isElementDisplayed(factory.homePage().computers));
Assert.assertTrue(isElementDisplayed(factory.homePage().smartHome));
Assert.assertTrue(isElementDisplayed(factory.homePage().sports));
Assert.assertTrue(isElementDisplayed(factory.homePage().automative));
logger.info("All section is displayed");
}

//SCENARIOOUTLINE
 @And(" User on <department>")
public void userIsOnDepartment() {
	 click(factory.homePage().department);
	 slowDown();
}
 
 @Then("below options are present in department |<optionOne>|<optionTwo>|")
 public void belowOptionsArePresentInDepartment() {
	 Assert.assertTrue(isElementDisplayed(factory.homePage().electronics));
	Assert.assertTrue(isElementDisplayed(factory.homePage().computers));
	logger.info("OptionOne and OptionTwo are present in department");
}
 
 
 //SCENARIoIFYUSERCANADDANITEMTO CART
 
 /*@And("User should be logged in into Account")
 public void userShouldBeLoggedInIntoAccount() {
	 Assert.assertTrue(isElementDisplayed(factory.homePage().account));
		logger.info("User logged into account");
		slowDown();
 }*/
 
 @And("User change the category to {string}")
 public void userChangeTheCategoryToSmartHome(String value) {
	 selectByVisibleText(factory.homePage().allDepartment,value);
	 logger.info(value+" was selected form the drop down");
 }
 @And("User search for an item {string}")
 public void userSearchForAnItem(String search) {
	 click(factory.homePage().searchField);
	 sendText(factory.homePage().searchField,search);
}
 
 @And("User click on Search icon")
 public void userClickOnSearchIcon() {
	 click(factory.homePage().searchButton);
 }
 @And("User click on item")
 public void userClickOnItem() {
	 click(factory.homePage().itemPlug);
	 logger.info("User clicked on kasa outdoor smart plug");
	 
 }
 @And("User select quantity ‘2’")
 public void userClickOnQuantity2() {
	 click(factory.cartPage().quantity2);
 
 logger.info("Quantity 2 is selected");
 }

	@And("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(factory.orderPage().placeYourOrder);
	
	}
	@Then("a message should be displayed ‘Order Placed, Thanks’")
	public void aMessageShouldBeDisplayedOrderPlacedThanks() {
		Assert.assertTrue(isElementDisplayed(factory.orderPage().orderPlacedThanks));
		logger.info("User placed the order successfully");
	
}



//SCENARIO USER CAN PLACE AN ORDER WITH SHIPPING ADDRESS
	@And("User change the category to 'Electronics")
	public void userChangeTheCategoryToElectronics() {
		click(factory.homePage().electronicsDepartment);
		logger.info("User selected Electronics category");
	
	}
	/*@And("User search for an item {string}")
	public void userSearchForAnItemApexLegends(String Apex) {
		click(factory.homePage().searchField);
		sendText(factory.homePage().searchField, Apex);
	logger.info("user search for Apex Legends");
	}*/
	@And("User select quantity ‘5’")
	public void userSelectQuantity5(){
		click(factory.cartPage().quantity5);
		logger.info("Quantity 5 is selected");
	
	}
	@Then("the cart icon quantity should change to ‘5’")
	public void theCartIconQuantityShouldChangeTo5() {
	Assert.assertTrue(isElementDisplayed(factory.homePage().cartQuantity));
	}
	
	
	
	
	
}