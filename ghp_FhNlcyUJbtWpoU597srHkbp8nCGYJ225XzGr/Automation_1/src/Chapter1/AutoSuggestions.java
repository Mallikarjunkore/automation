package Chapter1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("dress");
		List<WebElement> autosuggestions=driver.findElements(By.xpath("//span[text()=\"dress\"]"));
		
		System.out.println(autosuggestions.size());
		
		for(WebElement x:autosuggestions)
		{
			System.out.println(x.getText());
		}
		
		driver.quit();

	}

}
