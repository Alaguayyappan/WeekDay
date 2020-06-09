package org.website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public void redBus() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Alagu\\Weekday\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement signin = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[2]"));
		signin.click();
		WebElement create = driver.findElement(By.xpath("//*[@id=\"createAccountSubmit\"]"));
		create.click();
		WebElement usertxt = driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]"));
		usertxt.sendKeys("9566259049");
		WebElement email = driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
		email.sendKeys("abc@gmail.com");
		driver.quit();
		

	}
	public static void main(String[] args) {
		Browser b = new Browser();
		b.redBus();
		
	}

}
