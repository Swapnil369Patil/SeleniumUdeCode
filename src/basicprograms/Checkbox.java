package basicprograms;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//program is for check the checkbox of perticular page i.e, checkbox.html
public class Checkbox {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "D:\\Rohit Agrawal Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("file:///D:/Rohit%20Agrawal%20Selenium/doc/WebPages/checkBox.html");

		List<WebElement> rows=driver.findElements(By.xpath("//tr"));

		//System.out.println("total row count="+rows.size());
		//List<WebElement> col=driver.findElements(By.xpath("//tr/td[2]"));

		//System.out.println(col.size());


		for (int i = 1; i < rows.size(); i++) 
		{

			List<WebElement> col=driver.findElements(By.xpath("//tr["+i+"]/td"));     //("//td"));

			System.out.println("column is "+col.size());



			for (int j = 1; j <col.size() ; j++) {

				String celltext=driver.findElement(By.xpath("//tr["+i+"]/td["+j+"]")).getText();

				//System.out.println(celltext);

				if(celltext.equalsIgnoreCase("Rohit1"))
				{
					driver.findElement(By.xpath("//tr["+i+"]/td/input")).click();
				}
			}
		}

	}

}
