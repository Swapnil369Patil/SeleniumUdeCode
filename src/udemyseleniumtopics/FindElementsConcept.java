package udemyseleniumtopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementsConcept {
	
	public static void main(String []args) {
		

	
	System.setProperty("webdriver.chrome.driver", "D:\\\\Naveen Labs Selenium 11-02-2019\\\\how to setup Eclipse with webdriver\\\\Chromedriver_Win32\\\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.wikipedia.org/");
	
	driver.findElement(By.id("searchLanguage")).click();
	
	List <WebElement> value=driver.findElements(By.tagName("options"));
	
	
	
	
	
	
	
	
	
}
}