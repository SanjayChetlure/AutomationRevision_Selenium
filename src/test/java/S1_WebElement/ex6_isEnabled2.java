package S1_WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex6_isEnabled2
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(4000);
		
		boolean result = driver.findElement(By.xpath("//button[@class=' _aswp _aswr _aswu _asw_ _asx2']")).isEnabled();
		System.out.println(result);
		
		if (result) 
		{
			System.out.println("Element is Enabled");
		}
		else
		{
			System.out.println("Element is disabled");
		}
	}
}
