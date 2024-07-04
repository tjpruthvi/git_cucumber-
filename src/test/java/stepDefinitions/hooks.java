package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	@Before ("@Netbanking")
	public void setupForNetbanking()
	{
		System.out.println("setup the entries for netbaking");
		
	}
	@Before ("@Mortgage")
	public void setupForMortgage()
	{
		System.out.println("setup the entries for mortgage");
	}
	@After
	public void tearDown()
	{
		System.out.println("clear the entries");
	}
}


