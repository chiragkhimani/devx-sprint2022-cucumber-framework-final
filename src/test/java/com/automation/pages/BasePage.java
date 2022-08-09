package com.automation.pages;

import com.automation.utils.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class BasePage {
    WebDriver driver = DriverUtils.getDriver();
    Logger log = Logger.getLogger("Cucumber Project");

    public BasePage(){
        PageFactory.initElements(driver,this);
    }
}
