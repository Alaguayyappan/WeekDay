package org.browser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTab {
	public void flip() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Alagu\\Weekday\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement x = driver.findElement(By.xpath("//button[text()='✕']"));
		x.click();
		WebElement s = driver.findElement(By.xpath("//input[@name='q']"));
		s.sendKeys("redmi");
		WebElement ser = driver.findElement(By.xpath("//button[@type='submit']"));
		ser.click();
		WebElement result = driver.findElement(By.xpath("(//div[contains(@class,'wU')])[1]"));
		result.click();
		
		String parent = driver.getWindowHandle();
		Set <String> allwin = driver.getWindowHandles();
		System.out.println(driver.getCurrentUrl());
		for (String a : allwin) {
			if(!parent.equals(a)) {
				driver.switchTo().window(a);
			}
			
		}
		System.out.println(driver.getCurrentUrl());	

	}
public static void main(String[] args) {
	SwitchTab st = new SwitchTab();
	st.flip();
}
}
