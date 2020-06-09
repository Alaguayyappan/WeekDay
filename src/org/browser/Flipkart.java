package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public void getfunct() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Alagu\\Weekday\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.flipkart.com/";
		driver.get(url);
		WebElement txt = driver.findElement(By.xpath("//span[text()='Electronics']"));
		String e = txt.getText();
		System.out.println("Menu is:"+e);
		WebElement txt1 = driver.findElement(By.xpath("//span[text()='Men']"));
		String m = txt1.getAttribute("value");
		System.out.println("Menu is:"+m);
		String title = driver.getTitle();
		System.out.println("Title:"+title);
		String URL = driver.getCurrentUrl();
		System.out.println("URL:"+URL);
		if(url.equals(URL)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}	
		

	}
	public static void main(String[] args) {
		Flipkart f = new Flipkart();
		f.getfunct();
	}

}
