package stepDefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {
	
	    @Given("^User is on Netbanking landing page$")
	    public void user_is_on_netbanking_landing_page() throws Throwable {
	    	System.out.println("navigate to login url");
	    }

	    @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
	    	System.out.println("logged in successfully for username:"+ strArg1 +" with password:"+strArg2);
	    }

	    @When("^User signup with following details$")
	    public void user_signup_with_following_details(DataTable data) throws Throwable {
	    	List<List<String>> obj = data.asLists();
	    	System.out.println(obj.get(0).get(0));
	    	System.out.println(obj.get(0).get(1));
	    	System.out.println(obj.get(0).get(2));
	    	System.out.println(obj.get(0).get(3));
	    	System.out.println(obj.get(0).get(4));
	    }
	    
	    @Given("^The browser is installed$")
	    public void the_browser_is_installed() throws Throwable {
	        System.out.println("Browser is installed");
	    }

	    @When("^The portal is triggered$")
	    public void the_portal_is_triggered() throws Throwable {
	    	System.out.println("Portal is triggered");
	    }

	    @Then("^Portal shows$")
	    public void portal_shows() throws Throwable {
	    	System.out.println("Portal can be seen");
	    }

	    @Then("^Home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	    	System.out.println("validated home page");
	    }

	    @And("^Cards displayed are \"([^\"]*)\"$")
	    public void cards_displayed_are_something(String strArg1) throws Throwable {
	    	System.out.println("cards displayed are: "+strArg1);
	    }
	    
	    @When("^User login in to application with (.+) and password (.+)$")
	    public void user_login_into_application_with_and_password(String username, String password) throws Throwable {
	    	System.out.println("logged in successfully for username:"+ username +" with password:"+password);
	    }
	    
	    
}
