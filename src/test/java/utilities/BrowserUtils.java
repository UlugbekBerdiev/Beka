package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {
    /*
     * switches to new window by the exact title
     */

    public static void switchToWindow(String targetTitle){
          String origin = Driver.get().getWindowHandle();
          for(String handle : Driver.get().getWindowHandles()){
              if(Driver.get().getTitle().equals(targetTitle)){
                  return;
              }
          }
        Driver.get().switchTo().window(origin);
    }
    /**
     * Moves the mouse to given element
     *
     * @param element on which to hover
     */
    public static void hover(WebElement element){
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(element).perform();
    }
    /**
     * return a list of string from a list of elements
     *
     * @param list of webelements
     * @return list of string
     */
    public static List<String> getElementsText(List<WebElement> list){
        List<String> elemTexts = new ArrayList<>();
        for(WebElement el : list ){
            elemTexts.add(el.getText());
            }
        return elemTexts;
    }
    /**
     * Extracts text from list of elements matching the provided locator into new List<String>
     *
     * @param locator
     * @return list of strings
     */
    public static List<String> getElementsText(By locator) {

        List<WebElement> elems = Driver.get().findElements(locator);
        List<String> elemTexts = new ArrayList<>();

        for (WebElement el : elems) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }
}
