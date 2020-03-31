package naveenSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJetDropdown {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "D:\\Naveen Labs Selenium 11-02-2019\\how to setup Eclipse with webdriver\\Chromedriver-80.0.3\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_ddl_originStation1_CTXT\']")).click();
		
		List<WebElement> list=driver.findElements(By.xpath("//*[contains(@id,'dropdownGroup1')]//div//ul//li//a"));
		
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			
			if (list.get(i).getText().contains("Kochi (COK)"))
					{
				       list.get(i).click();
				       
				       //break;
					}
		}
	}

}
