package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility{
	POMFactory factory =  new POMFactory();
	
	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signInButton);
		logger.info("user clicked on Sign In option");
		
	}
	@And("User enter email {abc@tek.com} and password {Qwerty@12345}")
	public void userEnterEmailAndPassword(String email,String password) {
		sendText(factory.SignInPage().emailField,email);
		sendText(factory.SignInPage().passwordFeild, password);
		logger.info("user entered email" + email + "and password" + password);
	}
	
	@And("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.SignInPage().loginButton);
		logger.info("user clicked on login button");
	}
	
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().accountDisplay));
		logger.info("user logged in into account");
	}
	
	@And("User click on create new Account button")
	public void userClickOnCreateNewAcountButton() {
		click(factory.SignInPage().newAccountButton);
		logger.info("user clicked on Create New Account button");
		
	}
	@And("User fill the SignUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(DataTable data) {
		List<Map<String, String>> signUpData = data.asMaps(String.class, String.class);
		sendText(factory.SignInPage().nameInput,signUpData.get(0).get("Nabi"));
		sendText(factory.SignInPage().emailInput,signUpData.get(0).get("nabi@tek.us"));
		sendText(factory.SignInPage().passwordInput,signUpData.get(0).get("Qwerty@12345"));
		sendText(factory.SignInPage().confirmPasswordInput,signUpData.get(0).get("Qwerty@12345"));
		logger.info("user entered required information into sign up form");
		
	}
	@And("User click on SignUp button")
	public void userClickOnSignUpButton() {
		click(factory.SignInPage().signupBtn);
		logger.info("user clicked on SignUp button");
		
	}
	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
		Assert.assertTrue(isElementDisplayed(factory.SignInPage().profileImage));
		Assert.assertTrue(isElementDisplayed(factory.homePage().accountDisplay));
		logger.info("Account was created");

	}

}
