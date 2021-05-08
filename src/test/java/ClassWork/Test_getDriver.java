package ClassWork;

import org.testng.annotations.BeforeTest;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.Properties;

public class Test_getDriver {

    public static void main(String[] args) {

        System.out.println(ConfigurationReader.get("browser"));


    }
}
