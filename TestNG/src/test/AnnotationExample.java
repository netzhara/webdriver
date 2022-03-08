package test;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationExample {
	
	@BeforeGroups("sanity")
	public void beforeTest() {
		System.out.println("Inside Before Group");
	}
	
	@BeforeMethod(alwaysRun=true)
	public void beforeMethod() {
		System.out.println("Inside Before Method");
	}
	
	
	@Test(groups= {"sanity","regression"})
	public void test1() {
		System.out.println("Inside Test case 1");
		
	}
	
	@Test(groups= {"regression"}, enabled=true, description="to test all the login scenarios")
	public void test2() {
		System.out.println("Inside Test case 2");
		
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Inside After Method");
	}
	
	@AfterGroups("sanity")
	public void afterTest() {
		System.out.println("Inside After Groups");
	}
	

}
