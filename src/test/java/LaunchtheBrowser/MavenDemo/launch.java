package LaunchtheBrowser.MavenDemo;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class launch {
	WebDriver driver;
  @Test
  public void f(){
	  driver.get("http://10.232.237.143:443/TestMeApp/");
	  driver.findElement(By.linkText("SignIn")).click();
	  driver.findElement(By.name("userName")).sendKeys("Lalitha");
	  driver.findElement(By.name("password")).sendKeys("Password123");
	  driver.findElement(By.name("Login")).click();
	  Assert.assertEquals(driver.getTitle(),"Home");
	  List links=driver.findElement(By.tagName("a"));
	  StringBuilder stringBuilder = new StringBuilder();
	stringBuilder.append("Number of links:");
	stringBuilder.append(links.size());
	System.out.println(stringBuilder.toString());
	  
	    
}
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Sowmya\\Drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.findElement(By.linkText("SignOut")).click();
	  driver.close();
}

}