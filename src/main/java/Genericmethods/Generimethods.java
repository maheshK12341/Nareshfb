package Genericmethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BasePP.BaseCCC;


public class Generimethods extends BaseCCC {
	

public static String Takescreen() throws IOException {
{
	
		String screenshotPath = "";

		//1. take screenshot object
		TakesScreenshot scrShot = (TakesScreenshot) BaseCCC.driver;

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
