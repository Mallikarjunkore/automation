package TestngPractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class practice9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--remote-allow-origins=*");
		
		
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement facebookPage=driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		if(facebookPage.isDisplayed())
			System.out.println("Login page displayed");
		else
			System.out.println("Login page not displayed");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("100008177198415");
		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("rcbforlife321");
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		
		WebElement HomePage=driver.findElement(By.xpath("//span[text()=\"Home\"]"));
		if(HomePage.isDisplayed())
			System.out.println("Homepage is displayed");
		else
			System.out.println("HomePage is not Displayed");
		
		driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys("Mallikarjun");
		driver.quit();
		
			
		

	}

}
