package testscript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShots {
	
	public void takeScreen_Shot(WebDriver driver, String name) throws IOException	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("D:\\screenshot\\"+name+".png");
		FileUtils.copyFile(srcFile, destFile);
		
		
	}

}
