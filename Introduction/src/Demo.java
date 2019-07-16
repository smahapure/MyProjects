import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//invoke .exe file of chrome first
		//create driver object for Chrome browser
		System.setProperty("webdriver.gecko.driver","D:\\Softwares\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette",true);
		//System.setProperty("webdriver.chrome.driver","D:\\Softwares\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		//WebDriver driver = new FireFox();
		WebDriver driver= new FirefoxDriver(capabilities);

		driver.get("https://www.google.com");
		

	}

}
