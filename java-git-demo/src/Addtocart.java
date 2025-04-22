import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Addtocart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		String[] items= {"Cucumber","Brocolli","Beetroot"};
        addToCart(driver,items);
        driver.findElement(By.cssSelector("a.cart-icon")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated((By.className("promoInfo"))));
		
		System.out.println(driver.findElement(By.className("promoInfo")).getText());
	
	}
	public static void addToCart(WebDriver driver,String[] items)
	{
		int j=0;
        List<String> veggiList=Arrays.asList(items);
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<products.size();i++)
		{
			
			String[] name=products.get(i).getText().split(" ");
			//String formatName=name[0].trim();
			//Thread.sleep(3000);

			if(veggiList.contains(name[0]))
			{
				j++;
				driver.findElements(By.cssSelector("div.product-action button")).get(i).click();
			}
			if(j==items.length)
				break;
		}
		
	}

}
