package academy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public WebDriver driver;
	public Properties prop;
public WebDriver initialiser() throws IOException
{
	 prop= new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\princ\\seleniumworkspace\\cucumberLaste2e\\src\\main\\java\\academy\\data.properties");
    prop.load(fis);
    String browserName=prop.getProperty("browser");
    if(browserName.equals("Chrome"))
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\princ\\seleniumworkspace\\cucumberLaste2e\\src\\main\\java\\academy\\chromedriver.exe" );
    	 driver= new ChromeDriver();
    }

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
}
}
