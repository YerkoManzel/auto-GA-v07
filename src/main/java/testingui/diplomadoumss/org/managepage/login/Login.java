package testingui.diplomadoumss.org.managepage.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

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

    public void initBrowser() {
        webDriver.get(PropertyAccesor.getInstance().getURL());
    }

    public void setEmail(String email){
        emailTextField.sendKeys(email);
    }

    public Dashboard setCredentials() {

        return new Dashboard();
    }

    public void setPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void pressLogin() {
        buttonField.click();
    }

    public void finish() {
        webDriver.quit();
    }

}
