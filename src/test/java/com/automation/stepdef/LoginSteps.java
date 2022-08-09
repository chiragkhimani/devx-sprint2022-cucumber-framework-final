package com.automation.stepdef;

import com.automation.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

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

    @Then("verify invalid login error message is displayed")
    public void verify_invalid_login_error_message_is_displayed() {
        loginPage.verifyInvalidLoginError();
    }


}
