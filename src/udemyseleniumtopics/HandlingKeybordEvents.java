package udemyseleniumtopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingKeybordEvents {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Naveen Labs Selenium 11-02-2019\\how to setup Eclipse with webdriver\\Chromedriver-80.0.3\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://gmail.com");
		
		
		driver.findElement(By.xpath("//*[@id=\'identifierId\']")).sendKeys("swapnil369patil@gmail.com");
		//*[@id="identifierId"]
		
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.ENTER).perform();
		
		act.sendKeys(Keys.chord(Keys.CONTROL+"a")).build().perform();
		act.sendKeys(Keys.chord(Keys.CONTROL+"c")).build().perform();
		
		//if you want use build then we write join statement means it will build both statement and then use perform plz refer below
		// we use build() for combining action6 
		
		act.sendKeys(Keys.chord(Keys.CONTROL+"a")).sendKeys(Keys.chord(Keys.CONTROL+"c")).build().perform();
		
		
		
		driver.findElement(By.xpath("//*[@id=\'identifierId\']")).click();
		act.sendKeys(Keys.chord(Keys.CONTROL+"v")).build().perform();

		
		
	}

}
