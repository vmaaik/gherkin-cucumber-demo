package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BasePage {

    static WebDriver driver;
    private static final String page = "https://github.com/";

    public static void setupProperties() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
    }

    public static void start() {
        driver.get(BasePage.page);
    }

    public static void tearDown() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}