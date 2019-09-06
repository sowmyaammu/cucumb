package LaunchtheBrowser.MavenDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {
	
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Sowmya\\Drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://google.com");
	  Thread.sleep(3000);
	  driver.close();
  }
}
