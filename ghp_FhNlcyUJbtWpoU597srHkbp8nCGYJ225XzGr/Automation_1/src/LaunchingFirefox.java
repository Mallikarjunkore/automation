import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchingFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("WebDriver.geckodriver.driver", "C:\\Users\\Mallikarjun\\eclipse-workspace\\Automation_1\\geckodriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.ajio.com/");	

	}

}
