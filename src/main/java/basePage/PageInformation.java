package basePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageInformation {
	WebDriver driver;
	
	public PageInformation(WebDriver driver2) {
		this.driver=driver2;
	}

	public void toggleMethod() {
		
	WebElement toggleAllCheckBox = driver.findElement(By.name("allbox"));
	toggleAllCheckBox.click();
}
public void checkItemMethod() {	
	WebElement checkOneItem = driver.findElement(By.xpath("//input[@type='checkbox' and @name='todo[22]']"));
	checkOneItem.click();
}
public void deleteItem() {
	
	WebElement DeleteItem = driver.findElement(By.xpath("//input[@value='Remove']"));
	DeleteItem.click();

}
}