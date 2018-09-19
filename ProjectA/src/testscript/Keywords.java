package testscript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BrowserFactory.Browsers;

public class Keywords {
	static WebDriver driver;
	static FileInputStream file;
	static Properties prop;
	public void Openbrowser() throws IOException	{
		driver =  Browsers.browser("Firefox");
		file = new FileInputStream("C:\\Users\\DELL\\workspace\\ProjectA\\src\\objectrepository\\objectrepository.properties");
		prop = new Properties();
		prop.load(file);
	}
	
	public void Navigate(String Data) throws IOException	{
		driver.get(Data);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ScreenShots sh = new ScreenShots();
		sh.takeScreen_Shot(driver, "HomePage");
	}
	
	public void Click(String Objectname)	{
		driver.findElement(By.xpath(prop.getProperty(Objectname))).click();
	}
	
	public void Input(String Objectname, String Data) throws IOException	{
		driver.findElement(By.xpath(prop.getProperty(Objectname))).sendKeys(Data);
		ScreenShots sh = new ScreenShots();
		sh.takeScreen_Shot(driver, "Amazon_Login");
		
	}

}
