package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	By login= By.cssSelector("a[href*='sign_in']");
	By popup= By.xpath("//button[text()='NO THANKS']");
	
	

	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement Login()
	{
		return driver.findElement(login);
		
	}

	public int Popupsize()
	{
		return driver.findElements(popup).size();
		
	}
	public WebElement popup()
	{
		return driver.findElement(popup);
}
}