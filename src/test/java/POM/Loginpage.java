package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	public WebDriver ldriver;
	
	public Loginpage(WebDriver rdiver) {
		ldriver = rdiver;
		PageFactory.initElements(ldriver, this);
		
	}
	
	@FindBy(xpath="(//*[@id=\"Email\"])")
	WebElement txtusername;
	
    @FindBy(xpath="(//*[@id=\"Password\"])")
    WebElement txtpasword;
    
    @FindBy(xpath="(//*[@type=\"submit\"])")
    WebElement loginbtn;
    
    @FindBy(xpath="/html/body/div[3]/div[1]/div/div/ul/li[3]/a")
    WebElement logoutbtn;
    
    public void setusername(String uname) {
    	txtusername.clear();
    	txtusername.sendKeys(uname);
    	
    }
    
    public void setpassword(String pwd) {
    	txtpasword.clear();
    	txtpasword.sendKeys(pwd);
    	
    }
    
    public void clicklogin() {
    	loginbtn.click();
    	
    }
    public void clicklogout() {
    	logoutbtn.click();
    	
    }
    
    
    
    
    
}
