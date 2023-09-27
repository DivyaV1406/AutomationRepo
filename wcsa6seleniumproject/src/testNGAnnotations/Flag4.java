package testNGAnnotations;

import org.testng.annotations.Test;
import org.testng.Reporter;

//-ve priority will always get executes first
public class Flag4 {
  @Test(priority = 0)
  public void f() {
	  Reporter.log("f",true);
  }
  @Test(priority = 5)
  public void g() {
	  Reporter.log("g",true);
  }
  @Test(priority = 7)
  public void h() {
	  Reporter.log("h",true);
  }
  @Test(priority = 7)
  public void q() {
	  Reporter.log("q",true);
  }
  @Test(priority = 1)
  public void c() {
	  Reporter.log("c",true);
  }
  @Test(priority = 0)
  public void r() {
	  Reporter.log("r",true);
  }
  @Test
  public void z() {
	  Reporter.log("z",true);
  }
  @Test(priority = 2)
  public void a() {
	  Reporter.log("a",true);
  }
  @Test(priority = 3)
  public void l() {
	  Reporter.log("l",true);
  }
  @Test
  public void w() {
	  Reporter.log("w",true);
  }
}
