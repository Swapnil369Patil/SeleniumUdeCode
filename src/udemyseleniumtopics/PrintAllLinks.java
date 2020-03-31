package udemyseleniumtopics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Naveen Labs Selenium 11-02-2019\\\\how to setup Eclipse with webdriver\\\\Chromedriver_Win32\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
				
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.wikipedia.org/");
		
		List<WebElement> list= driver.findElements(By.tagName("a"));
		
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i).getText()+"--URL IS--"+list.get(i).getAttribute("href"));
		}                                                        
			
			/*String alllinks=list.get(i).getText();
			System.out.println(alllinks);*/
		
		//we can use advanced for loop as well
		
		/*for(WebElement link :list)
		{
			
			System.out.println(link.getText()+"--URL IS--"+link.getAttribute("href"));
					
		}*/
		

	}			

}
