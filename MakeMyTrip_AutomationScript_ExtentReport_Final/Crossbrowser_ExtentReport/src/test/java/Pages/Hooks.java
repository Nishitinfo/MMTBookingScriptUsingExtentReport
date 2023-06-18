package Pages;

import MakeMyTrip_org.BrowserSelector;
import MakeMyTrip_org.Utils;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks extends Utils {

    @Before
    public void before() {
        BrowserSelector.setUp();
    }

    @After
    public void after() {
        BrowserSelector.tearDown();
    }

}
