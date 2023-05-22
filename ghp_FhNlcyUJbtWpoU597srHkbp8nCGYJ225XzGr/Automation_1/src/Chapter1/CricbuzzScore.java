package Chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CricbuzzScore {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/");
		
		driver.findElement(By.xpath("//div[@title=\"37th Match • Indian Premier League 2023\"]")).click();
		
		String JaiswalScore=driver.findElement(By.xpath("//div[@class=\"cb-col cb-col-10 ab text-right ng-binding\"]")).getText();
		String RajasthanRoyalsScore=driver.findElement(By.xpath("//h2[@class=\"cb-font-20 text-bold inline-block ng-binding\"]")).getText();
		
		//System.out.println("Jaiswal Score -"+JaiswalScore);
		System.out.println("Rajasthan Royals Total score -"+RajasthanRoyalsScore);
		
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
