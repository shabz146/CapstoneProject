package tek.sdet.framework.pages;

import tek.sdet.framework.base.BaseSetup;
import tek.sdet.framework.steps.RetailAccountSteps;

public class POMFactory extends BaseSetup {

	private RetailHomePage homePage;
	private RetailSignInPage signInPage;
	private RetailAccountPage accountPage;
	private RetailOrderPage orderPage;
	private RetailCartPage cartPage;
	public POMFactory() {
		this.homePage = new RetailHomePage();
		this.signInPage = new RetailSignInPage();
		this.accountPage = new RetailAccountPage();
		this.orderPage = new RetailOrderPage();
		this.cartPage = new RetailCartPage();
	}

	public RetailHomePage homePage() {
		return this.homePage;

	
	}
	public RetailSignInPage signInPage() {
		return this.signInPage;
		
	
	}
	public RetailAccountPage accountPage() {
		return this.accountPage;
	}
    public RetailOrderPage orderPage() {
			return this.orderPage;
    }
	public RetailCartPage cartPage() {
				return this.cartPage;
		}
		
	}


