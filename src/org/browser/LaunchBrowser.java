package org.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser {
	public void chrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Alagu\\Weekday\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.close();
	}
	public void firefox() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\eclipse-workspace\\Alagu\\Weekday\\Geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.close();

	}
	public void ie() {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\user\\eclipse-workspace\\Alagu\\Weekday\\IEDriver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.facebook.com/");
		driver.close();

	}
	
	public static void main(String[] args) {
		LaunchBrowser c = new LaunchBrowser();
		c.chrome();
		c.firefox();
		c.ie();
	}

}
