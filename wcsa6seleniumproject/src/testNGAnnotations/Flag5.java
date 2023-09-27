package testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
	 @Test(description = "Perfors Login")
	  public void loginMethod() {
		  System.out.println("used to Perform Log in");
	  }
	  @Test(description = "Performs create user",dependsOnMethods = "loginMethod")
	  public void createuserMethod() {
		  System.out.println("User created!!");
	  }
	  @Test(description = "Performs Log Out",dependsOnMethods = "createuserMethod")
	  public void mlogoutMethod() {
		  System.out.println("Used to perform logout");
	  }
}
