import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticDD=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropd=new Select(staticDD);
		dropd.selectByIndex(3);
		System.out.println(dropd.getFirstSelectedOption().getText());
		dropd.selectByValue("AED");
		System.out.println(dropd.getFirstSelectedOption().getText());
		dropd.selectByVisibleText("INR");
		System.out.println(dropd.getFirstSelectedOption().getText());
		driver.close();
	}

}
