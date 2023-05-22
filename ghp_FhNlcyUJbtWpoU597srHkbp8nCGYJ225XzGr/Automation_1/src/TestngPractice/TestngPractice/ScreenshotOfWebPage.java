package TestngPractice.TestngPractice;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScreenshotOfWebPage {
	
	public static void main (String[] args)
	{
	
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	
	WebDriver driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File ("C:\\Users\\Mallikarjun\\eclipse-workspace\\SkillRary\\src\\Screenshot/Mallikarjun.png");
	FileUtils.copyFile(src,dest);
	
}

}
