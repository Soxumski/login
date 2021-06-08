import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import java.io.IOException;
import java.util.concurrent.TimeUnit;



public class LoginPage extends ChromeRunner {

    By Click_Login = By.xpath("//*[@id=\"page__id\"]/app-navigation/nav/div/div[2]/div/div[2]/a[1]");
    By UserName = By.id("signIn-username");
    By Password = By.id("signIn-password");
    By LoginButton = By.xpath("/html/body/modal-container/div/div/app-login/div/div/form/div/div[3]/button");

    public void Login(String user, String pass) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(Click_Login).click();
        driver.findElement(UserName).sendKeys(user);
        driver.findElement(Password).sendKeys(pass);
        driver.findElement(LoginButton).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
}