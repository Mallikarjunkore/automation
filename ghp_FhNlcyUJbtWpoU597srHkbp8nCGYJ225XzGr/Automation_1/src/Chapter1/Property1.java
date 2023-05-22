package Chapter1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Property1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("./file1.properties");
		Properties property =new Properties();
		property.load(fis);
		
		String url1=property.getProperty("url");
		String search1=property.getProperty("search");
		
		System.out.println(url1);
		
		//ChromeOptions option =new ChromeOptions();
		//option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.findElement(By.name("q")).sendKeys("hello");
		
		driver.quit();
		
		
		
	}

}
