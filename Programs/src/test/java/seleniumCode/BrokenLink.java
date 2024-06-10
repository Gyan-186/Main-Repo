package seleniumCode;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
/*
 Broken link are those which doesn't have any resource in server.
 1) The href url should have some value (href="https://xyz.com"). 
 2) When we hit the url we will get the status code and if status code >= 400 - Broken link & status code<=400 - not a broken link		
 */
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		 System.out.println("Total number of links present "+links.size());
		 
		 for (WebElement linkElement:links)
		 {
			String hrefattvalue = linkElement.getAttribute("href");
			
			if (hrefattvalue==null || hrefattvalue.isEmpty())
			{
				System.out.println(hrefattvalue+" href value is empty or null");
				continue;
			}
			
			try 
			{
				URL linkUrl = new URL(hrefattvalue);
				HttpURLConnection conn = (HttpURLConnection) linkUrl.openConnection();
				conn.connect();
				
				if (conn.getResponseCode()>=400)
				{
					System.out.println(hrefattvalue+ " ====> Broken link");
				}
				else 
				{
					System.out.println(hrefattvalue+ " ====> is not a broken link");
				}
				
			} catch (Exception e) 
			{
				
			}
		 }
	}

}
