package BrowserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Browsers {
	static WebDriver driver;
	public static WebDriver browser(String browname)	{
		if (browname.equalsIgnoreCase("Firefox"))	{
			System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if (browname.equalsIgnoreCase("Chrome"))	{
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if (browname.equalsIgnoreCase("htmlunitdriver"))	{
			driver = new HtmlUnitDriver();
		}
		
		driver.manage().window().maximize();
		return driver;
	}

}
