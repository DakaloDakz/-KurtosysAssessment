package com.kurtosys.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewOurFeatureFunds extends PageObject {
	
	
	
	private final String viewfeaturedfundbtn = "//*[@id='UKHP-FindafundandFeaturedProduct-BB']/div/div[1]/div[3]/a"; 
	@FindBy(xpath = viewfeaturedfundbtn)
	private WebElement viewfeaturedfund;

	private final String findoutmorelnk = "//*[@id='1383537148456']/div/div[1]/div/div[1]/div[2]/div[2]/span/div/span/a/span"; 
	@FindBy(xpath = findoutmorelnk)
	private WebElement findoutmorejmpukd;
	
	private final String jumptofundsearchbox = "//*[@id='searchbox']"; 
	@FindBy(xpath = jumptofundsearchbox)
	private WebElement jumptofundsearch;
	
	private final String selectfunddropdown = "//*[@id='suggestionitem']/a"; 
	@FindBy(xpath = selectfunddropdown)
	private WebElement selectfund;
	
	private final String perfomancesandfeeslnk = "//*[@id='react-app']/div/div[1]/div[1]/div/div[3]/div[1]/div/ul/li[2]/a"; 
	@FindBy(xpath = perfomancesandfeeslnk)
	private WebElement perfomancesandfees;
	
	private final String ghigraph = "//*[@id='PerformanceChart']"; 
	@FindBy(xpath = ghigraph)
	private WebElement ghigraphs;
	
	
	
	public ViewOurFeatureFunds(WebDriver driver) {
		super(driver);
	
	}

	

	
	public boolean isInitialized() {
		
		return  viewfeaturedfund.isDisplayed();
		
	}
	
	public void ClickViewFeaturedFund(){
		
		try {
			this.viewfeaturedfund.wait();
		} catch (InterruptedException e) {
			
		}
		
		this.viewfeaturedfund.click();


	    }

    public void ClickFindOutMoreJmpUkDynamic(){
		
    	try {
			this.findoutmorejmpukd.wait();
		} catch (InterruptedException e) {
			
		}
    	
		this.findoutmorejmpukd.click();


	    }
    
   public void EnterJumpToFundID(String jumptofundsearch ){
	   
	   
	   this.jumptofundsearch.clear();
		
		this.jumptofundsearch.sendKeys(jumptofundsearch);


	    }
   
   public void ClickSelectFund(){
		
 		this.selectfund.click();


 	    }
     
   public void ClickPerfomancesAndFees(){
		
		this.perfomancesandfees.click();


	    }
   public void ValidateViewGraph(){
		
		this.ghigraphs.isDisplayed();


	    }
}

