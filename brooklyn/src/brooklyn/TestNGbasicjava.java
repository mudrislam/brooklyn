package brooklyn;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGbasicjava {

// precondition annotations ---- starting with at before 	
	@BeforeSuite
 public void setup() {
	System.out.println("setup the system property for firefox"); 
 }
@BeforeClass
public void lounchBrowser() {
	System.out.println("lounch firefox Browser");
}
@BeforeTest
public void login()
{
	System.out.println("login to app");
}

@BeforeMethod
public void enterurl() {
	System.out.println("enter url");
}
// test case --- stsrting with @test
@Test
public void googletiltetest()
{
	System.out.println("google title test");
}
@Test
public void searchtitle() {
	System.out.println("seacrch title");
}

@Test
public void goolgelogotest() {
	System.out.println("google logo test");
}

//post condition --- strat with @after


@AfterMethod
public void logout() {
	System.out.println("log out");
}

@AfterTest
public void deleteAllcookies() {
	System.out.println("delete all cookies");
}

@AfterClass
public void closeBrowser() {
	System.out.println("close broswer");
}
@AfterSuite
public void generateTestReport() {
	System.out.println("generate test report");
}











}

