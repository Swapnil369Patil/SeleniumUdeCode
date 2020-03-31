package basicprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDay {

	public static void main(String[] args) {



		System.setProperty("webdriver.chrome.driver", "D:\\Rohit Agrawal Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("file:///D:/Rohit%20Agrawal%20Selenium/Spicejet/SpiceJet/SpiceJet/www.spicejet.com/index.html");

		String trxpath="//div[5]/div[2]/";


		List<WebElement> rows=driver.findElements(By.xpath("trxpath"));

		for (int i = 1; i<=rows.size(); i++) {
			List<WebElement> col=driver.findElements(By.xpath(" "));


			for (int j =1; j<=col.size(); j++) {
				WebElement cell=driver.findElement(By.xpath(trxpath+"["+i+"]/td["+j+"]"));




				if(cell.getText().equalsIgnoreCase("25"));
				{

					cell.click();
					i=rows.size();
					j=col.size();
					break;
				}







			}

		}
	}
	}
