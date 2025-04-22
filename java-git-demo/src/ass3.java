import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//input[@value='user']")).click();
		
		WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(3));
		w.until(ExpectedConditions.elementToBeClickable((By.id("okayBtn"))));
		driver.findElement(By.id("okayBtn")).click();
		Select dd=new Select(driver.findElement(By.cssSelector("select[class='form-control']")));
		dd.selectByValue("consult");
		driver.findElement(By.name("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		w.until(ExpectedConditions.elementToBeClickable((By.cssSelector(".btn-primary"))));
		List <WebElement> products=driver.findElements(By.cssSelector(".btn-info"));
		for(int i=0;i<products.size();i++)
		{
			products.get(i).click();
		}
		driver.findElement(By.cssSelector(".btn-primary")).click();
	}
}
