package alertwindowframe;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		//code to handle multiple window

		//System.setProperty("webdriver.chrome.driver", "D:\\Rohit Agrawal Selenium\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();

		driver.get("file:///D:/Rohit%20Agrawal%20Selenium/doc/WebPages/WindowHandlerIndex.html");

		driver.findElement(By.xpath("html/body/a[1]")).click();

		Set<String> hand=driver.getWindowHandles(); //get all the windows

		for (String handler : hand) {

			System.out.println(handler); // print all window 	

			driver.switchTo().window(handler);
			if(driver.getTitle().equalsIgnoreCase("Window 1"))
			{
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input")).sendKeys("swap");

			}

		}







	}

}
