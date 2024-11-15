package testpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class parameter {
	public static WebDriver dr;
	
  @Test
  @Parameters({"un","pw"})
  public void login(String un,String pw) {
	  dr.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
	  dr.findElement(By.xpath("//input[@name='password']")).sendKeys(pw); 
	  dr.findElement(By.xpath("//button[@id='submit']")).click() ;
  }  @BeforeTest
  public void beforeTest() {
	   dr =new ChromeDriver();
	   dr.get("https://practicetestautomation.com/practice-test-login/");
  }

  @AfterTest
  public void afterTest() {
	  dr.close(); 
  }

}
