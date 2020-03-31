package basicprograms;


//23 September modified Display cities with date select

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SpiceJetSelectDate {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Rohit Agrawal Selenium\\\\chromedriver.exe");
		driver=new ChromeDriver();

		driver.get("file:///D:/Rohit%20Agrawal%20Selenium/Spicejet/SpiceJet/SpiceJet/www.spicejet.com/index.html");

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		String ul1Xpath="//div[@id='dropdownGroup1']/div/ul";

		selectCity(ul1Xpath, "Delhi (DEL)");

		Thread.sleep(3000);

		String ul2Xpath="//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//*[@id='dropdownGroup1']/div/ul";

		selectCity(ul2Xpath, "GOA (GOI)");
		
		Thread.sleep(3000);

		//this code is for select date
		String trXpath="//div[5]/div[2]/table/tbody/tr";

		List<WebElement> rows=driver.findElements(By.xpath(trXpath));

		for (int i = 1; i <=rows.size(); i++) {
			List<WebElement> cols=driver.findElements(By.xpath(trXpath+"["+i+"]/td"));
			for (int j =1; j <=cols.size(); j++) {
				WebElement cell=driver.findElement(By.xpath(trXpath+"["+i+"]/td["+j+"]"));
				if(cell.getText().equalsIgnoreCase("25"))
				{
					cell.click();
					i=rows.size();
					j=cols.size();
					break;
							
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(30000);
		driver.close();
	}
	
	//this code is for Select the cities 
	public static void selectCity(String ul2Xpath,String cityName)
	{
		List<WebElement> ul=driver.findElements(By.xpath(ul2Xpath));

		System.out.println(ul.size());

		for (int i = 1; i<=ul.size(); i++) {
			List<WebElement> li=driver.findElements(By.xpath(ul2Xpath+"["+i+"]/li"));
			System.out.println(li.size());
			for (int j =1; j<=li.size(); j++) {
				String itemText=driver.findElement(By.xpath(ul2Xpath+"["+i+"]/li["+j+"]")).getText();
				if(itemText.equalsIgnoreCase(cityName))
				{
					driver.findElement(By.xpath(ul2Xpath+"["+i+"]/li["+j+"]")).click();
					i=ul.size();
					j=li.size();
					break;
				}
			}
		}
		
	}
}