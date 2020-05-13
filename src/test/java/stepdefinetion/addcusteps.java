package stepdefinetion;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Addnewpage;
import POM.Loginpage;
import POM.Searcingpage;
import Utils.Waithelper;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class addcusteps {
	public WebDriver driver;
	public Loginpage lp;
	public Addnewpage ad;
	public Searcingpage sc;
	public Waithelper wait;
	public Logger logger;
	
	@Before 
	public void beforeclass() {
		
		logger = Logger.getLogger("nopComersce");
		PropertyConfigurator.configure("log4j.properties");
	}

	@Given("^User open chrome browser$")
	public void user_open_chrome_browser() throws Throwable {
		logger.info("*******Chrome Browser Opened*********");

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		lp = new Loginpage(driver);

	}

	@When("^User enter url \"([^\"]*)\"$")
	public void user_enter_url(String url) throws Throwable {
		logger.info("*******User enter URL *********");

		driver.get(url);
	}

	@Then("^User enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enter_username_and_password(String email, String pwd) throws Throwable {
		logger.info("*******User entered UserName and Password*********");
		lp.setusername(email);
		lp.setpassword(pwd);

	}

	@Then("User Click login")
	public void user_Click_login() throws Throwable {
		lp.clicklogin();
	}

	@Then("^Verify page title \"([^\"]*)\"$")
	public void verify_page_title(String title) throws Throwable {

		if (driver.getPageSource().contains(title)) {
			System.out.println("Login Success");
			logger.info("*******User Successfully Login*********");
		}
	}

	@Then("^User click customer$")
	public void click_customer() throws Throwable {
		ad = new Addnewpage(driver);
		ad.clickcustomers();

	}

	@Then("click customers")
	public void click_customers() throws Throwable {
		logger.info("*******User click customers sub menu*********");
		ad.clickcustomer();
		Thread.sleep(5000);

	}

	@Then("User to be click addnew")
	public void user_to_be_click_addnew() throws Throwable {
		ad.clickaddnew();

	}

	@When("^user enter email \"([^\"]*)\"$")
	public void user_enter_email(String email) throws Throwable {
		logger.info("*******User entered all detaills *********");
		ad.setemail(email);
	}

	@When("^user enter password \"([^\"]*)\"$")
	public void user_enter_password(String pwd) throws Throwable {
		ad.setpassword(pwd);

	}

	@Then("^user enter firstname \"([^\"]*)\"$")
	public void user_enter_firstname(String firstname) {
		ad.setfirstname(firstname);
	}

	@Then("^user enter Lastname \"([^\"]*)\"$")
	public void user_enter_Lastname(String lastname) throws Throwable {
		ad.setlastname(lastname);
	}

	@Then("click date of brith")
	public void click_date_of_brith() throws Throwable {
		System.out.println("dob");

	}

	@Then("^User choose date \"([^\"]*)\"$")
	public void user_choose_date(String date) throws Throwable {
		ad.setdob(date);
	}

	@Then("^User enter company name \"([^\"]*)\"$")
	public void user_enter_company_name(String companyname) throws Throwable {
		ad.setcompanyname(companyname);
	}

	@Then("Click save")
	public void click_save() throws Throwable {
		ad.clicksave();
	}

	@Then("^User check Response \"([^\"]*)\"$")
	public void user_check_Response(String rebonse) throws Throwable {
		if (driver.getPageSource().contains(rebonse)) {

			System.out.println("User Add sucessfully");
		} else {
			System.out.println("user add data faill");
		}
		logger.info("*******User Successfully Add new Customer*********");
	}

	@Then("User will close browser")
	public void user_will_close_browser() {
		driver.close();
	}

	@When("^User enter customer email \"([^\"]*)\"$")
	public void user_enter_customer_email(String email) {
		logger.info("*******User enter email*********");
		sc = new Searcingpage(driver);
		sc.seachemail(email);
	}

	@Then("^User click search$")
	public void user_click_search() throws Throwable {
		sc.clicksearch();

	}

	@Then("^chech email showing on the table is \"([^\"]*)\"$")
	public void chech_email_showing_on_the_table_is(String email) {
		logger.info("*******veriffed customer email *********");
		sc.searchcustomerbyemail(email);

	}

	@Then("^User close browser$")
	public void user_close_browser() throws Throwable {
		driver.close();
	}

	@When("^User enter firstnametab customer firstname \"([^\"]*)\"$")
	public void user_enter_firstnametab_customer_firstname(String firstname) throws Throwable {
		sc.searchEnterfirstnametab(firstname);
	}

	@Then("^chech firstname showing on the table is \"([^\"]*)\" and lastname \"([^\"]*)\"$")
	public void chech_firstname_showing_on_the_table_is_and_lastname(String frname, String lastname) {
		String getname = driver.findElement(By.xpath("//*[@id=\"customers-grid\"]/tbody/tr[1]/td[3]")).getText();
		String fname[] = getname.split(" ");
		if (fname[0].equals(frname) && fname[1].equals(lastname)) {
			System.out.println("verify correct fname");

		}
		logger.info("*******veriffed customer name *********");
	}

	@When("^User enter UserFirstname \"([^\"]*)\"$")
	public void user_enter_UserFirstname(String fname) throws Throwable {
		driver.findElement(By.id("SearchFirstName")).sendKeys(fname);
		logger.info("*******User entered FirstName*********");

	}

	@Then("^User will be click search button$")
	public void user_will_be_click_search_button() throws Throwable {
		driver.findElement(By.id("search-customers")).click();

	}

}
