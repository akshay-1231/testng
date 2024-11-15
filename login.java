package testpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class login {
	public static WebDriver dr;
  @Test

  public void login() {
	  dr.findElement(By.xpath("//input[@name='username']")).sendKeys("student");
	  dr.findElement(By.xpath("//input[@name='password']")).sendKeys("Password123"); 
	  dr.findElement(By.xpath("//button[@id='submit']")).click() ;
	  
  }
  @BeforeTest
  public void beforeTest() {
	   dr =new ChromeDriver();
	   dr.get("https://practicetestautomation.com/practice-test-login/");
  }

  @AfterTest
  public void afterTest() {
	  dr.close();
  }

}
