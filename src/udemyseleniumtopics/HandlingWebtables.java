package udemyseleniumtopics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebtables {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "D:\\Naveen Labs Selenium 11-02-2019\\how to setup Eclipse with webdriver\\Chromedriver-80.0.3\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		
		//code for free CRM URL and Login
			//https://freecrm.co.in/
		/*driver.findElement(By.linkText("LOG IN")).click();
		
		driver.findElement(By.name("email")).sendKeys("swapnil369patil@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("swap@369");
		
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();*/
		
		List<WebElement> rowcount=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		
          System.out.println("rows count are"+rowcount.size());
          
          List<WebElement> colcount=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
          System.out.println("col count are"+colcount.size());
          
          for (int rows = 1; rows<= rowcount.size(); rows++) {
        	  
        	  for (int cols = 1; cols<=colcount.size(); cols++) {
        		  
        		 System.out.print(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+rows+"]/td["+cols+"]")).getText()+"     ");
        	
			}
        	  
        	  System.out.println();
			
		}
          
	}

}
