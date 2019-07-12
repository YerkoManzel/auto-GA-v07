package testingui.diplomadoumss.org.managepage.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

/**
 * @author Yerko Manzel
 */
public class Home extends BasePage {

    @FindBy(xpath = "//a[@href='/catalogo']")
    private WebElement catalogoOption;

    public void initBrowser() {
        webDriver.get(PropertyAccesor.getInstance().getURL());
    }

    public void pressCatalogo() {
        catalogoOption.click();
    }

    public void finish() {
        webDriver.quit();
    }
}
