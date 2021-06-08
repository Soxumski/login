import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class GameLaunch extends ChromeRunner
{
    static By Click_Login = By.xpath("//*[@id=\"page__id\"]/app-navigation/nav/div/div[2]/div/div[2]/a[1]");
    static By UserName = By.id("signIn-username");
    static By Password = By.id("signIn-password");
    static By LoginButton = By.xpath("/html/body/modal-container/div/div/app-login/div/div/form/div/div[3]/button");
    static By My_bonues = By.xpath("//*[@id=\"page__id\"]/app-sidebar/div/div[2]/div[1]/ul[1]/li[3]/a/span");
    static By Notification = By.id("profile-tabs");
   // static By smartsoftpro = By.xpath("//*[@id=page__id]/div[2]/div/app-footer/footer/div/div[2]/a[1]/img");


    public static void chakicon(String user, String pass)
    {
        driver.findElement(Click_Login).click();
        driver.findElement(UserName).sendKeys(user);
        driver.findElement(Password).sendKeys(pass);
        driver.findElement(LoginButton).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(My_bonues).click();
        driver.findElement(Notification).click();

    }


}
