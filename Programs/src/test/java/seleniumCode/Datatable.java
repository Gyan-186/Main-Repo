package seleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datatable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		int col = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("No of rows "+col);
		
		int row = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("No of column "+row);
		
		for (int r=2; r<=row; r++) {
			for  (int c=1; c<=col; c++) {
				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value+"\t");
			}
			System.out.println();
		}
		

	}

}
