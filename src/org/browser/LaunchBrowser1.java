package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser1 {
	public void chrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Alagu\\Weekday\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement usernameTxt = driver.findElement(By.id("email"));
		usernameTxt.sendKeys("abc@gmail.com");
		WebElement passwordTxt = driver.findElement(By.name("pass"));
		passwordTxt.sendKeys("P@ssword");
		driver.quit();	
	}
	public void firefox() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\eclipse-workspace\\Alagu\\Weekday\\Geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement usernameTxt = driver.findElement(By.id("email"));
		usernameTxt.sendKeys("abc@gmail.com");
		WebElement passwordTxt = driver.findElement(By.name("pass"));
		passwordTxt.sendKeys("P@ssword");
		driver.quit();	

	}
	public void ie() {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\user\\eclipse-workspace\\Alagu\\Weekday\\IEDriver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.facebook.com/");
		WebElement usernameTxt = driver.findElement(By.id("email"));
		usernameTxt.sendKeys("abc@gmail.com");
		WebElement passwordTxt = driver.findElement(By.name("pass"));
		passwordTxt.sendKeys("P@ssword");
		driver.quit();
	}
	public static void main(String[] args) {
		LaunchBrowser1 lb1 = new LaunchBrowser1();
		lb1.chrome();
		lb1.firefox();
		lb1.ie();
		
	}

}
