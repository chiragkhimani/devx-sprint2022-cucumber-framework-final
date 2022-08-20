package com.automation.pages;

import com.automation.utils.ConfigReader;
import com.automation.utils.DataBaseUtils;
import com.automation.utils.DriverUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginPage extends BasePage{

    @FindBy(id = "txtUsername")
    WebElement userName;

    @FindBy(id = "txtPassword")
    WebElement passWord;

    @FindBy(id="spanMessage")
    WebElement invalidLoginErrorMsg;

    public void doLogin() {
        log.info("Doing login");
        userName.sendKeys(ConfigReader.getProperty("login.username") + Keys.ENTER);
        passWord.sendKeys(ConfigReader.getProperty("login.password") + Keys.ENTER);
    }

    public void doLogin(String username, String password) {
        log.info("Doing login");
        userName.sendKeys(username);
        passWord.sendKeys(password + Keys.ENTER);
    }

    public void verifyPage() {
        log.info("Verifying login page");
        Assert.assertTrue("User is not on login page",userName.isDisplayed());
        Assert.assertTrue("User is not on login page",passWord.isDisplayed());
    }

    public void openWebsite() {
        log.info("Opening the website");
        driver.get(ConfigReader.getProperty("app.baseurl"));
    }

    public void verifyInvalidLoginError() {
        Assert.assertTrue("Invalid login error message is not displayed",invalidLoginErrorMsg.isDisplayed());


    }

    public void sampleMethodToRetrieveData() {
        // Retrieve result from database
        ResultSet result = DataBaseUtils.executeQuery("select first_name from employees limit 1;");

        // Use result to get the data
        try {
            result.next();
            String username = result.getString(1);
            System.out.println(username);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Assert.assertTrue("Data does not match with UI",userName.equals("Hosna"));
    }
}
