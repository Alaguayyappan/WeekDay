package org.browser;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTab1 {
	public void flip1() {
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
		List <String> l = new ArrayList();
		l.addAll(allwin);
		String l1 = l.get(1);
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(l1);
		System.out.println(driver.getCurrentUrl());
		

	}
public static void main(String[] args) {
	SwitchTab1 st1 = new SwitchTab1();
	st1.flip1();
}

}
