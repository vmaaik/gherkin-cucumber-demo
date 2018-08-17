package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    public void navigateToLoginPage() {
        driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
    }

    public void setUserName(String userName) {
        driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys(userName);
    }

    public void setPassword(String password) {
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(By.xpath(" //input[@value='Sign in']")).click();
    }

    public String getMessage() {
        return driver.findElement(By.xpath("//div[@class='container']")).getText();
    }
}
