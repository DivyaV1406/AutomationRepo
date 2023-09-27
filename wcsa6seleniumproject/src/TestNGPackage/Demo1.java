package TestNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
  @Test
  public void method1() {
	 Reporter.log("method1", 0);
  }
  
  @Test
  public void method2() {
	 Reporter.log("method2", 0);
  }
 
}
