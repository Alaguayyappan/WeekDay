package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gurusite {
public void demoguru() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Alagu\\Weekday\\Chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	Thread.sleep(5000);
	WebElement src1 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
	WebElement targ1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	WebElement src2 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
	WebElement targ2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
	WebElement src3 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
	WebElement targ3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
	WebElement src4 = driver.findElement(By.xpath("//a[text()=' 5000']"));
	WebElement targ4 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
	Actions a = new Actions(driver);
	a.dragAndDrop(src1, targ1).perform();
	a.dragAndDrop(src2, targ2).perform();
	a.dragAndDrop(src3, targ3).perform();
	a.dragAndDrop(src4, targ4).perform(); 
	driver.quit();


	

}
public static void main(String[] args) throws InterruptedException {
	Gurusite gs = new Gurusite();
	gs.demoguru();
}
}
