package naveenSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDynamicWebtable {

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
	
	
	driver.findElement(By.xpath("//*[@id=\'main-nav\']/a[3]/span")).click();
	
	try {
		Thread.sleep(2000);
		
		}catch(Exception e)
		{
			
		}
	//table[contains(@class,'ui celled')]/tbody/tr[1]/td[2]
	//table[contains(@class,'ui celled')]/tbody/tr[2]/td[2]
	//table[contains(@class,'ui celled')]/tbody/tr[3]/td[2]
	//table[contains(@class,'ui celled')]/tbody/tr[4]/td[2]
	
	/*String before_xpath="//table[contains(@class,'ui celled')]/tbody/tr[";
	String after_xpath="]/td[2]";
	
	for (int i = 1; i <=5; i++) {
		
		String name=driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
		
		System.out.println(name);
		
		if (name.contains("Swap Patel"))
		{
			driver.findElement(By.xpath("//table[contains(@class,'ui celled')]/tbody/tr["+i+"]/td[1]")).click();
		}*/
		
	//We are clicking using x path as well
	
	driver.findElement(By.xpath("//td[contains(text(),'Swap Patel')]//preceding-sibling::td//input[@type='checkbox']")).click();
		//td[contains(text(),'Swap Patel')]//preceding-sibling::td//input[@type='checkbox']
	}
	
	
	}


