package stepDefinitions;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
 
public class Steps {
 WebDriver driver;
 
 @Given("^I am on gmail login page$")
 public void i_am_on_gmail_login_page() {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("http://www.gmail.com");
 }
}
