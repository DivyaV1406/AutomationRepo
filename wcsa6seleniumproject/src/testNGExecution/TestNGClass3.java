package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGClass3 {
  @Test
  public void method5() {
	  Reporter.log("TestNgClass3: Method 5",true);
  }
  
  @Test
   public void method6() {
	 int n=5;
	 int a=n/5;
	  Reporter.log("TestNgClass3: Method 6",true);
  }
}
