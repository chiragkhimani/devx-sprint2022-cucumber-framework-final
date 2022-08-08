package com.automation.pages;

import com.automation.utils.ConfigReader;
import com.automation.utils.DriverUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    @FindBy(id = "txtUsername")
    WebElement userName;

    @FindBy(id = "txtPassword")
    WebElement passWord;



    public void doLogin() {
        userName.sendKeys(ConfigReader.getProperty("login.username") + Keys.ENTER);
        passWord.sendKeys(ConfigReader.getProperty("login.password") + Keys.ENTER);
    }

    public void verifyPage() {
        Assert.assertTrue("User is not on login page",userName.isDisplayed());
        Assert.assertTrue("User is not on login page",passWord.isDisplayed());
    }

    public void openWebsite() {
        driver.get(ConfigReader.getProperty("app.baseurl"));
    }
}
