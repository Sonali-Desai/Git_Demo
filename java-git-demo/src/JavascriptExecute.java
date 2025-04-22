import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavascriptExecute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//scroll at window level
		js.executeScript("window.scrollBy(0,500)");
		//scroll at table level
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		//sum of all values in last column of table
		List<WebElement>values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		for(int i=0;i<values.size();i++)
		{
			sum=sum+Integer.parseInt(values.get(i).getText());
			
		}
		System.out.println(sum);
		String esum=driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim();
		Assert.assertEquals(sum, Integer.parseInt(esum));
	}

}
