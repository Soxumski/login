import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class ForgotPassword extends ChromeRunner  {

    //By Click_Login = By.xpath("//*[@id=\"page__id\"]/div[2]/app-navigation/nav/div/div[2]/div/div[2]/a[1]");
    By Click_Login = By.xpath("//*[@id=\"page__id\"]/app-navigation/nav/div/div[2]/div/div[2]/a[1]");
    By UserName = By.id("signIn-username");
    By Password = By.id("signIn-password");
    By LoginButton = By.xpath("/html/body/modal-container/div/div/app-login/div/div/form/div/div[3]/button");
    By Forgot_Password = By.xpath("/html/body/modal-container/div/div/app-login/div/div/form/div/div[2]/div/a");
    By email = By.id("reset-mail");
    By ResetPasswordButton = By.xpath("/html/body/modal-container/div/div/app-password-reset/div/div/form/div/div[2]/button");
    //By userIcon = By.id("userIcon");
    By userIcon = By.xpath("//*[@id=\"page__id\"]/app-navigation/nav/div/div[2]/div/div[3]/button");
    By Account = By.xpath("//*[@id=\"page__id\"]/app-navigation/nav/div/div[2]/div/div[3]/div/div/ul/li[2]/a/span");



    public void Forgot(String user, String pass, String Email)
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(Click_Login).click();
        driver.findElement(UserName).sendKeys(user);
        driver.findElement(Password).sendKeys(pass);
        driver.findElement(LoginButton).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(Forgot_Password).click();
        driver.findElement(email).sendKeys(Email);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(ResetPasswordButton).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void Changeinfo(String user, String pass)
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(Click_Login).click();
        driver.findElement(UserName).sendKeys(user);
        driver.findElement(Password).sendKeys(pass);
        driver.findElement(LoginButton).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(userIcon).click();
        driver.findElement(Account).click();

    }

}

