package testBase;

import java.util.concurrent.TimeUnit;

import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;

	public void intialize(){
		setBrowser();
		launchUrl();
	}
	
	public static void setBrowser(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
	}
	
	public  void closeBrowser(){
		driver.close();
		driver.quit();
		
	}

	public static void launchUrl(){
		driver.get("https://www.colruyt.be/nl");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
}
