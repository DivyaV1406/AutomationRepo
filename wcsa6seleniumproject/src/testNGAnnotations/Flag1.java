package testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
  @Test(description = "Performs Login")
  public void method1() {
	  Reporter.log("method1",true);
  }
  @Test(description = "Performs Create User")
  public void method2() {
	  Reporter.log("method2",true);
  }
  @Test(description = "Performs Log Out")
  public void method3() {
	  Reporter.log("method3",true);
  }
}
