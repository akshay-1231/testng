package testpackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

@Test
public class NewTest1 {
	public static WebDriver dr3;
  public void f() {
	  dr3.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Akshay");
	  
	  dr3.findElement(By.xpath("//input[@name='lastName']")).sendKeys("prajapati");
	  dr3.findElement(By.xpath("//input[@name='phone']")).sendKeys("7118167057"); 
	  dr3.findElement(By.xpath("//input[@name='userName']")).sendKeys("aksha@gmail.com");
	  dr3.findElement(By.xpath("//input[@name='address1']")).sendKeys("jamner"); 
	  dr3.findElement(By.xpath("//input[@name='city']")).sendKeys("jalgaon");
	  dr3.findElement(By.xpath("//input[@name='state']")).sendKeys("maharashtra");
	  
  }
  @BeforeTest
  public void beforeTest() {
		 dr3=new ChromeDriver();
		dr3.get("https://demo.guru99.com/test/newtours/register.php");
  }

}
