package com.automation.stepdef;

import com.automation.actions.CommonWaits;
import com.automation.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();
    CommonWaits commonWaits = new CommonWaits();

    @Given("user open website")
    public void user_open_website() {
        loginPage.openWebsite();
    }

    @When("user login with valid credentials")
    public void user_login_with_valid_credentials() {
        loginPage.doLogin();
    }

    @Then("verify login page is displayed")
    public void verify_login_page_is_displayed() {
        loginPage.verifyPage();
    }

    @When("user login with username {string} and password {string}")
    public void user_login_with_username_and_password(String username, String password) {
        loginPage.doLogin(username,password);
    }

    @When("verify element is displayed")
    public void verify_element_is_displayed() {
        String locator = "//span[@id = 'spanMessage']";
        commonWaits.waitTillElementIsDisplayed(locator, 5, 10);
    }

    @Then("verify invalid login error message is displayed")
    public void verify_invalid_login_error_message_is_displayed() {
        loginPage.verifyInvalidLoginError();
    }

    @Then("Sample Step to Retrieve Data")
    public void sampleStepToRetrieveData(){
        loginPage.sampleMethodToRetrieveData();
    }


}
