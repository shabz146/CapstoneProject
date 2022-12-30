package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility{
	POMFactory factory = new POMFactory();
	
	@And("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.orderPage().orders);
		logger.info("User clicked on Orders section");
		slowDown();
	}
	@And("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		click(factory.orderPage().firstOrder);
		logger.info("User clicked on first order");
	slowDown();
	}
	@And("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(factory.orderPage().cancelOrderButton);
		logger.info("User cancelled the order");
	}
	@And("User select the cancelation Reason ‘Bought wrong item’")
	public void userSelectTheCancelationReason() {
		click(factory.orderPage().boughtWrongItem);
	}
	@And("User click on Cancel Order button")
		public void userClickOnCancelOrderButton() {
		click(factory.orderPage().cancelOrder1);
		logger.info("User clicked on Cancel Order");
		slowDown();
	}
	
	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed() {
	Assert.assertTrue(isElementDisplayed(factory.orderPage().yourOrderHasBeenCancelled));
	logger.info("Order is cancelled");
	getDriver().close();
	}
	//SCENARIO RETURN
	@And("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(factory.orderPage().returnOrderButton);
	}
	@And("User select the Return Reason ‘Item damaged'")
	public void userSelectTheReturnReason() {
		click(factory.orderPage().itemDamaged);
		logger.info("User selected return reason as item damaged");
	}
	@And("User select the drop off service ‘FedEx’")
	public void userSelectTheDropOffService() {
		click(factory.orderPage().dropOffFedex);
		logger.info("User selected FedEx as drop off service");
		
	}
	@And("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.orderPage().returnOrderButton);
		logger.info("User clicked on return order button");
	
	}
	@Then("a cancelation message should be displayed ‘Return was successful")
	public void aCancelationMessageShouldBeDisplayedReturn() {
		isElementDisplayed(factory.orderPage().returnConfirmMessage);
		logger.info("Cancelation msg is displayed");
	
	}
	
	//SCENARIO WRITE REVIEW
	
	@And("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.orderPage().reviewButton);
	}
	@And("User write Review headline {string} and {string}")
	public void userWriteReview(String headline, String written) {
		click(factory.orderPage().addaHeadline);
		sendText(factory.orderPage().addaHeadline,headline);
	    click(factory.orderPage().addaWritten);
	    sendText(factory.orderPage().addaWritten, written);
	}
	@And("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.orderPage().addYourReview);
	}
	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String expectedMessage) {
		if (expectedMessage.contains("Your review was added successfully")) {
    		waitTillPresence(factory.orderPage().yourReviewWasAddedSuccessfully);
    		Assert.assertEquals(expectedMessage, factory.orderPage().yourReviewWasAddedSuccessfully.getText());
    		logger.info(expectedMessage+" is displayed");
	logger.info("Review message is displayed ");
}}}
