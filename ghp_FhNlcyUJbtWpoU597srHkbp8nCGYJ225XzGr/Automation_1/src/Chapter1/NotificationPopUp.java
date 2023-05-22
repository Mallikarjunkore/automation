package Chapter1;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> contentSettings=new HashMap<>();
		contentSettings.put("notifications",0);
		contentSettings.put("geolocation",0);
		
		HashMap<String,Object> profile=new HashMap<>();
		profile.put("managed_default_conetent_settings", contentSettings);
		
		HashMap<String,Object> preference=new HashMap<>();
		preference.put("profile",profile);
		
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.setExperimentalOption("prefs", preference);
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.ajio.com/");
		Thread.sleep(8000);
		//driver.quit();
		

	}

}
