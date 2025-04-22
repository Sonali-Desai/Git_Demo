
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//String url=driver.findElement(By.cssSelector("a[href*='soapui']")).getDomAttribute("href");
	//String url=driver.findElement(By.cssSelector("a[href*='broken']")).getDomAttribute("href");
		List <WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for(WebElement link:links)
		{
			String url=link.getDomAttribute("href");
			HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int response=conn.getResponseCode();
			System.out.println(response);
			if(response>400)
			{
				System.out.println("The link with text "+link.getText()+" is broken with code "+response);
				Assert.assertTrue(false);
			}
		}
		
	}

}
