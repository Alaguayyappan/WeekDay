package org.browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
 public void oyo() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Alagu\\Weekday\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oyorooms.com/");
		WebElement e = driver.findElement(By.xpath("//div[@class='oyo-cell oyo-cell--12-col oyo-cell--8-col-tablet oyo-cell--4-col-phone d-text16 is-fontBold datePickerDesktop__checkInOut u-textEllipsis']"));
		e.click();
		WebElement t1 = driver.findElement(By.xpath("(//table[@class='DateRangePicker__MonthDates'])[1]"));
		WebElement t2 = driver.findElement(By.xpath("(//table[@class='DateRangePicker__MonthDates'])[2]"));
		
		List <WebElement> tr = t1.findElements(By.tagName("tr"));
		for(int i=0; i<tr.size(); i++) {
			List <WebElement> td = tr.get(i).findElements(By.tagName("td"));
			for(int j=0; j<td.size(); j++) {
				String s = td.get(j).getText();
				System.out.println(s);
				if (s.contentEquals("27")) {
					td.get(j).click();
					break;
				}
			}
		}
		List <WebElement> tr1 = t2.findElements(By.tagName("tr"));
		for(int i=0; i<tr1.size(); i++) {
			List <WebElement> td1 = tr1.get(i).findElements(By.tagName("td"));
			for(int j=0; j<td1.size(); j++) {
				String s = td1.get(j).getText();
				System.out.println(s);
				if (s.contentEquals("15")) {
					td1.get(j).click();
					break;
				}
			}
		}
		
		

}
 public static void main(String[] args) {
	Webtable w = new Webtable();
	w.oyo();
	
}
}
