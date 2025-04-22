import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StreamTableDemo2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//click on button
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<String>prices;	
		//getting the price of veggie whose name is rice which on any page
		do
		{
			List<WebElement> list=driver.findElements(By.xpath("//tr/td[1]"));
			prices=list.stream().filter(s->s.getText().contains("Rice")).map(s->getPrice(s)).collect(Collectors.toList());
			prices.forEach(s->System.out.println(s));
		 	if(prices.size()<1)
		 	{
		 		driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
		 	}
		}while(prices.size()<1);
	}
	public static String getPrice(WebElement s)
	{
		String price=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}

}
 
