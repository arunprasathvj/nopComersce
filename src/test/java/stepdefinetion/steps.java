package stepdefinetion;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Loginpage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class steps {
	public Loginpage lp;
	
	public WebDriver driver ;
	@Given("User open chromebrowser")
	public void user_open_chromebrowser() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    driver = new ChromeDriver ();
	    lp = new Loginpage(driver);
	}

	@When("^User open url \"([^\"]*)\"$")
	public void user_open_url(String url) throws Throwable {
		driver.get(url);
		Thread.sleep(5000);
	   
	}

	@Then("^Then User enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void then_User_enter_username_and_password(String email, String pwd) throws Throwable {
	   lp.setusername(email);
	   lp.setpassword(pwd);
	}

	@And("Click login")
	public void click_login() throws Throwable {
		lp.clicklogin();
	   
	}

	@When("^User check to be \"([^\"]*)\"$")
	public void user_check_to_be(String title)  {
		
		if(driver.getPageSource().contains("Login was unsuccessful") ) {
			driver.close();
			Assert.assertTrue(false);
			
		}
		else {
		
	   Assert.assertEquals(driver.getTitle(), title);
		}
	}

	@Then("User click logout")
	public void user_click_logout() throws Throwable {
		lp.clicklogout();
	  
	}
	
	@And("User close browser")
	public void User_close_browser()  {
		driver.close();
	  
	}

}
