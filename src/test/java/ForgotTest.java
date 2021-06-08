import net.bytebuddy.utility.RandomString;
import org.apache.tools.ant.taskdefs.condition.IsFalse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.UUID;
import java.util.*;
import java.nio.charset.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ThreadLocalRandom;
<<<<<<< HEAD
=======
import java.util.concurrent.TimeUnit;

>>>>>>> 7f53466 (login page)
import org.openqa.selenium.support.ui.Select;

import javax.swing.plaf.synth.SynthOptionPaneUI;


//public class Forgot extends ChromeRunner
    public class ForgotTest extends ChromeRunner {

    @Test
    public void Forgot() {
        System.out.println("Chek mail");
        ForgotPassword forgotPassword = new ForgotPassword();
        forgotPassword.Forgot("Test142A", "142Ab", "zfafaaaaa@gmail.com");
        String errorMsg = driver.findElement(By.xpath("//*[@id=\"toast-container\"]")).getText();
        System.out.println(errorMsg);
        String actualMsg = "No email found in database.";
        System.out.println(actualMsg);
        System.out.println(actualMsg.equals(errorMsg));//true
    }

    @Test
    public void ChangeInfo() {
        System.out.println("Cheinge personal Info");
        ForgotPassword forgotPassword = new ForgotPassword();
        forgotPassword.Changeinfo("Test142A", "Test142A");
        String actualMsg = driver.findElement(By.xpath("//*[@id=\"toast-container\"]")).getText();
        String Msg = "Logged in successfully.";
        System.out.println(actualMsg);
        System.out.println(actualMsg.equals(Msg));
<<<<<<< HEAD
=======
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
>>>>>>> 7f53466 (login page)
        // generate rondom streang heare...
        String AlphaNumericString = RandomString.make(8);
        System.out.println(AlphaNumericString);
        String address = driver.findElement(By.xpath("//*[@id=\"address\"]")).getText();
        driver.findElement(By.xpath("//*[@id=\"address\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys(AlphaNumericString);
        System.out.println(AlphaNumericString.compareTo(address)); //true
        System.out.println(AlphaNumericString.equals(address)); //False

        // String Alphanumber = ThreadLocalRandom.current().nextInt(5);
        // System.out.println(Alphanumber);
        int min = 500;
        int max = 1000;
        //Generate random int value from 50 to 100
        System.out.println("Random value in int from " + min + " to " + max + ":");
        int random_int_zip = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println(random_int_zip);
        String zip = String.valueOf(random_int_zip);
        String Zip_code = driver.findElement(By.xpath("//*[@id=\"zipCode\"]")).getText();
        driver.findElement(By.xpath("//*[@id=\"zipCode\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"zipCode\"]")).sendKeys(zip);

        // city change
        String AlphaNumericString1 = RandomString.make(8);
        System.out.println(AlphaNumericString1);
        String city = driver.findElement(By.id("city")).getText();
        System.out.println(city);
        driver.findElement(By.id("city")).clear();
        driver.findElement(By.id("city")).sendKeys(AlphaNumericString1);
        System.out.println(AlphaNumericString1.equals(city));
        // change gender

        WebElement S = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-profile/div[2]/div/div[1]/div/app-account/div/form[1]/div/div/div[2]/div/div[4]/div/select"));
        Select select = new Select(S);
        select.selectByVisibleText("Male");


    }

    @Test
    public void ChangeInfoNegative()
    {// disable Usarname
        System.out.println("Cheinge personal Info");
        ForgotPassword forgotPassword = new ForgotPassword();
        forgotPassword.Changeinfo("Test142A", "Test142A");
        String actualMsg = driver.findElement(By.xpath("//*[@id=\"toast-container\"]")).getText();
        String Msg = "Logged in successfully.";
        System.out.println(actualMsg);
        System.out.println(actualMsg.equals(Msg));
        String Username = driver.findElement(By.id("userName")).getText();
        System.out.println(Username);
        WebElement searchButton = driver.findElement(By.id("userName"));

        System.out.println(searchButton.isEnabled()+"*****"+searchButton.isDisplayed());




    }
    @Test
    public void ChangeInfoNegative1()
    {
        System.out.println("Cheinge personal Info");
        ForgotPassword forgotPassword = new ForgotPassword();
        forgotPassword.Changeinfo("Test142A", "Test142A");
        String actualMsg = driver.findElement(By.xpath("//*[@id=\"toast-container\"]")).getText();
        String Msg = "Logged in successfully.";
        System.out.println(actualMsg);
        System.out.println(actualMsg.equals(Msg));
        String Email = driver.findElement(By.id("emailAddress")).getText();
            System.out.println(Email);
        WebElement EmailButton = driver.findElement(By.id("emailAddress"));
            System.out.println(EmailButton.isEnabled()+"********"+EmailButton.isDisplayed());

    }

}