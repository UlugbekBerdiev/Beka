package pages;

import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class pageUtils {

    private pageUtils(){}

    public static void setupAndGetURL(String url){

        Driver.get().get(url);
        Driver.get().manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        Driver.get().manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        Driver.get().manage().window().maximize();
    }
}
