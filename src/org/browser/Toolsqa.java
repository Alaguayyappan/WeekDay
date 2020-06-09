package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toolsqa {
	public void Scrollfunc() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Alagu\\Weekday\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/#go");
		WebElement sd = driver.findElement(By.xpath("//a[text()='Corporate Training']"));
		WebElement su = driver.findElement(By.xpath("(//span[text()='HOME'])[1]"));
		WebElement ser = driver.findElement(By.xpath("//i[@class=' mw-icon the7-mw-icon-search-bold']"));
		WebElement ser1 = driver.findElement(By.xpath("(//input[@name='s'])[1]"));
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView(true)", sd);
		String txt = sd.getText();
		System.out.println(txt);
		j.executeScript("arguments[0].scrollIntoView(false)", su);
		String txt1 = sd.getText();
		System.out.println(txt1);
		j.executeScript("arguments[0].click()", ser);
		j.executeScript("arguments[0].setAttribute('value','abcdefgh')", ser1);
		Object obj = j.executeScript("return arguments[0].getAttribute('value')", ser1);
		String str = (String)obj;
		System.out.println(str);

	}
	public static void main(String[] args) {
		Toolsqa t = new Toolsqa();
		t.Scrollfunc();
	}

}
