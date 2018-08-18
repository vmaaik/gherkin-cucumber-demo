package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginPage {

    @Autowired
    WebDriver webDriver;

    public void navigateToLoginPage() {
        webDriver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
    }

    public void setUserName(String userName) {
        webDriver.findElement(By.xpath("//input[@id='login_field']")).sendKeys(userName);
    }

    public void setPassword(String password) {
        webDriver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
    }

    public void clickLogin() {
        webDriver.findElement(By.xpath(" //input[@value='Sign in']")).click();
    }

    public String getMessage() {
        return webDriver.findElement(By.xpath("//div[@class='container']")).getText();
    }
}
