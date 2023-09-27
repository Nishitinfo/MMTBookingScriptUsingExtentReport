package MakeMyTrip_org;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class BrowserSelector extends BaseClass {
    public static final String browsers = LoadProps.getProperty("browser");


    public static void setUp() {

        if (browsers.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.silentOutput", "true");
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
            chromePrefs.put("profile.default_content_settings.popups", 0);
            chromePrefs.put("download.prompt_for_download", false);
            chromePrefs.put("safebrowsing.enabled", true);
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("allow-insecure-localhost");
            options.setExperimentalOption("prefs", chromePrefs);
            options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
            options.setExperimentalOption("useAutomationExtension", false);
            options.setAcceptInsecureCerts(true);
            options.setCapability("disable-restore-session-state", true);
            options.setCapability("profile.default_content_setting_values.cookies", 2);
            options.addArguments("--safebrowsing-disable-download-protection");
            options.addArguments("--test-type");
            options.addArguments("--incognito");
            options.addArguments("--headless");
            options.addArguments("--disable-extensions");
            options.addArguments("disable-infobars");
            options.addArguments("--deleteAll-Cookies");
            driver = new ChromeDriver(options);
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        } else if (browsers.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else if (browsers.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browsers.equalsIgnoreCase("opera")) {
            WebDriverManager.operadriver().setup();
            driver = new OperaDriver();
        } else {
            System.out.println("This Browser is not found in your system.");
        }

    }

    public static void tearDown() {
        driver.close();
        driver.quit();
    }
}
