package S1_Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_xpathByText2
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
	
		//click on login btn
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}
}
