package testingui.diplomadoumss.org.manageevents;

import org.openqa.selenium.WebElement;

/**
 * @author Yerko Manzel
 */
public class Event {

    public static void clickWebElement(WebElement element) {
        element.click();
    }

    public static void fillWebElement(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }
}
