package testpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class assignment {
	public static WebDriver dr;
  @Test
  public void login() {
	
	  dr.manage().window().maximize();

	  System.out.println(dr.getTitle());

	  System.out.println(dr.getCurrentUrl());




	WebElement we5 = dr.findElement(By.name("name"));

	we5.sendKeys("akshay");

	System.out.println(we5.getAttribute("value"));

	

	WebElement we1 = dr.findElement(By.name("email"));

	we1.sendKeys("akshay424206@gmail.com");

	System.out.println(we1.getAttribute("value"));

	  

	dr.findElement(By.xpath("//input[@name='name']//following::input[1]")).sendKeys("akshay424206@gmail.com");

	  

	  dr.findElement(By.xpath("//input[@name='name']//following::button[1]")).click();

	  

	  WebElement we = dr.findElement(By.name("title"));

		we.sendKeys("Mr");

		we.click();

	  dr.findElement(By.xpath("//input[@name='password']")).sendKeys("akshay@424206");

	  Select sr = new Select(dr.findElement(By.xpath("//input[@name='password']//following::select[1]")));

	  sr.selectByVisibleText("12");

	  Select sr1 = new Select(dr.findElement(By.xpath("//input[@name='password']//following::select[2]")));

	  sr1.selectByVisibleText("May");

	  Select sr2 = new Select(dr.findElement(By.xpath("//input[@name='password']//following::select[3]")));

	  sr2.selectByVisibleText("2000");

	 WebElement we9 = dr.findElement(By.id("newsletter"));

	we9.sendKeys("1");

	we9.click();

	

	dr.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Akshay");

	dr.findElement(By.xpath("//input[@name='first_name']//following::input[1]")).sendKeys("prajapati");

	dr.findElement(By.xpath("//input[@name='first_name']//following::input[2]")).sendKeys("jamner");

 

	 WebElement we2 = dr.findElement(By.id("country"));

		we2.sendKeys("India");

		we2.click();

		dr.findElement(By.xpath("//input[@name='first_name']//following::input[3]")).sendKeys("jamner");

		dr.findElement(By.xpath("//input[@name='state']")).sendKeys("Maharastra");

		dr.findElement(By.xpath("//input[@name='state']//following::input[1]")).sendKeys("jamner");

		dr.findElement(By.xpath("//input[@name='state']//following::input[2]")).sendKeys("424206");

		dr.findElement(By.xpath("//input[@name='state']//following::input[3]")).sendKeys("7218167057");

		dr.findElement(By.xpath("//input[@name='state']//following::input[1]")).sendKeys("54564444644");
	  
		dr.findElement(By.xpath("//input[@name='state']//following::button[1]")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  dr =new ChromeDriver();
	  dr.get(" https://automationexercise.com/login");
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  dr.close();
  }

}
