package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginPage {
  @Test
  public void testFireFox() {
	  
	  System.setProperty("webdriver.gecko.driver","F:\\AUTOMATION\\driver\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.google.com");
	  
	  driver.quit();
  }
}
