package academy;

import java.io.IOException;

import org.testng.annotations.Test;

import Pageobject.LandingPage;
import Pageobject.LoginPage;

public class mainrun extends base {
@Test
public void myrunner() throws IOException
{
	driver=initialiser();
	driver.get(prop.getProperty("url"));
	LandingPage lp=new LandingPage(driver);
	if(lp.Popupsize()>0)
	{
		lp.popup().click();
	}
	lp.Login().click();
	LoginPage lg= new LoginPage(driver);
	lg.Username().sendKeys("nainaseth4@gmail.com");
	lg.Password().sendKeys("1234545");
	lg.Submit().click();
}

}
