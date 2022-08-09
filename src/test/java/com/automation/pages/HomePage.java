package com.automation.pages;

import com.automation.utils.CommonMethods;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePage extends BasePage {

    @FindBy(id = "welcome")
    WebElement userBadge;

    @FindBy(id = "menu_recruitment_viewRecruitmentModule")
    WebElement recruitmentTab;

    @FindBy(id = "menu_recruitment_viewJobVacancy")
    WebElement vacanciesTab;

    @FindBy(xpath = "//div[@id='welcome-menu']//a[text()='Logout']")
    WebElement logoutLink;

    @FindBy(id = "menu_admin_viewAdminModule")
    WebElement adminLink;

    @FindBy(id = "menu_admin_UserManagement")
    WebElement userManagementLink;

    @FindBy(id = "menu_admin_viewSystemUsers")
    WebElement usersLink;

    @FindBy(id = "searchSystemUser_userName")
    WebElement usernameInput;

    @FindBy(id = "searchBtn")
    WebElement searchBtn;

    @FindBy(xpath = "//table//td[text()='No Records Found']")
    WebElement noRecordFoundText;

    public void clickOnVacanciesTab() {
        recruitmentTab.click();
        vacanciesTab.click();
    }

    public void clickOnUserBadge() {
        userBadge.click();
    }

    public void clickOnLogoutLink() {
        logoutLink.click();
    }

    public void verifyPage() {
        Assert.assertTrue("User is not on home page", userBadge.isDisplayed());
        CommonMethods.takeScreenshot();
    }

    public void clickOnUsersLinkFromUserManagement() {
        Actions action = new Actions(driver);
        action.moveToElement(adminLink).moveToElement(userManagementLink).click(usersLink).build().perform();
    }

    public void searchWithUsername(String username) {
        usernameInput.sendKeys(username);
        searchBtn.click();
    }

    public void verifyNoRecordFoundTextIsDisplayed() {
        Assert.assertTrue( "Search results are still displayed",noRecordFoundText.isDisplayed());
    }
}
