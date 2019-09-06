package LaunchtheBrowser.MavenDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	driver.get("http://10.232.237.143:443/TestMeApp/");
	  driver.manage().window().maximize();
	  WebElement about=driver.findElement(By.xpath("//span[contains(text(),'AboutUs')]"));
	  Thread.sleep(3000);
			  Actions act1=new Actions(driver);
	  act1.moveToElement(about).click().build().perform();
	  act1.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Our')]"))).click().build().perform();
	  act1.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Chennai')]"))).click().build().perform();
	  Set<String> set=driver.getWindowHandles();
	  for(String string : set)
	  {
		  driver.switchTo().window(string);
	  }
	  
	  driver.switchTo().frame(driver.findElement(By.name("main_page")));
	  String address=driver.findElement(By.tagName("address")).getText();
	  System.out.println(address);
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Sowmya\\Drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	driver.quit();
  }

}
