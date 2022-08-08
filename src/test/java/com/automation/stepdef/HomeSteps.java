package com.automation.stepdef;

import com.automation.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {

    HomePage homePage = new HomePage();

    @Then("verify user is on homepage")
    public void verify_user_is_on_homepage() {
        homePage.verifyPage();
    }

    @When("user clicks on user badge")
    public void user_clicks_on_user_badge() {
        homePage.clickOnUserBadge();
    }

    @When("click on logout link")
    public void click_on_logout_link() {
        homePage.clickOnLogoutLink();
    }
}
