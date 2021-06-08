import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPageTest  extends ChromeRunner
{
    @Test
    public void Login()
    {
       LoginPage loginPage = new LoginPage();
       System.out.println("positive test");
       loginPage.Login("test142A", "test142A");
       String actualMsg = driver.findElement(By.xpath("//*[@id=\"toast-container\"]")).getText();
       String Msg = "Logged in successfully.";
            System.out.println(actualMsg);
            System.out.println(actualMsg.equals(Msg));
       // Create object of the  Select class
    }

    @Test
    public static void LoginNegative()
    // password is folse
    {
        LoginPage loginpage = new LoginPage();
        loginpage.Login("test142A", "test20211");
        String actualMsg = driver.findElement(By.xpath("//*[@id=\"toast-container\"]/div/div")).getText();
        String errorMsg = "Due to multiple incorrect attempts your account is suspended untill";
        System.out.println(actualMsg);
        System.out.println(errorMsg);
        if (actualMsg.contains(errorMsg))
            {
                System.out.println("Test Case Passed");
            }
        else
            {
              System.out.println("Test Case Failed");
            }
        // This will capture error message
    }

   @Test

    public static void LoginNegative1()
{
    LoginPage loginPage = new LoginPage();
    loginPage.Login("test142A", "");
    String actualMsg = driver.findElement(By.xpath("/html/body/modal-container/div/div/app-login/div/div/form/div/div[1]/div[2]/div/span")).getText();
    String errorMsg = "password is Required";
    System.out.println(actualMsg);
    System.out.println(errorMsg);
    if(actualMsg.equals(errorMsg))
    {
        System.out.println("Test Case Passed");
    }
    else
    {
       System.out.println("Test Case Failed");
    }

    // This will capture error message
}

    @Test
    // user is emty
    public static void LoginNegative2()
    {
        LoginPage loginPage = new LoginPage();
        loginPage.Login(" ", "test142A");
    }


    @Test
    public static void LoginNegative3()
    // emty user && pass
    {
        LoginPage loginPage = new LoginPage();
        loginPage.Login("  ", "");
        String actualMsg = driver.findElement(By.xpath("/html/body/modal-container/div/div/app-login/div/div/form/div/div[1]/div[2]/div/span")).getText();
        String errorMsg= "password is Required";
        System.out.println(actualMsg);
        System.out.println(errorMsg);
        if(actualMsg.equals(errorMsg)) {
            System.out.println("Test Case Passed");
        }
        else
        {
            System.out.println("Test Case Failed");
        }
    }

    @Test
    public static void LoginNegative4()
    // user && pass is false
    {
        LoginPage loginpage= new LoginPage();
        loginpage.Login("test142AAAA","test1422222");
        String actualMsg = driver.findElement(By.xpath("//*[@id=\"toast-container\"]/div/div")).getText();
        String errorMsg = "Due to multiple incorrect attempts your account is suspended untill";
        String errorMsg1 = "Username not found";
        System.out.println(actualMsg);
        System.out.println(errorMsg);
        System.out.println(actualMsg.equals(errorMsg) || actualMsg.equals(errorMsg1) );//true
        if (actualMsg.contains(errorMsg))
        {
            System.out.println("Test Case Passed");
        }
        else
        {
            System.out.println("Test Case Failed");
        }

        // This will capture error message

    }

}
