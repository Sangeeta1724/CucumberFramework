package seleniumTest;


import java.util.List;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class E2E_Test {
 private static WebDriver driver;
 
 public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\chromedriver.exe");
 driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 driver.get("http://www.gmail.com");
 }
}