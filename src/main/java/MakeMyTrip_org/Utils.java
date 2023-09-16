package MakeMyTrip_org;

import org.openqa.selenium.By;


public class Utils extends BaseClass {

    public static void enterText(By by, String text) {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }

    public static boolean isElementpresent(By by) {
        return driver.findElement(by).isDisplayed();
    }


    public static void clickOnElement(By by) {

        driver.findElement(by).click();
    }


    public static void sleep(int second) {
        try {
            Thread.sleep(second * 1000L);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
