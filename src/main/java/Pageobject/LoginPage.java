package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;
	By username= By.id("user_email");
	By password= By.id("user_password");
	By submit = By.name("commit");

	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement Username()
	{
		return driver.findElement(username);
	}

	public WebElement Password()
	{
		return driver.findElement(password);
	}

	public WebElement Submit()
	{
		return driver.findElement(submit);
}
}
