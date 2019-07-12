package testingui.diplomadoumss.org.core;

import org.openqa.selenium.WebDriver;
import testingui.diplomadoumss.org.managepage.home.Home;
import testingui.diplomadoumss.org.managepage.login.Login;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

import java.util.HashMap;
import java.util.Map;

public class FirstExample {
    public static void main(String[] args) throws InterruptedException {
//
//        WebDriver webDriver = DriverManager.getInstance().getWebDriver();
//        webDriver.get(PropertyAccesor.getInstance().getURL());
//        webDriver.quit();

//        Login login = new Login();
//        login.initBrowser();
//        login.setEmail(PropertyAccesor.getInstance().getEmail());
//        login.setPassword(PropertyAccesor.getInstance().getPassword());
//        login.pressLogin();
//
//        Thread.sleep(20000);
//        login.finish();

        Home home = new Home();
        home.initBrowser();
        Thread.sleep(30000);

        home.pressCatalogo();

        Thread.sleep(20000);
        home.finish();
    }

    public static void exampleMap() {
        Map<String, String> students = new HashMap<>();
        students.put("101", "nombre 1");
        students.put("102", "nombre 2");
        students.put("103", "nombre 3");

        System.out.println(students.get("102"));
    }
}
