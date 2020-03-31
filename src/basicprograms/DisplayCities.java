package basicprograms;

import java.util.List;

//22 september displaycities program of spicejrt application

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayCities {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Rohit Agrawal Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/Rohit%20Agrawal%20Selenium/Spicejet/SpiceJet/SpiceJet/www.spicejet.com/index.html");
		
		//to click on leaving from
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		List<WebElement> ul=driver.findElements(By.xpath("//div[@id='dropdownGroup1']/div/ul"));
		
		System.out.println(ul.size());
		
		for (int i = 1; i<=ul.size(); i++) {
			List<WebElement> li=driver.findElements(By.xpath("//div[@id='dropdownGroup1']/div/ul["+i+"]/li"));
			
			System.out.println(li.size());
			
			for (int j =1; j<=li.size(); j++) {
				
				String itemText=driver.findElement(By.xpath("//div[@id='dropdownGroup1']/div/ul["+i+"]/li["+j+"]")).getText();
				
				System.out.println(itemText);
				
				if(itemText.equalsIgnoreCase("25"));
				
			}
		}
		
		driver.close();

	} 

}
