package Sample.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {
	public static void main(String args[]) throws  InterruptedException {
		System.setProperty("webdriver.chrome.driver","./resources/chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://www.urbanladder.com");
    	WebElement wl=driver.findElement(By.id("search"));
    	wl.sendKeys("Titlie Figurine");
    	wl.sendKeys(Keys.ENTER);
    	WebElement w=driver.findElement(By.xpath("//*[@id=\"Showpieceslist\"]/div/div/li[1]/img"));
}
}