package com.automation.pages;

import com.automation.utils.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VacanyListingPage extends BasePage{

    @FindBy(xpath = "//div[@class='top']/input[@name='btnAdd']")
    WebElement AddBtn;

    @FindBy(xpath = "//input[contains(@id,'ohrmList_chkSelectRecord')]")
    WebElement vacancyCheckBx;

    @FindBy(id = "btnDelete")
    WebElement deleteBtn;

    @FindBy(id = "dialogDeleteBtn")
    WebElement deleteBtnOkBtn;

    @FindBy(xpath = "//div[contains(@class,'success')]")
    WebElement successMsg;

    public void clickOnAddBtn(){
        AddBtn.click();
    }

    public void selectVacanyCheckBox(){
        vacancyCheckBx.click();
    }

    public void clickOnDeleteVacancy(){
        deleteBtn.click();
    }

    public void clickOnOkOnDeleteVacancyPopUp(){
       deleteBtnOkBtn.click();
    }

    public void verifyDeleteVacancySuccessMsg(){
        System.out.println(successMsg.getText());
    }

}
