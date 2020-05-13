package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Addnewpage {
   
	public WebDriver ldriver;
	
	public Addnewpage(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
		
	}
	
	
	@FindBy(id="nopSideBarPusher")
	WebElement dashboardbtn;
	
	@FindBy(xpath=("//a[@href='#']//span[contains(text(),'Customers')]"))
	WebElement customersbtn;
	
	@FindBy(xpath=("/html/body/div[3]/div[2]/div/ul/li[4]/ul/li[1]/a/span"))
	WebElement customerbtn;
	
	@FindBy(xpath=("//*[@class=\"btn bg-blue\"]"))
	WebElement addnewbtn;
	
	@FindBy(id="Email")
	WebElement txtemail;
	
	@FindBy(id="Password")
	WebElement txtpassword;
	
	
	@FindBy(id="FirstName")
	WebElement txtfirstname;
	
	@FindBy(id="LastName")
	WebElement txtlastname;
	
	@FindBy(xpath=("//*[@name=\"DateOfBirth\"]"))
	WebElement dop_btn;
	
	@FindBy(id="Company")
	WebElement txtcompanyname;
	
	@FindBy(xpath=("//*[@name=\"save\"]"))
	WebElement btnsave;
	
	public void clickdashboard() {
		
		dashboardbtn.click();
	}
    public void clickcustomers() {
    	customersbtn.click();
    	
   
	}
    public void clickcustomer() {
		
    	customerbtn.click();
	}
    public void clickaddnew() {
		
    	addnewbtn.click();
	}
    public void setemail(String email) {
		
    	txtemail.sendKeys(email);
	}
    public void setpassword(String pwd) {
		
    	txtpassword.sendKeys(pwd);
	}
    public void setfirstname(String firstname) {
    	txtfirstname.sendKeys(firstname);
		
	}
    public void setlastname(String lastname) {
    	txtlastname.sendKeys(lastname);
		
	}
   public void setdob(String date) {
		
    	dop_btn.click();
    	dop_btn.sendKeys(date);
	}
    public void setcompanyname(String companyname) {
    	txtcompanyname.sendKeys(companyname);
		
	}
		
	
    
    
    public void clicksave() {
		
    	btnsave.click();
	}
   
}
