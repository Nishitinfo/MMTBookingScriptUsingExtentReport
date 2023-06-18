package MakeMyTrip_org;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class LoadProps {
    public static String getProperty(String key) {
        Properties prop = new Properties();
        FileInputStream input;

        try {
            input = new FileInputStream(System.getProperty("user.dir") + "//src//test//resources//TestData//TestConfig.properties");
            prop.load(input);
            input.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }


}