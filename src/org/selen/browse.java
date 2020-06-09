package org.selen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class browse {
 public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Alagu\\Weekday\\Chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");

}
 public static void main(String[] args) {
	browse b = new browse();
	b.launchBrowser();
}
}
