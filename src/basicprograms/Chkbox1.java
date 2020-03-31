package basicprograms;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//checkbox selet on page of checkbox.html

public class Chkbox1 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Rohit Agrawal Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("file:///D:/Rohit%20Agrawal%20Selenium/doc/WebPages/checkBox.html");

		List<WebElement> rows=driver.findElements(By.xpath("//tr"));
		

	}

}
