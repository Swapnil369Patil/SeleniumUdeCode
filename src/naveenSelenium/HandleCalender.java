package naveenSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalender {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\Naveen Labs Selenium 11-02-2019\\how to setup Eclipse with webdriver\\Chromedriver-80.0.3\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/");
	

	driver.findElement(By.linkText("LOG IN")).click();
	
	driver.findElement(By.name("email")).sendKeys("swapnil369patil@gmail.com");
	
	driver.findElement(By.name("password")).sendKeys("swap@369");
	
	driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
	
	//need to solve from Navven video plz follow up

	}

}
