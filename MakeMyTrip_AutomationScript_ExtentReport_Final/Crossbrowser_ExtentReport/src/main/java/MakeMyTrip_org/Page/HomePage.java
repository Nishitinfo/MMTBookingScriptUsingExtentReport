package MakeMyTrip_org.Page;

import MakeMyTrip_org.Utils;
import org.openqa.selenium.By;


public class HomePage extends Utils {
    public By popupClose = new By.ByXPath("//a[@id='webklipper-publisher-widget-container-notification-close-div']/i");
    public By searchFeature = new By.ByXPath("/html/body/div[1]/div/div[2]/div/div");
    public By selectRoundTrip = new By.ByXPath("/html/body/div[1]/div/div[2]/div/div/div[1]/ul/li[2]");
    public By selectCityDropdown = new By.ById("toCity");
    public By searchCity = new By.ByXPath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/input");
    public By selectCity = new By.ById("react-autowhatever-1-section-0-item-0");
    public By selectMonth = new By.ByXPath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/span[2]");
    public By selectDepartureDate = new By.ByXPath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[1]/div[2]");
    public By selectReturnDate = new By.ByXPath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[1]/div[6]");
    public By selectTravellerBox = new By.ByXPath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div[5]/label/p[1]");

    public By selectAdultTraveller = new By.ByXPath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[1]/div[1]/ul[1]/li[9]");
    public By selectChildTraveller = new By.ByXPath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[1]/div[1]/div/div[1]/ul/li[4]");
    public By applyTraveller = new By.ByXPath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[1]/div[2]/button");
    public By updateAdultTraveller = new By.ByXPath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[1]/div[1]/ul[1]/li[2]");
    public By updateChildTraveller = new By.ByXPath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[1]/div[1]/div/div[1]/ul/li[3]");
    public By searchTicket = new By.ByXPath("/html/body/div[1]/div/div[2]/div/div/div[2]/p/a");
    public By bookNow = new By.ByXPath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div/div/div[3]/div[1]/div[3]/div/div[2]/div/button");
    public By closeSuggestion = new By.ByXPath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div/span");
    public By selectFlight = new By.ByXPath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/label/div/div[2]/div[2]/span/input");


    public void redirection() {
        driver.get("https://www.makemytrip.com/");
    }

    public void verifySearchFeature() {
        isElementpresent(searchFeature);
    }

    public void enterTripData() {
        sleep(3);
//        driver.switchTo().frame(1); // Switching to OuterFrame
//        clickOnElement(popupClose);
        clickOnElement(selectRoundTrip);
        clickOnElement(selectCityDropdown);
        enterText(searchCity, "Mumbai");
        clickOnElement(selectCity);
        sleep(1);
        clickOnElement(selectMonth);
        clickOnElement(selectMonth);
        clickOnElement(selectMonth);
        clickOnElement(selectMonth);
        clickOnElement(selectMonth);
        clickOnElement(selectMonth);
        clickOnElement(selectDepartureDate);
        clickOnElement(selectMonth);
        clickOnElement(selectMonth);
        clickOnElement(selectMonth);
        clickOnElement(selectReturnDate);

    }


    public void selectTravelerAndClass() {
        clickOnElement(selectTravellerBox);
        clickOnElement(selectAdultTraveller);
        clickOnElement(selectChildTraveller);
        clickOnElement(applyTraveller);

    }

    public void updateTravelerAndClass() {
        sleep(2);
        clickOnElement(selectTravellerBox);
        clickOnElement(updateAdultTraveller);
        clickOnElement(updateChildTraveller);
        clickOnElement(applyTraveller);
        clickOnElement(searchTicket);
        sleep(3);
        clickOnElement(closeSuggestion);
        sleep(1);
        clickOnElement(selectFlight);
        clickOnElement(bookNow);
    }

}
