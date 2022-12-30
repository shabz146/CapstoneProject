package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailCartPage extends BaseSetup{
	public RetailCartPage() {
		PageFactory.initElements(getDriver(), this);
	}
		
		@FindBy(xpath="//select[@class=\'product__select\']//following-sibling::option[1]")
		public WebElement quantity2;
		
		@FindBy(id="proceedBtn")
		public WebElement proceedToCkeckout;
		
		@FindBy(id="addAddressBtn")
		public WebElement addaNewAddress;
		
		@FindBy(xpath="//select[@class=\"product__select\"]//following-sibling::option[4]")
		public WebElement quantity5;

}
