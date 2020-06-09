package org.browser;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public void ScShot() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Alagu\\Weekday\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		TakesScreenshot t = (TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File ss = new File("C:\\Users\\user\\eclipse-workspace\\Alagu\\Weekday\\Screenshots\\redbus.png");
		FileUtils.copyFile(src, ss);
	}
public static void main(String[] args) throws IOException {
	Screenshot s = new Screenshot();
	s.ScShot();
}
}
