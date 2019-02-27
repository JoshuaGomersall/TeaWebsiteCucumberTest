package Websites;

import javax.management.remote.TargetedNotification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class MenuPage {

	@FindBy (xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000451933201\"]/div/div/img") 
	private WebElement item1;
	
	@FindBy (xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000451938003\"]/div/div/img") 
	private WebElement item2;
	
	
	public void clickbothimages() {
		item1.click();
		item2.click();
	}
}

