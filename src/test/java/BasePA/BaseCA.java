package BasePA;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseCA
{
public static WebDriver driver;

	public static void browser_lanuch()
	{	
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		 driver.get("https://www.fb.com");		
	}
	
	public static void browser_close()
	{
		driver.close();
	}
	
	
	
	
	public static String captureScreenshot() throws IOException {
	{

String screenshotPath = "";

//1. take screenshot object
TakesScreenshot scrShot =(TakesScreenshot) driver;

File sourceFile = scrShot.getScreenshotAs(OutputType.FILE);


File destinationPath = new File("D://KPHP//"
+ "ScreenCapture" + System.currentTimeMillis() + ".png");

// 4. copy the source file into destination path
FileUtils.copyFile(sourceFile, destinationPath);


//5. capturing the  in string
screenshotPath = destinationPath.getAbsolutePath();

return screenshotPath;
}


	
	}
	
}
