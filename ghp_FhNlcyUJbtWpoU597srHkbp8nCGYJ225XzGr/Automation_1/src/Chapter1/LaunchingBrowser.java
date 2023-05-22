package Chapter1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	    ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.ajio.com/");
		System.out.println(driver.getTitle());
		//Thread.sleep(8000);
		driver.quit();
		
		//WebDriver driver1=new FirefoxDriver();
		//	driver1.get("https://www.ajio.com/");	
	

	}

}
