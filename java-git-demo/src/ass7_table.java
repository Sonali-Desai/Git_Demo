import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass7_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		int column=driver.findElements(By.cssSelector(".table-display th")).size();
		System.out.println("Number of column="+column);
		int row=driver.findElements(By.cssSelector(".table-display tr")).size();
		System.out.println("Number of rows="+row);
		String text=driver.findElement(By.cssSelector(".table-display tr:nth-child(3)")).getText();
		System.out.println(text);
	}

}
