package com.util;

import com.base.BaseClasee;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common {
    public static void waitSecond(int second) {
        try {
            Thread.sleep(1000 * second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void waitUntilVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(BaseClasee.driver, 15);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
