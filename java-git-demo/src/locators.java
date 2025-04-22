import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.lang.Thread;
import org.testng.Assert;

public class locators {

	public static void main(String[] args)throws InterruptedException  {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 driver.get("https://rahulshettyacademy.com/locatorspractice/");
		 //By.ID attribute
		/* driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		 //By.Name attribute
		 driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		 //By.className attribute
		 driver.findElement(By.className("submit")).click();
		 //By.cssSelector with tagName.className
		 System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		 //By.linkText
		 driver.findElement(By.linkText("Forgot your password?")).click();
		 Thread.sleep(1000);//changing view of the webpage so to wait
		 //By.xpath 
		 driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("abc");
		 //By.cssSlector 
		 driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("abc@gmail.com");
		 //By.xpath from parent to 3rd child using index
		 driver.findElement(By.xpath("//form/input[3]")).sendKeys("9876543210");
		 //By.cssSelector with .className
		 driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		 //By.cssSelector from parent to child
		 System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		 //By.cssSelector from parent to child with index
		 driver.findElement(By.cssSelector("div button:nth-child(1)")).click();
		 Thread.sleep(1000);*/
		 String name="rahul";
		 driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
		 //By.cssSelector with partial text
		 driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		 driver.findElement(By.id("chkboxOne")).click();
		 driver.findElement(By.id("chkboxTwo")).click();
		 driver.findElement(By.className("submit")).click();	
		 Thread.sleep(1000);// wait to go to next page
		 //By.tagName 
		 String text=driver.findElement(By.tagName("p")).getText();
		 System.out.println(text);
		 Assert.assertEquals(text,"You are successfully logged in.");
		 String text2=driver.findElement(By.tagName("h2")).getText();
		 System.out.println(text2);
		 Assert.assertEquals(text2,"Hello "+name+",");
		 //Xpath with text of the tag
		 driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		 driver.close();
	}

}
