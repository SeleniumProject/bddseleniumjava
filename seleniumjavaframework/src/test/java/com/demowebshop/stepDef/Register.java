package com.demowebshop.stepDef;

import java.util.Map;

import org.testng.Assert;

import com.demowebshop.pages.RegisterPage;
import com.demowebshop.testBase.TestBase;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register extends TestBase {

	RegisterPage registerPage;

	/**
	 * Ctrl+shift+F - to Organize the code
	 * 
	 * @param arg1
	 * @throws Throwable
	 */
	@Given("^I want navigate to demo web shop Url \"([^\"]*)\"$")
	public void i_want_navigate_to_demo_web_shop_Url(String arg1) throws Throwable {
		try {
			
			invoke();
			registerPage = new RegisterPage(driver);
			test = extent.startTest("TC01_VerifyDemowebShopRegisterWithValidData");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Then("^User verify the Title of the home Page \"([^\"]*)\"$")
	public void user_verify_the_Title_of_the_home_Page(String arg1) throws Throwable {

	}

	@When("^I Click on Register link$")
	public void i_Click_on_Register_link() throws Throwable {
		registerPage.clickRegisterLink();

	}

	@Then("^I verify the title of register page \"([^\"]*)\"$")
	public void i_verify_the_title_of_register_page(String arg1) throws Throwable {
		String title = registerPage.getTitle();
		Assert.assertEquals(title, arg1);

	}

	@Then("^I verify the register lable \"([^\"]*)\"$")
	public void i_verify_the_register_lable(String arg1) throws Throwable {

	}

	@When("^I Click on Gender Radio button \"([^\"]*)\"$")
	public void i_Click_on_Gender_Radio_button(String arg1) throws Throwable {

		registerPage.clickGenderMale();

	}

	@When("^I Enter the FirstName \"([^\"]*)\"$")
	public void i_Enter_the_FirstName(String arg1) throws Throwable {
		registerPage.EnterFirstName(arg1);

	}

	@When("^I Enter the LastName \"([^\"]*)\"$")
	public void i_Enter_the_LastName(String arg1) throws Throwable {

		registerPage.EnterLastName(arg1);

	}

	@When("^I Enter the Email \"([^\"]*)\"$")
	public void i_Enter_the_Email(String arg1) throws Throwable {
		registerPage.EnterEmail();

	}

	@When("^I Enter the Password \"([^\"]*)\"$")
	public void i_Enter_the_Password(String arg1) throws Throwable {

		registerPage.EnterPassword(arg1);

	}

	@When("^I Enter the Confirm Password \"([^\"]*)\"$")
	public void i_Enter_the_Confirm_Password(String arg1) throws Throwable {
		registerPage.EnterConfirmPassword(arg1);

	}

	@When("^I Click on register button$")
	public void i_Click_on_register_button() throws Throwable {

		registerPage.clickRegisterbtn();
	}
	
	@Then("^I verify the Firstname error message <fname>, <lname>, <email>, <password>, <confirmpass>$")
	public void i_verify_the_Firstname_error_message_fname_lname_email_password_confirmpass(DataTable arg1) throws Throwable {
		for (Map<String, String> data : arg1.asMaps(String.class, String.class)) {
			Assert.assertEquals(registerPage.firstNameError(), data.get("fname"));
			Assert.assertEquals(registerPage.lastNameError(), data.get("lname"));
			Assert.assertEquals(registerPage.emailerror(), data.get("email"));
			Assert.assertEquals(registerPage.passworderror(), data.get("password"));
			Assert.assertEquals(registerPage.confpassworderror(), data.get("confirmpass"));

		}
	}

	@Then("^I Verify the successfulll message \"([^\"]*)\"$")
	public void i_Verify_the_successfulll_message(String arg1) throws Throwable {
		extent.flush();
		extent.endTest(test);
		driver.close();
		driver.quit();
	}

}
