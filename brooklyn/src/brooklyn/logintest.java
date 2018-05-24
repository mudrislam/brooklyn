package brooklyn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class logintest {
 WebDriver driver;
	
 @BeforeMethod
  public void setup() {
 
	 System.setProperty("webdriver.gecko.driver","/Users/muhammedrislam/selenium_jar_files/geckodriver");
  driver = new FirefoxDriver();
  driver.manage().window().fullscreen();
  driver.manage().deleteAllCookies();
  driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
  driver.get("http:www.google.com");
 }
  @Test
  public void googletitletest() {
  String tilte = driver.getTitle();
System.out.println(tilte);  }

@Test
public void googlelogotest() {
	boolean a = driver.findElement(By.xpath("//*[@id=\'hplogo\']")).isDisplayed();
}
@Test
public void maillinktest() {
	boolean b = driver.findElement(By.linkText("mail")).isDisplayed();
	
}
@AfterMethod
public void teardown() {
	driver.quit();
}







}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

