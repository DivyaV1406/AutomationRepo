package testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
  @Test(description = "Performance LogIn" ,enabled=true)
  public void method1() {
	  Reporter.log("method1",true);
  }
  @Test(description = "Performance Create user" ,enabled=true)
  public void method2() {
	  Reporter.log("method2",true);
  }
  @Test(description = "Performance Log out" ,enabled=true)
  public void method3() {
	  Reporter.log("method3",true);
  }
  
}
