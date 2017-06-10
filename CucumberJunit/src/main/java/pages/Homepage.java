package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;



	@FindBy(xpath = "//div[@class='top-navigation__xtra-login']/div/section/button")
	WebElement lnkSignIn;


	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	
	public void clickOnSinLink() {
		
		lnkSignIn.click();
	}
}
