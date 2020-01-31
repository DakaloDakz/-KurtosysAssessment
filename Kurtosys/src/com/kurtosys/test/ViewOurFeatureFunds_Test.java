package com.kurtosys.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.kurtosys.base.WebDriverControl;

import com.kurtosys.testcases.ViewOurFeatureFunds;

@Listeners(WebDriverControl.class)
public class ViewOurFeatureFunds_Test {
	
protected WebDriver driver;
	
	private ViewOurFeatureFunds viewOurfeaturefunds;
	

	@BeforeClass(alwaysRun = true)
	public void setUp() {

		RemoteWebDriver driver = WebDriverControl.getDriver();

		viewOurfeaturefunds = PageFactory.initElements(driver, ViewOurFeatureFunds.class);
		
	}
	//Verify home page 
		
		@SuppressWarnings("static-access")
		@Test(groups = "HomePage")
		public void verifyHomePage() throws InterruptedException {
        
			viewOurfeaturefunds.ClickFindOutMoreJmpUkDynamic();
			viewOurfeaturefunds.ClickViewFeaturedFund();
			viewOurfeaturefunds.EnterJumpToFundID("GB0009698001");
			viewOurfeaturefunds.ClickSelectFund();
			Assert.assertEquals("ISINGB0009698001", "ISINGB0009698001");
			viewOurfeaturefunds.ClickPerfomancesAndFees();
			viewOurfeaturefunds.ValidateViewGraph();
		

}
}