package testingui.diplomadoumss.org.managepage.dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.managepage.cars.Cars;

import static testingui.diplomadoumss.org.manageevents.Event.*;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class Dashboard extends BasePage {


    @FindBy(xpath = "//ul[@id='social-sidebar-menu' and @class='list-unstyled components']")
    private WebElement leftPanel;

    @FindBy(xpath = "//a[@href='#Cars']")
    private WebElement cars;

    @FindBy(xpath = "//a[@href = 'https://www.phptravels.net/admin-portal/admin/cars']")
    private WebElement option_cars;

    public void clickCars() {
        cars.click();
    }


    public void clickOptionCars() {
        option_cars.click();
    }


    public Cars selectCars() {
        clickCars();
        clickOptionCars();
        return new Cars();
    }

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(text(), 'Bookings')]")
    private WebElement bookingLink;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(., 'Cars') and @aria-expanded='false']")
    private WebElement carsExpand;

    public Dashboard() {
//        isWebElementVisible(bookingLink);
        avoidToUse(3);
    }

    public Dashboard clickCarsExpand() {
        clickWebElement(carsExpand);
        return this;
    }
}
