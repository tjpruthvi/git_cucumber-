package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	


@Given("user is on the Netbanking landing page")
public void user_is_on_the_netbanking_landing_page() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("user is on the landing page");
}
@When("^user login to the application with (.+)  and password (.+)$")
public void user_login_to_the_application_with_and_password(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
	  System.out.println("logged in successfully");
	//throw new io.cucumber.java.PendingException();
}

@Then("homepage is displayed")
public void homepage_is_displayed() {
    // Write code here that turns the phrase above into concrete actions
	  System.out.println("home page");
	// throw new io.cucumber.java.PendingException();
}
@Then("cards are displayed")
public void cards_are_displayed() {
    // Write code here that turns the phrase above into concrete actions
	  System.out.println("cards are displayed");
	//throw new io.cucumber.java.PendingException();
}
@When("^user login to the application with (.+)  and password (.+) combination$")
public void user_login_to_the_application_with_and_password_combination(String un, String pd) {
    // Write code here that turns the phrase above into concrete actions
	
	System.out.println(un+" "+pd);
   // throw new io.cucumber.java.PendingException();



}

@When("user signup to the application")

public void user_signup_to_the_application(List<String> data) {
   for (int i=0;i<data.size();i++)
   {
	   
	   System.out.println(data.get(i));
   }
	
}
@Given("setup the entries in the database")
public void setup()
{
	System.out.println("***********");
	System.out.println("setup the entries ");
}
@When ("launch the browser with config properties")
public void launchBrowser()
{
  System.out.println("browser launched ");	
}
@And ("hit the homepage")
public void homepage()
{
System.out.println("homePage");
System.out.println("***********");
}

}