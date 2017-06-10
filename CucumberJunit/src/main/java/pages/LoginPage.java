package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	@FindBy(xpath = "//input[@id='loginName']")
	WebElement emailTxt;

	@FindBy(xpath = "//input[@id='password']")
	WebElement emailPassword;

	@FindBy(xpath = "//button[@class='btn large']")
	WebElement loginbtn;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void login() {
		
		driver.switchTo().frame(0);
		emailTxt.clear();
		emailTxt.sendKeys("kishan panda");
		emailPassword.clear();
		emailPassword.sendKeys("kissaN@jun17");
		loginbtn.click();
		driver.switchTo().defaultContent();
	}
}
