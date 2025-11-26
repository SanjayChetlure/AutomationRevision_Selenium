package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_xpathByAttribute1 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(locator type)
		//driver.findElement(By.xpath("xpathExpression"))
		
		//enter UN
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		
		//enter pwd
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys("xyz");
		
		//click on login btn
		driver.findElement(By.xpath("//button[@name='login']")).click();	
	}
}
