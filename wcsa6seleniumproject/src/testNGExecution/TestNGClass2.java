package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGClass2 {
  @Test
  public void method3() {
	  Reporter.log("TestNgClass2: Method 3",true);
  }
  @Test
  public void method4() {
	  Reporter.log("TestNgClass2: Method 4",true);
  }
}
