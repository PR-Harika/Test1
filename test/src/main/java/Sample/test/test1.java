package Sample.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
		// TODO Auto-generated method stub
		public static void main(String args[]) throws  InterruptedException {
			System.setProperty("webdriver.chrome.driver","./resources/chromedriver.exe");
        	WebDriver driver=new ChromeDriver();
        	driver.get("https://www.urbanladder.com");
        	driver.findElement(By.xpath("//*[@id=\"header\"]/section/div/ul[1]/li[1]/a")).click();
        	WebElement wl=driver.findElement(By.xpath("//*[@id=\"help-center-search-input\"]"));
        	wl.sendKeys("How do I track my order status?");
        	wl.sendKeys(Keys.ENTER);
	}

}
