package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.findElementByXPath("//*[@type=\"submit\"]").click();
		driver.findElementByXPath("/html/body/div[3]/div[2]/div/ul/li[4]/a/span").click();
		driver.findElementByXPath("/html/body/div[3]/div[2]/div/ul/li[4]/ul/li[1]/a/span").click();
		driver.findElementById("SearchFirstName").sendKeys("Victoria");
		
		driver.findElementByXPath("//*[@id=\"search-customers\"]").click();
		WebElement table =driver.findElementById("customers-grid");
		
		      for (int i = 1 ; i <3;i++) {
					String name  =table.findElement(By.xpath("//*[@id=\"customers-grid\"]/tbody/tr["+i+"]/td[3]")).getText();
				   String fname[] = name.split(" ");
				    boolean exception = false;
					if(fname[0].equals("Victoria")&& fname[1].equals("Terces")) {
				    	System.out.println("verify correct fname");
	}
				   
				    else if (exception ) {
				    	System.out.println("getMessage");
				    }
	

				     driver.close();
				}
	               	

}}