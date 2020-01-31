package com.kurtosys.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kurtosys.testcases.PageObject;

public class HomePage extends PageObject {
	
	

	//Find elements using xpath
	
			private final String titleText = "//*[@id='ng-app']/head/title"; 
			@FindBy(xpath = titleText)
			private WebElement homepagetitle;
			
			private final String acceptcokiebtn = "//div[@class='btn btn-cta ng-binding']"; 
			@FindBy(xpath = acceptcokiebtn)
			private WebElement acceptcokie;

			
			public HomePage(WebDriver driver) {
				super(driver);
			
			}
			
		
			
			public boolean isInitialized() {
				
				return  homepagetitle.isDisplayed();
				
			}
			
			public void VerifyHomePageTitle(String homepagetitle){
				
				this.homepagetitle.getText();

            }

            public void ClickAcceptCokie(){
				
				this.acceptcokie.click();


			    }
			

}
