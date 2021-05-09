package ClassWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utilities.Driver;

public class TableVerification {
    public static void main(String[] args) {
        Driver.get().get("https://www.techlistic.com/p/demo-selenium-practice.html");

        verifyTableHeaders();
        String[] str = {"Burj Khalifa", "UAE", "Dubai", "829m", "2010", "1"};
        verifyTableRow(str);
    }

    static void verifyTableHeaders(){
        String [] labels = {"Structure", "Country", "City", "Height", "Built", "Rank"};
        String xpath ="//thead";
        for (int i=0; i<labels.length; i++){
            xpath+="//th["+(i+1)+"][text()='"+labels[i]+"']/parent::tr";
        }
       WebElement tableHeader = Driver.get().findElement(By.xpath(xpath));
        Assert.assertTrue(tableHeader.isDisplayed());
            }
            static void verifyTableRow(String[] str){
          String xPAth="//tbody//th[text() = '"+str[0]+"']";
                System.out.println("stop");
             for(int i =1; i<str.length; i++){
                 xPAth+="/parent::tr//td["+i+"][text() = '"+str[i]+"']";
                 System.out.println(xPAth);}

                 WebElement tableRow = Driver.get().findElement(By.xpath(xPAth));
                 Assert.assertTrue(tableRow.isDisplayed());
                 System.out.println(xPAth);
             }


  /////parent::tr//td[1][text() = 'UAE']/parent::tr//td[2][text() = 'Dubai']/parent::tr//td[3][text() = '829m']/parent::tr//td[4][text() = '2010']/parent::tr//td[5][text() = '1']
//    String Structure, String Country, String City, String Height, String Built, String Rank
}
