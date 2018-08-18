package pages;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;


public class BasePage {

    @Autowired
    static WebDriver webDriver;

    private static final String page = "https://github.com/";

    public static void start() {
        webDriver.get(page);
    }

    public static void tearDown() {
        webDriver.manage().deleteAllCookies();
        webDriver.quit();
    }
}