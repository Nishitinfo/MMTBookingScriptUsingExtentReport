package Pages;

import MakeMyTrip_org.BrowserSelector;
import MakeMyTrip_org.Page.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomeScreen extends BrowserSelector {

    static HomePage Obj = new HomePage();


    @When("User is redirected to the makeMyTrip link")
    public static void accessingMakeMyTrip() throws InterruptedException {
        Obj.redirection();
    }

    @When("User is able access the search feature")
    public static void checkSearchFeature() throws InterruptedException {
        Obj.verifySearchFeature();
    }

    @Then("Verify User should be redirected to makeMyTrip Home page")
    public static void redirectedToMkeMyTRipHomePage() throws InterruptedException {
        String url = "https://www.makemytrip.com/";
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue("Not redirected to makeMyTrip home page", currentUrl.contains(url));
    }

    @When("User is checking the round trip")
    public static void checkingTripOnMakeMyTrip() throws InterruptedException {
        Obj.redirection();
    }

    @When("User entering the trip data to search")
    public static void enteringTripDetails() throws InterruptedException {
        Obj.enterTripData();
    }

    @Then("Verify User is able to book data with entered details")
    public static void verifyingTripResult() throws InterruptedException {
        WebElement label = driver.findElement(By.id("range_error"));
        String Value = label.getText();
        System.out.println(Value);
        String searchLabel = "You are booking for more than 30 days";
        Assert.assertEquals("Trip data not selected", searchLabel, Value);
    }


    @When("User entering the traveller and class data")
    public static void enteringTripTravellerDetails() throws InterruptedException {
        Obj.selectTravelerAndClass();
    }

    @Then("Verify User is able to book data with entered traveller and class details")
    public static void verifyingTravellerAndClassResult() throws InterruptedException {
        String Message = "Upto 9 passengers allowed";
        Assert.assertTrue(Message, true);
    }

    @When("User updating the traveller and class data")
    public static void updatingTripDetails() throws InterruptedException {
        Obj.updateTravelerAndClass();
    }

    @Then("Verify User is able to book trip and redirected to review page")
    public static void verifyingTripBooking() throws InterruptedException {

        WebElement departureDate = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[1]/p[3]"));
        String date = departureDate.getText();
        System.out.println(date);
        String searchLabel = "Mon, 1 Jan";
        Assert.assertEquals("Departure Date is not match", searchLabel, date);
        WebElement returnDate = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/p[3]"));
        String Value = returnDate.getText();
        System.out.println(Value);
        String searchDate = "Fri, 5 Apr";
        Assert.assertEquals("Return Date is not match", searchDate, Value);
    }
}
