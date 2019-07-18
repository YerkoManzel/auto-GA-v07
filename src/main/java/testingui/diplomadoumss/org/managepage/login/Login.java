package testingui.diplomadoumss.org.managepage.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

import static testingui.diplomadoumss.org.manageevents.Event.*;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class Login extends BasePage {
//
//    @FindBy(xpath = "//input[@name='email' and @type='email']")
//    private WebElement emailTextField;

    @FindBy(xpath = "//input[@name='email' and @type='text']")
    private WebElement emailTextField;

    @FindBy(xpath = "//input[@name='password' and @type='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement buttonField;

    public Dashboard setCredentials() {
        return setEmail(PropertyAccesor.getInstance().getEmail()).
                setPassword(PropertyAccesor.getInstance().getPassword()).
                pressLogin();
    }

    public Login() {
//        isWebElementVisible(buttonField);
        avoidToUse(2);
    }

    public void initBrowser() {
        webDriver.get(PropertyAccesor.getInstance().getURL());
    }

    public Login setEmail(String email) {
//        emailTextField.sendKeys(email);
        fillWebElement(emailTextField, email);
        return this;
    }

    public Login setPassword(String password) {
//        passwordField.sendKeys(password);
        fillWebElement(passwordField, password);
        return this;
    }

    public Dashboard pressLogin() {
//        buttonField.click();
        clickWebElement(buttonField);
        return new Dashboard();

    }

    public void finish() {
        webDriver.quit();
    }

}
