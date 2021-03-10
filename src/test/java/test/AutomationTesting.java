package test;

import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import basePage.BrowserFactory;
import basePage.Methods;
import basePage.PageInformation;

public class AutomationTesting extends Methods{

WebDriver driver;
	

@Before
public void browserCalling() {
	
driver = BrowserFactory.browser();

}
	@Test
	public void toggleTest() throws IOException, InterruptedException {
	
		//PageInformation pgInfo = new PageInformation(driver);
		PageInformation pageInfo= PageFactory.initElements(driver, PageInformation.class);
		pageInfo.toggleMethod();
		takeScreenshotAtEndOfTest(driver);
		pageInfo.toggleMethod();
		Thread.sleep(3000);
		
		pageInfo.checkItemMethod();
		pageInfo.deleteItem();
		Thread.sleep(2000);
		takeScreenshotAtEndOfTest(driver);
		
		pageInfo.toggleMethod();
		pageInfo.deleteItem();
		takeScreenshotAtEndOfTest(driver);

}
	
	 @After
			    public  void tearDown() throws InterruptedException {
				Thread.sleep(2000);
				driver.close();
	}
	 

}
