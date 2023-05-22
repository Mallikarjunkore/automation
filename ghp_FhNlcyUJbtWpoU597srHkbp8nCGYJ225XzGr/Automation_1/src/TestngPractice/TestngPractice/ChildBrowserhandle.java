package TestngPractice.TestngPractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChildBrowserhandle {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			
			WebDriver driver=new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get("https://www.google.co.in/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get("https://www.amazon.com/");
			
			
			
			/*String parent=driver.getWindowHandle();
			System.out.println(parent);
			Set <String> child=driver.getWindowHandles();
			System.out.println(child);
			Thread.sleep(2000);
			
			driver.switchTo().window(parent);
			Thread.sleep(2000);*/
			
			driver.close();

	}

}
