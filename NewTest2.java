package testpackage;

import org.testng.annotations.Test;

public class NewTest2 {
  @Test(priority=3)
  public void reg() {
	  System.out.println("register");
  }
  
  @Test(priority=1)
  public void login() {
	  System.out.println("login");
  }
  
  @Test(priority=2)
  public void home() {
	  System.out.println("home");
  }
  
  
}
