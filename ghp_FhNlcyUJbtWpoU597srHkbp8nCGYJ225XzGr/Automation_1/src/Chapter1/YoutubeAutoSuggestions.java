package Chapter1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class YoutubeAutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver =new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
		WebElement youtubepage=driver.findElement(By.id("logo-icon"));
		if(youtubepage.isDisplayed())
			System.out.println("pass");
		else
			System.out.println("fail");
		
		WebElement search=driver.findElement(By.xpath("//input[@id='search']"));
		search.sendKeys("kgf");
		Thread.sleep(3000);
		
		List<WebElement> Autosuggesions= driver.findElements(By.xpath("//div[@class='sbqs_c']"));
		
		for(WebElement suggestions: Autosuggesions )
			System.out.println(suggestions.getText());
		
		driver.quit();

	}

}
