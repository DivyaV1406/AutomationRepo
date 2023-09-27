package TestNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Remo {
  @Test
  public void method3() {
	 Reporter.log("method3", 0);
  } 
  @Test
  public void method4() {
	 Reporter.log("method4", 0);
  }
}
