package com.automation.selenium.TestFramework;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TakscrenShotSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*System.setProperty("webdriver.ie.driver", "C:\\Program Files\\Internet Explorer\\iexplore.exe");
		WebDriver driver = new InternetExplorerDriver();*/
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("priya vyawahare"); 
		
		
		TakesScreenshot tc = (TakesScreenshot)driver;
		
		File scource = tc.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(scource, new File("./ScreenShots/facebook.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	 driver.quit();
	}

}
