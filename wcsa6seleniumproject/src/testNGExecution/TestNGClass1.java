package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGClass1 {
  @Test
  public void method1() {
	  Reporter.log("TestNgClass1: Method 1",true);
  }
  @Test
  public void method2() {
	  Reporter.log("TestNgClass1: Method 2",true);
  }
}
