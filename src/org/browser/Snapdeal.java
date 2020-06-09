package org.browser;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {
public void RobotClass() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Alagu\\Weekday\\Chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	String url = "https://www.snapdeal.com/offers/quirky";
	driver.get(url);
	String ser = "abcdefgh";
	WebElement txt = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
	txt.sendKeys(ser);
	Actions a = new Actions(driver);
	a.doubleClick(txt).perform();
	a.contextClick(txt).perform();
	Robot r = new Robot();
	for(int i=0;i<2;i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	WebElement txt1 = driver.findElement(By.xpath("(//input[@name='keyword'])[3]"));
	a.contextClick(txt1).perform();
	for(int i=0;i<3;i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	String ser1 = txt1.getAttribute("value");
	if(ser.equals(ser1)) {
		System.out.println(true+" and value is "+ ser1);
	}
	

}
public static void main(String[] args) throws Exception {
	Snapdeal s = new Snapdeal();
	s.RobotClass();
}
}
