package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import pages.Homepage;
import pages.LoginPage;
import testBase.TestBase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StepDefinition extends TestBase {
	
	private final Logger slf4jLogger = LoggerFactory.getLogger(StepDefinition.class);
	TestBase objtestbase=new TestBase();
	Homepage objhomepae=new Homepage(driver);
	@Before
    public void intializeTest(){
		
		objtestbase.intialize();
    }
	
	@After
	public void closeAllBrowse(){
		objtestbase.closeBrowser();
	}
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page()  {
		Homepage objhomepae=new Homepage(driver);
		objhomepae.clickOnSinLink();
	    // Write code here that turns the phrase above into concrete actions
		slf4jLogger.info("This is a test logger");
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page()  {
		LoginPage objloginPage=new LoginPage(driver);
		//objloginPage.login();
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
}
