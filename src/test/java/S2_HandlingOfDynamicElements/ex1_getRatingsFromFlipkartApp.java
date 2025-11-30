package S2_HandlingOfDynamicElements;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_getRatingsFromFlipkartApp 
{
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//search mobile
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("redmi 13c 5g");
	
		//click on search icon
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		
		String ratings = driver.findElement(By.xpath("((//div[@class='jIjQ8S'])[1]//span[@class='PvbNMB']//span)[2]")).getText();
		System.out.println(ratings);
	}
}
