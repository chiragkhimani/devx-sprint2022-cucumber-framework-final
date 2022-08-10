package com.automation.actions;

import com.automation.utils.DriverUtils;
import org.asynchttpclient.util.Assertions;
import org.awaitility.Awaitility;
import org.awaitility.core.ConditionFactory;
import org.awaitility.core.ConditionTimeoutException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class CommonWaits {

    WebDriver driver = DriverUtils.getDriver();

    // Used to wait for element and proceed to the next step. Don't use as assertion
    public void waitTillElementIsDisplayed(String xpathLocator, int maxDuration, int interval) {
        ConditionFactory awaiting = Awaitility.await();

        try {
            awaiting.with().pollInterval(Duration.ofMillis(interval))
                    .atMost(Duration.ofSeconds(maxDuration))
                    .until(
                            () -> driver.findElement(By.xpath(xpathLocator)).isDisplayed()
                    );
        } catch (Exception e) {
            throw new ConditionTimeoutException("Awaiting for element by locator "
                    + xpathLocator + " , but it was not displayed in max time " + maxDuration);
        }
    }
}
