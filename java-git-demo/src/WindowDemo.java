import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.className("blinkingText")).click();
		Set <String> window=driver.getWindowHandles();
		Iterator<String> it=window.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		String text=driver.findElement(By.cssSelector(".im-para.red")).getText();
		System.out.println(text);
		//String[] uname=text.split(" ");
		String[] uname=text.split("at")[1].trim().split(" ");
		System.out.println(uname[0]);
		driver.switchTo().window(parent);
		driver.findElement(By.id("username")).sendKeys(uname[0]);
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();

		
	}

}
