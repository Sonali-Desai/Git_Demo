import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalendarUi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		String date="16";
		String month="11";
		String year="2025";
		String[] eList= {month,date,year};
		driver.findElement(By.xpath("//button[@type='button'][2]")).click();
		driver.findElement(By.className("react-calendar__navigation__label")).click();
		driver.findElement(By.className("react-calendar__navigation__label")).click();
		
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.cssSelector(".react-calendar__tile")).get(Integer.parseInt(month)-1).click();
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
		List<WebElement> aList= driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		for(int i=0;i<aList.size();i++)
		{
			System.out.println(aList.get(i).getDomAttribute("value"));
			Assert.assertEquals(aList.get(i).getDomAttribute("value"), eList[i]);
		}
		
		
	}

}
