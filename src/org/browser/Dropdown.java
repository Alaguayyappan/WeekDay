package org.browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public void slect() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Alagu\\Weekday\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		WebElement ck = driver.findElement(By.xpath("//input[@id='cpvLocationPO']"));
		ck.click();
		WebElement ck1 = driver.findElement(By.xpath("(//select[@class='dropdown-box'])[1]"));
		ck1.click();
		Select s = new Select(ck1);
		s.selectByVisibleText("Chennai");
		WebElement ck2 = driver.findElement(By.xpath("//input[@name='givenName']"));
		ck2.sendKeys("Adam");
		WebElement ck3 = driver.findElement(By.xpath("//input[@name='surname']"));
		ck3.sendKeys("ravi");
		WebElement ck4 = driver.findElement(By.xpath("//input[@id='dob']"));
		ck4.click();
		WebElement ck5 = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select m = new Select(ck5);
		m.selectByVisibleText("Feb");
		WebElement ck6 = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select y = new Select(ck6);
		y.selectByVisibleText("1997");
		WebElement ck7 = driver.findElement(By.xpath("//a[text()='14']"));
		ck7.click();
		WebElement ck8 = driver.findElement(By.xpath("(//input[@class='txtbox'])[3]"));
		ck8.sendKeys("abc@gmail.com");
		WebElement ck08 = driver.findElement(By.xpath("//input[@value='yes']"));
		ck08.click();
		WebElement ck9 = driver.findElement(By.xpath("(//input[@class='txtbox'])[4]"));
		ck9.sendKeys("abc");
		WebElement ck10 = driver.findElement(By.xpath("(//input[@class='txtbox'])[5]"));
		ck10.sendKeys("abc123");
		WebElement ck11 = driver.findElement(By.xpath("(//input[@class='txtbox'])[6]"));
		ck11.sendKeys("abc123");
		WebElement ck12 = driver.findElement(By.xpath("(//select[@class='dropdown-box'])[2]"));
		ck12.click();
		Select c = new Select(ck12);
		c.selectByVisibleText("First School");
		List <WebElement> o = s.getOptions();
		for (WebElement tmp : o) {
			System.out.println(tmp.getText());
			
		}
		WebElement ck13 = driver.findElement(By.xpath("(//input[@class='txtbox'])[7]"));
		ck13.sendKeys("school");
		
		
		
		

	}
	public static void main(String[] args) {
		Dropdown d = new Dropdown();
		d.slect();
	}

}
