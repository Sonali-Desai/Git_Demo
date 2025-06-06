
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/gp/css/homepage.html/ref=nav_bb_ya");
		driver.manage().window().maximize();
		WebElement move=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a=new Actions(driver);
		a.moveToElement(move).build().perform();
		//to send captial letters
a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
driver.findElement(By.id("twotabsearchtextbox")).clear();
	//to select text with double click
a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
   //to right click
a.moveToElement(move).contextClick().build().perform();
	}

}
