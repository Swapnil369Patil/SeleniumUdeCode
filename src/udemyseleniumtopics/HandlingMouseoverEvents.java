package udemyseleniumtopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseoverEvents {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "D:\\Naveen Labs Selenium 11-02-2019\\how to setup Eclipse with webdriver\\Chromedriver-80.0.3\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.way2automation.com");
		
		WebElement name= driver.findElement(By.xpath("//*[@id=\'navbar-collapse-1\']/ul/li[7]/a"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(name).perform();
		
		driver.findElement(By.linkText("Practice site 1")).click();
		
		
	}

}
