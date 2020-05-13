package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searcingpage {

	public WebDriver ldriver;

	public Searcingpage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);

	}

	@FindBy(id = "SearchEmail")
	WebElement searchtap;

	@FindBy(id = "SearchFirstName")
	WebElement firstnametab;

	@FindBy(id = "SearchLastName")
	WebElement searchlasttap;

	@FindBy(id = "search-customers")
	WebElement searchbtn;
	@FindBy(id = "customers-grid")
	WebElement table;
	@FindBy(xpath = ("//*[@id=\"customers-grid\"]/tbody/tr"))
	List<WebElement> rowno;

	@FindBy(xpath = ("//*[@id=\"customers-grid\"]/tbody/tr/td"))
	List<WebElement> columno;


	public void seachemail(String email) {
		searchtap.sendKeys(email);

	}

	public void searchEnterfirstnametab(String firstname) {
		firstnametab.sendKeys(firstname);
	}

	public void seachlastname(String lname) {
		searchlasttap.sendKeys(lname);

	}

	public void clicksearch() {

		searchbtn.click();
	}

	public int rowcount() {

		return (rowno.size());
	}

	public int columcount() {

		return (columno.size());
	}

	public boolean searchcustomerbyemail(String email) {
		boolean flack = false;
		for (int i = 1; i <= rowcount(); i++) {
			String getemail = table.findElement(By.xpath("//*[@id=\"customers-grid\"]/tbody/tr[" + i + "]/td[2]"))
					.getText();
			if (getemail.equals(email)) {
				System.out.println("Emails are verified");
				flack = true;
			}

		}
		return flack;
	}

	public boolean searchingbyfirstname(String firstname, String lastname) {
		boolean flag = false;
		for (int i = 1; i <= rowcount(); i++) {
			String getname = table.findElement(By.xpath("//*[@id=\"customers-grid\"]/tbody/tr[" + i + "]/td[3]"))
					.getText();
			String fname[] = getname.split(" ");
			if (fname[0].equals(firstname) && fname[1].equals(lastname)) {
				System.out.println("verify correct fname");
				flag = true;

			}
		}
		return flag;

	}

}
