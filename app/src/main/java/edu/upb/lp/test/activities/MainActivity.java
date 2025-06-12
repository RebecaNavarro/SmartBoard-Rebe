package edu.upb.lp.test.activities;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;

public class MainActivity {

    private final AppiumDriver driver;

    public MainActivity(AppiumDriver driver) {
        this.driver = driver;
    }

    private final By botones = By.id("edu.upb.lp.genericgame:id/buttons");

    public boolean isButtonsVisible() {
        return driver.findElement(botones).isDisplayed();
    }

}