package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    public void navigateToLoginPage() {
        driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
    }
}
