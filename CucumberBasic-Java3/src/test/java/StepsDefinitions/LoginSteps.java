package StepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("i'm a Given method: user on login page");
	}

	@When("user enters (.*) and (.*)$")
	public void user_enters_user1_and_user1(String username, String password) {
		System.out.println("\n        the username is: " + username + "\n        ");
		System.out.println("\n        the password is: " + password + "\n        ");
	}

	@And("clicks on button")
	public void clicks_on_button() {
		System.out.println("i'm a And method: user clicks on button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("i'm a Then method: user navigated to the home page");

	}

}
