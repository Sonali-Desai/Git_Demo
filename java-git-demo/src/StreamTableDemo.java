import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StreamTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//click on button
		driver.findElement(By.xpath("//tr/th[1]")).click();
		//get the webelements
		List<WebElement> list=driver.findElements(By.xpath("//tr/td[1]"));
		//get the text of webelement using stream
		List<String>oglist=list.stream().map(s->s.getText()).collect(Collectors.toList());
		//sort the original list
		List<String>slist=oglist.stream().sorted().collect(Collectors.toList());
		//compare new sorted list with original list
		Assert.assertTrue(slist.equals(oglist));
		
		//getting the price of veggie whose name is beans
		List<String>prices=list.stream().filter(s->s.getText().contains("Beans")).map(s->getPrice(s)).collect(Collectors.toList());
		prices.stream().forEach(s->System.out.println(s));
	}
	public static String getPrice(WebElement s)
	{
		String price=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}

}
 