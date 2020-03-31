package basicprograms;
import java.util.List;

// 22 september program GetTextValue
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class GetTextValue {
	public static void main(String[] args) {
		
	
		/*System.setProperty(webdriver.chrome.driver, )
		WebDriver driver=new ChromeDriver();*/
		
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/Rohit%20Agrawal%20Selenium/doc/WebPages/table.html");
		
		//print text of 1 st row using tr 

		WebElement cell1=driver.findElement(By.xpath("//tr[3]"));
		System.out.println("cell name is= "+cell1.getText());


		//below list we use cause we are using findelements so return type is list
		//we can use object to get both interger and string data.

		//get the row size of tables 
		List<WebElement> rows=driver.findElements(By.xpath("//tr"));
		System.out.println("total row count="+rows.size());
		
		//get the col size of according to tr row number
		List<WebElement> col=driver.findElements(By.xpath("//tr[4]/td"));
		System.out.println(" column count="+4+" row is "+col.size());
		
		
		
		
//to print column count of all rows
		
		
		/*for (int i = 1; i < rows.size(); i++) 
		{
			
			List<WebElement> column=driver.findElements(By.xpath("tr["+i+"]/td"));
		
			System.out.println("column. is" +column.size())
	
	}
		
*/
		for (int i = 1; i < rows.size(); i++) 
		{

			List<WebElement> column=driver.findElements(By.xpath("//tr["+i+"]/td"));     //("//td"));

			System.out.println("column is "+column.size());
			
			//System.out.println("no. of col in "+i+"row is  "+column.size());
			
		
			for (int j = 1; j <col.size() ; j++) {

				String celltext=driver.findElement(By.xpath("//tr["+i+"]/td["+j+"]")).getText();
		 
		System.out.println(celltext);


			}
		}
		
		}
	
}