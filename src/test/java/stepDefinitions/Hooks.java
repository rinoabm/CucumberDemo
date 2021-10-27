package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@SanityTest")
	public void Setup()
	{
		System.out.println("before validating sanity test");
	}
	
	@After("@SanityTest")
	public void TearDown()
	{
		System.out.println("after validating sanity test");
	}

}
