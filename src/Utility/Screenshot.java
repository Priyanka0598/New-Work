package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;



public class Screenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver= Browser.OpenBrowser("");
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("F:\\priyankass\\pp.png");
		FileHandler.copy(source, destination);
	}

}
