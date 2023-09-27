package testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotations {
  @Test
  public void method_Test_Annotataion() {
	  Reporter.log("TestAnnotations",true);
  }
  
  @BeforeMethod
  public void method_Before_MethodAnnottaion()
  {
	  Reporter.log("BeforMethodAnnotations",true);
  }
  @AfterMethod
  public void method_After_MethodAnnotation()
  {
	  Reporter.log("AfterMethodAnnotation",true);
  }
  @BeforeClass
  public void method_Beforeclass_Annotation()
  {
	  Reporter.log("BeforeClassannotation",true);
  }
  @AfterClass
  public void method_Afterclass_Annotation()
  {
	  Reporter.log("AfterClassAnnotation",true);
  }
  @BeforeTest
  public void method_BeforeTest_Annotation()
  {
	  Reporter.log("BeforeTestAnnotation",true);
  }
  @AfterClass
  public void method_AfterTest_Annotation()
  {
	  Reporter.log("AfterTestAnnotation",true);
  }
  @BeforeSuite
  public void method_Beforesuite_Annotation()
  {
	  Reporter.log("BeforeSuiteAnnotation",true);
  }
  @AfterSuite
  public void method_Aftersuite_Annotation()
  {
   Reporter.log("AfterSuiteAnnotation",true);
 }
  
}
