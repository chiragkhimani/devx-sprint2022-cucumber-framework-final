package com.automation.pages;

import com.automation.utils.ConfigReader;
import com.automation.utils.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddVacancyPage extends BasePage{

    @FindBy(id = "addJobVacancy_hiringManager")
    WebElement HiringManagerField;

    @FindBy(id = "addJobVacancy_name")
    WebElement vacancyNameField;

    @FindBy(id = "addJobVacancy_jobTitle")
    WebElement jobTitleDropDown;

    @FindBy(id = "btnSave")
    WebElement saveBtn;


    public void fillAddVacancyDetails(){
        selectJobTitle();
        enterVacancyName();
        enterHiringManager();
    }

    public void selectJobTitle(){
        Select catDropDownSelect = new Select(jobTitleDropDown);
        catDropDownSelect.selectByVisibleText(ConfigReader.getProperty("add.vacancy.cat.dropdown.value"));
    }

    public void enterVacancyName(){
        vacancyNameField.sendKeys(ConfigReader.getProperty("add.vacancy.name") + Keys.ENTER);
    }

    public void enterHiringManager(){
        HiringManagerField.sendKeys(ConfigReader.getProperty("add.vacancy.hiring.manager") + Keys.ENTER);
    }

    public void clickOnSaveBtn(){
        saveBtn.click();
    }
}
