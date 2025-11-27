package S1_WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex7_isDisplayed
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
        boolean result=false;
		
	    try
        {
             result = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img1']")).isDisplayed();
            System.out.println(result);
        }
        catch (NoSuchElementException e)
        {
            System.out.println(result);
        }


	}
}
