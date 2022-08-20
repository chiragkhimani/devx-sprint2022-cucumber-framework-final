package com.automation.stepdef;

import com.automation.pages.AddVacancyPage;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.pages.VacanyListingPage;
import com.automation.utils.ConfigReader;
import com.automation.utils.DataBaseUtils;
import com.automation.utils.DriverUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp() throws Exception {
        ConfigReader.initProperties();
        DriverUtils.createDriver();
        DataBaseUtils.initDatabase();
    }

    @After
    public void quit() throws Exception {
        DriverUtils.getDriver().quit();
        DataBaseUtils.closeConnection();
    }
}
