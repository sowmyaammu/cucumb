package LaunchtheBrowser.MavenDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class f(){
	WebDriver driver; 
  @Test
  public void  {
	  driver.get("http://10.232.237.143:443/TestMeApp/");
	  Thread.sleep(3000);
  }
  @BeforeTest
  public void ConfigureBrowser() {
	  .
  }
  

  @AfterTest
  public void closeApplication() {
	  driver.close();
  }

}
