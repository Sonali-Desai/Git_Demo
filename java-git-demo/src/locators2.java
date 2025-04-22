import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.lang.Thread;

public class locators2 {

	public static void main(String[] args)throws InterruptedException  {
	
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		 String name="rahul";
		 String pass=getPass(driver);
		 driver.get("https://rahulshettyacademy.com/locatorspractice/"); 
		 driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
		 driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(pass);
		 driver.findElement(By.id("chkboxOne")).click();
		 driver.findElement(By.id("chkboxTwo")).click();
		 driver.findElement(By.className("submit")).click();
		 Thread.sleep(2000);
		 driver.close();

	}
	public static String getPass(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/"); 
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		//Thread.sleep(1000);
		String password=driver.findElement(By.cssSelector("form p")).getText();
		String[] pass1=password.split("'");
		String pass2=pass1[1].split("'")[0];
		return pass2;
	}

}
