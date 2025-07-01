package edu.upb.lp.test.activities;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.util.Objects;


public class MainActivity {

    private final AppiumDriver driver;


    public MainActivity(AppiumDriver driver) {
        this.driver = driver;
    }

    public boolean isHeaderTextVisible() {
        return Objects.requireNonNull(driver.getPageSource()).contains("Bug World");
    }


}
