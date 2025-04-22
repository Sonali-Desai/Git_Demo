import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
public class ass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Rahul");
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Rahul123");
		driver.findElement(By.id("exampleCheck1")).click();
		
		Select dd=new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		dd.selectByIndex(0);
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("11-11-2011");
		driver.findElement(By.cssSelector(".btn")).click();
		String text=driver.findElement(By.cssSelector(".alert-success")).getText();
		System.out.println(text);
		if(text.contains("Success"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertFalse(false);
		}
		//Assert.assertEquals(text, "Success! The Form has been submitted successfully!.");

	}

}
