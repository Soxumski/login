import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Instant;
import java.util.concurrent.TimeUnit;


public class GamelaunchTest extends ChromeRunner{

    private static Instant wait;

    @Test
    public static void viking() {
        GameLaunch gameLaunch = new GameLaunch();
        System.out.println("positive test");
        GameLaunch.chakicon("test142A", "test142A");
        System.out.println("next step is starting");
        //****** choose viking game
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-footer/footer/div/div[2]/a[1]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[1]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[1]/app-game-card/div/div[2]/div/div[1]/a[4]")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        int size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
            if(size > 0) {
                System.out.println("********We are switch to the iframe*******" + "size = "+ size + "  " + "Viking game Launch");
            }
            else
            {
                System.out.println("underfound this game namme ' Viking'");
            }
            driver.quit();
    }

   /* @Test
    public static void JetX() {
        GameLaunch gamelaunch = new GameLaunch();
        System.out.println("positive test");
        GameLaunch.chakicon("test142A", "test142A");
        System.out.println("next step is starting");
        //****** choose JetX game
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-footer/footer/div/div[2]/a[1]/img")).click();
        driver.manage().timeouts().implicitlyWait(6000,TimeUnit.SECONDS);
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"test\"]/div[2]/div/div[2]/canvas"));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();

        Actions clickAt = new Actions(driver);
        clickAt.moveToElement(driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-games/section/div/div[2]/div[2]/app-game-card/div/div[3]/div/div[2]/canvas")), 60, 30).click();
      //  clickAt.moveToElement(driver.findElement(By.xpath("your canvas id here")), 90, 30).click();
        clickAt.build().perform();


        driver.findElement(By.xpath("//*[@id=\"test\"]/button[1]")).click();
        driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
        //   driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-games/section/div/div[2]/div[2]/app-game-card/div/div[3]/div/div[2]")).click();
        int size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
        if(size > 0) {
            System.out.println("********We are switch to the iframe*******" + "size = "+ size + "  " + "JetX game Launch");
        }
        else
        {
            System.out.println("underfound this game namme ' JetX'");
        }
        driver.quit();
    }
*/////

    @Test
    public static void Cappadocia() {
        GameLaunch gamelaunch = new GameLaunch();
        System.out.println("positive test");
        GameLaunch.chakicon("test142A", "test142A");
        System.out.println("next step is starting");
        //****** choose Cappadocia game
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-footer/footer/div/div[2]/a[1]/img")).click();
        driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[3]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[3]/app-game-card/div/div[2]/div/div[1]/a[3]/img")).click();
        driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
      //   driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-games/section/div/div[2]/div[2]/app-game-card/div/div[3]/div/div[2]")).click();
        int size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
        if(size > 0) {
            System.out.println("********We are switch to the iframe*******" + "size = "+ size + "  " + "Cappadocia game Launch");
        }
        else
        {
            System.out.println("underfound this game namme ' Cappadocia'");
        }
        driver.quit();
    }




        @Test

         static void Aztec () {
         GameLaunch gamelaunch = new GameLaunch();
            System.out.println("positive test");
            GameLaunch.chakicon("test142A", "test142A");
            System.out.println("next step is starting");
            //****** choose Aztec game
            driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-footer/footer/div/div[2]/a[1]/img")).click();
            driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
            WebElement ele = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[4]/app-game-card/div/div[2]/div/div[2]/picture/img"));
            //Creating object of an Actions class
            Actions action = new Actions(driver);
            //Performing the mouse hover action on the target element.
            action.moveToElement(ele).perform();
            driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-games/section/div/div[2]/div[2]/app-game-card/div/div[3]/div/div[1]/a[3]/img")).click();
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            int size = driver.findElements(By.tagName("iframe")).size();
            driver.switchTo().frame(0);
            if (size > 0) {
                System.out.println("********We are switch to the iframe*******" + "size = " + size + "  " + "Aztec game");
            } else {
                System.out.println("underfound this game namme ' Aztec'");
            }
            driver.quit();
        }


    @Test
    public static void Birds() {
        GameLaunch gamelaunch = new GameLaunch();

        System.out.println("positive test");
        GameLaunch.chakicon("test142A", "test142A");
        System.out.println("next step is starting");
        //****** choose Birds game
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-footer/footer/div/div[2]/a[1]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
             WebElement ele = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[5]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        //Creating object of an Actions class
            Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
            action.moveToElement(ele).perform();

        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[5]/app-game-card/div/div[2]/div/div[1]/a[3]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        int size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
        if(size > 0) {
            System.out.println("********We are switch to the iframe*******" + "size = "+ size + "  " + "birds game");
        }
        else
        {
            System.out.println("underfound this game namme ' birds'");
        }
        driver.quit();

    }

    @Test
    public static void casino() {
        GameLaunch gamelaunch = new GameLaunch();

        System.out.println("positive test");
        GameLaunch.chakicon("test142A", "test142A");
        System.out.println("next step is starting");
        //****** choose Casino game
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-footer/footer/div/div[2]/a[1]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
             WebElement ele = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[6]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        //Creating object of an Actions class
            Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
            action.moveToElement(ele).perform();
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[6]/app-game-card/div/div[2]/div/div[1]/a[3]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        int size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
        if(size > 0) {
            System.out.println("********We are switch to the iframe*******" + "size = "+ size + "  " +  "casino");
        }
        else
        {
            System.out.println("underfound this game namme ' casino'");
        }
        driver.quit();

    }

    @Test
    public static void Galaxy() {
        GameLaunch gamelaunch = new GameLaunch();

        System.out.println("positive test");
        GameLaunch.chakicon("test142A", "test142A");
        System.out.println("next step is starting");
        //****** choose Galaxy game
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-footer/footer/div/div[2]/a[1]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[7]/app-game-card/div/div[2]/div/div[2]/picture/img"));
                //Creating object of an Actions class
                 Actions action = new Actions(driver);
                //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[7]/app-game-card/div/div[2]/div/div[1]/a[3]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        int size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
        if(size > 0) {
            System.out.println("********We are switch to the iframe*******" + "size = " + size  + "  " + "galaxy game");
        }
        else
        {
            System.out.println("underfound this game namme ' galaxy'");
        }
        driver.quit();

    }

    @Test
    public static void City_Slot() {
        GameLaunch gamelaunch = new GameLaunch();
        System.out.println("positive test");
        GameLaunch.chakicon("test142A", "test142A");
        System.out.println("next step is starting");
        //****** choose City_Slot game
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-footer/footer/div/div[2]/a[1]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[8]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[8]/app-game-card/div/div[2]/div/div[1]/a[3]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        int size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
        if(size > 0) {
            System.out.println("********We are switch to the iframe*******" + "size = " + size  + "  " + "City_Slot game");
        }
        else
        {
            System.out.println("underfound this game namme ' City_Slot'");
        }
        driver.quit();

    }


    @Test
    public static void Cowboy() {
        GameLaunch gamelaunch = new GameLaunch();

        System.out.println("positive test");
        GameLaunch.chakicon("test142A", "test142A");
        System.out.println("next step is starting");
        //****** choose Cowboy game
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-footer/footer/div/div[2]/a[1]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[9]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[9]/app-game-card/div/div[2]/div/div[1]/a[3]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        int size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
        if(size > 0) {
            System.out.println("********We are switch to the iframe*******" + "size = " + size  + "  " + "Cowboy game");
        }
        else
        {
            System.out.println("underfound this game namme ' Cowboy'");
        }
        driver.quit();

    }

    @Test
    public static void Book_of_win() {
        GameLaunch gamelaunch = new GameLaunch();
        System.out.println("positive test");
        GameLaunch.chakicon("test142A", "test142A");
        System.out.println("next step is starting");
        //****** choose Book_of_win game
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-footer/footer/div/div[2]/a[1]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[10]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[10]/app-game-card/div/div[2]/div/div[1]/a[3]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        int size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
        if(size > 0) {
            System.out.println("********We are switch to the iframe*******" + "size = " + size  + "  " + "Book_of_win game");
        }
        else
        {
            System.out.println("underfound this game namme ' Book_of_win'");
        }
        driver.quit();

    }

    @Test
    public static void Cristmas() {
        GameLaunch gamelaunch = new GameLaunch();
        System.out.println("positive test");
        GameLaunch.chakicon("test142A", "test142A");
        System.out.println("next step is starting");
        //****** choose Cristmas game
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-footer/footer/div/div[2]/a[1]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[11]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[11]/app-game-card/div/div[2]/div/div[1]/a[3]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        int size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
        if(size > 0) {
            System.out.println("********We are switch to the iframe*******" + "size = " + size  + "  " + "Cristmas game");
        }
        else
        {
            System.out.println("underfound this game namme ' Cristmas'");
        }
       // driver.quit();

    }

    @Test
    public static void Sport() {
        GameLaunch gamelaunch = new GameLaunch();
        System.out.println("positive test");
        GameLaunch.chakicon("test142A", "test142A");
        System.out.println("next step is starting");
        //****** choose Sport game
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-footer/footer/div/div[2]/a[1]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[12]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[12]/app-game-card/div/div[2]/div/div[1]/a[3]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        int size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
        if(size > 0) {
            System.out.println("********We are switch to the iframe*******" + "size = " + size  + "  " + "Sport game");
        }
        else
        {
            System.out.println("underfound this game namme ' Sport'");
        }
         driver.quit();

    }
    @Test
    public static void Dota() {
        GameLaunch gamelaunch = new GameLaunch();
        System.out.println("positive test");
        GameLaunch.chakicon("test142A", "test142A");
        System.out.println("next step is starting");
        //****** choose Dota game
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-footer/footer/div/div[2]/a[1]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[13]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[13]/app-game-card/div/div[2]/div/div[1]/a[3]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        int size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
        if(size > 0) {
            System.out.println("********We are switch to the iframe*******" + "size = " + size  + "  " + "Dota game");
        }
        else
        {
            System.out.println("underfound this game namme ' Dota'");
        }
        driver.quit();

    }

    @Test
    public static void FunfRuit() {
        GameLaunch gamelaunch = new GameLaunch();
        System.out.println("positive test");
        GameLaunch.chakicon("test142A", "test142A");
        System.out.println("next step is starting");
        //****** choose FunfRuit game
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-footer/footer/div/div[2]/a[1]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[14]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[14]/app-game-card/div/div[2]/div/div[1]/a[3]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        int size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
        if(size > 0) {
            System.out.println("********We are switch to the iframe*******" + "size = " + size  + "  " + "FunfRuit game");
        }
        else
        {
            System.out.println("underfound this game namme ' FunfRuit'");
        }
        driver.quit();

    }

    @Test
    public static void Pharaon() {
        GameLaunch gamelaunch = new GameLaunch();
        System.out.println("positive test");
        GameLaunch.chakicon("test142A", "test142A");
        System.out.println("next step is starting");
        //****** choose Pharaon game
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-footer/footer/div/div[2]/a[1]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        //**** Sckroll down to curent position

        WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[7]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        Actions actions = new Actions(driver);
            actions.moveToElement(mainMenu);
            WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[28]/app-game-card/div/div[2]/div/div[2]/picture/img"));
            actions.moveToElement(subMenu);
            actions.click().build().perform();

        WebElement ele = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[15]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[15]/app-game-card/div/div[2]/div/div[1]/a[3]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        int size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
        if(size > 0) {
            System.out.println("********We are switch to the iframe*******" + "size = " + size  + "  " + "Pharaon game");
        }
        else
        {
            System.out.println("underfound this game namme ' Pharaon'");
        }
        driver.quit();

    }

    @Test
    public static void Football() {
        GameLaunch gamelaunch = new GameLaunch();
        System.out.println("positive test");
        GameLaunch.chakicon("test142A", "test142A");
        System.out.println("next step is starting");
        //****** choose Football  game
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-footer/footer/div/div[2]/a[1]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        //**** Sckroll down to curent position

        WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[7]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu);
        WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[28]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        actions.moveToElement(subMenu);
        actions.click().build().perform();

        WebElement ele = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[16]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[16]/app-game-card/div/div[2]/div/div[1]/a[3]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        int size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
        if(size > 0) {
            System.out.println("********We are switch to the iframe*******" + "size = " + size  + "  " + "Football game");
        }
        else
        {
            System.out.println("underfound this game namme ' Football'");
        }
        driver.quit();

    }

    @Test
    public static void Samurai() {
        GameLaunch gamelaunch = new GameLaunch();
        System.out.println("positive test");
        GameLaunch.chakicon("test142A", "test142A");
        System.out.println("next step is starting");
        //****** choose Samurai  game
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-footer/footer/div/div[2]/a[1]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        //**** Sckroll down to curent position

        WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[7]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu);
        WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[28]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        actions.moveToElement(subMenu);
        actions.click().build().perform();

        WebElement ele = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[17]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[17]/app-game-card/div/div[2]/div/div[1]/a[3]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        int size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
        if(size > 0) {
            System.out.println("********We are switch to the iframe*******" + "size = " + size  + "  " + "Samurai game");
        }
        else
        {
            System.out.println("underfound this game namme ' Samurai'");
        }
        driver.quit();

    }
    @Test
    public static void Argo() {
        GameLaunch gamelaunch = new GameLaunch();
        System.out.println("positive test");
        GameLaunch.chakicon("test142A", "test142A");
        System.out.println("next step is starting");
        //****** choose Argo  game
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-footer/footer/div/div[2]/a[1]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        //**** Sckroll down to curent position

        WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[7]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu);
        WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[28]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        actions.moveToElement(subMenu);
        actions.click().build().perform();

        WebElement ele = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[18]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[18]/app-game-card/div/div[2]/div/div[1]/a[3]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        int size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
        if(size > 0) {
            System.out.println("********We are switch to the iframe*******" + "size = " + size  + "  " + "Argo game");
        }
        else
        {
            System.out.println("underfound this game namme ' Argo'");
        }
        driver.quit();

    }

    @Test
    public static void Sweet_Candy() {
        GameLaunch gamelaunch = new GameLaunch();
        System.out.println("positive test");
        GameLaunch.chakicon("test142A", "test142A");
        System.out.println("next step is starting");
        //****** choose Sweet_Candy  game
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-footer/footer/div/div[2]/a[1]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        //**** Sckroll down to curent position

        WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[7]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu);
        WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[28]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        actions.moveToElement(subMenu);
        actions.click().build().perform();

        WebElement ele = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[19]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[19]/app-game-card/div/div[2]/div/div[1]/a[3]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        int size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
        if(size > 0) {
            System.out.println("********We are switch to the iframe*******" + "size = " + size  + "  " + "Sweet_Candy game");
        }
        else
        {
            System.out.println("underfound this game namme ' Sweet_Candy'");
        }
        driver.quit();

    }
    @Test
    public static void MoonStone() {
        GameLaunch gamelaunch = new GameLaunch();
        System.out.println("positive test");
        GameLaunch.chakicon("test142A", "test142A");
        System.out.println("next step is starting");
        //****** choose MoonStone  game
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-footer/footer/div/div[2]/a[1]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        //**** Sckroll down to curent position

        WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[7]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu);
        WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[28]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        actions.moveToElement(subMenu);
        actions.click().build().perform();

        WebElement ele = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[20]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[20]/app-game-card/div/div[2]/div/div[1]/a[3]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        int size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
        if(size > 0) {
            System.out.println("********We are switch to the iframe*******" + "size = " + size  + "  " + "MoonStone game");
        }
        else
        {
            System.out.println("underfound this game namme ' MoonStone'");
        }
        driver.quit();

    }

    @Test
    public static void Bankjob() {
        GameLaunch gamelaunch = new GameLaunch();
        System.out.println("positive test");
        GameLaunch.chakicon("test142A", "test142A");
        System.out.println("next step is starting");
        //****** choose Bankjob  game
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-footer/footer/div/div[2]/a[1]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        //**** Sckroll down to curent position

        WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[7]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu);
        WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[28]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        actions.moveToElement(subMenu);
        actions.click().build().perform();

        WebElement ele = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[21]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[21]/app-game-card/div/div[2]/div/div[1]/a[3]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        int size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
        if(size > 0) {
            System.out.println("********We are switch to the iframe*******" + "size = " + size  + "  " + "Bankjob game");
        }
        else
        {
            System.out.println("underfound this game namme ' Bankjob'");
        }
        driver.quit();

    }


    @Test
    public static void Apollo() {
        GameLaunch gamelaunch = new GameLaunch();
        System.out.println("positive test");
        GameLaunch.chakicon("test142A", "test142A");
        System.out.println("next step is starting");
        //****** choose Apollo  game
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-footer/footer/div/div[2]/a[1]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        //**** Sckroll down to curent position

        WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[7]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu);
        WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[28]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        actions.moveToElement(subMenu);
        actions.click().build().perform();

        WebElement ele = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[22]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[22]/app-game-card/div/div[2]/div/div[1]/a[3]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        int size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
        if(size > 0) {
            System.out.println("********We are switch to the iframe*******" + "size = " + size  + "  " + "Apollo game");
        }
        else
        {
            System.out.println("underfound this game namme ' Apollo'");
        }
        driver.quit();

    }

    @Test
    public static void Burning_Ice() {
        GameLaunch gamelaunch = new GameLaunch();
        System.out.println("positive test");
        GameLaunch.chakicon("test142A", "test142A");
        System.out.println("next step is starting");
        //****** choose Burning_Ice  game
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-footer/footer/div/div[2]/a[1]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        //**** Sckroll down to curent position

        WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[7]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu);
        WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[28]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        actions.moveToElement(subMenu);
        actions.click().build().perform();

        WebElement ele = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[23]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[23]/app-game-card/div/div[2]/div/div[1]/a[3]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        int size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
        if(size > 0) {
            System.out.println("********We are switch to the iframe*******" + "size = " + size  + "  " + "Burning_Ice game");
        }
        else
        {
            System.out.println("underfound this game namme ' Burning_Ice'");
        }
        driver.quit();

    }

    @Test
    public static void Evolution() {
        GameLaunch gamelaunch = new GameLaunch();
        System.out.println("positive test");
        GameLaunch.chakicon("test142A", "test142A");
        System.out.println("next step is starting");
        //****** choose Evolution  game
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-footer/footer/div/div[2]/a[1]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        //**** Sckroll down to curent position

        WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[7]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu);
        WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[35]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        actions.moveToElement(subMenu);
        actions.click().build().perform();

        WebElement ele = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[24]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[24]/app-game-card/div/div[2]/div/div[1]/a[3]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        int size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
        if(size > 0) {
            System.out.println("********We are switch to the iframe*******" + "size = " + size  + "  " + "Evolution game");
        }
        else
        {
            System.out.println("underfound this game namme ' Evolution'");
        }
        driver.quit();

    }

    @Test
    public static void Magic_Garden() {
        GameLaunch gamelaunch = new GameLaunch();
        System.out.println("positive test");
        GameLaunch.chakicon("test142A", "test142A");
        System.out.println("next step is starting");
        //****** choose Magic_Garden  game
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-footer/footer/div/div[2]/a[1]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        //**** Sckroll down to Magic_Garden position

        WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[7]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu);
        WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[25]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        actions.moveToElement(subMenu);
        actions.click().build().perform();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[25]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[25]/app-game-card/div/div[2]/div/div[1]/a[3]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        int size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
        if(size > 0) {
            System.out.println("********We are switch to the iframe*******" + "size = " + size  + "  " + "Magic_Garden game");
        }
        else
        {
            System.out.println("underfound this game namme ' Magic_Garden'");
        }
        driver.quit();

    }

    @Test
    public static void Burning_Ice_10() {
        GameLaunch gamelaunch = new GameLaunch();
        System.out.println("positive test");
        GameLaunch.chakicon("test142A", "test142A");
        System.out.println("next step is starting");
        //****** choose Burning_Ice_10  game
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-footer/footer/div/div[2]/a[1]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        //**** Sckroll down to Magic_Garden position

        WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[7]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu);
        WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[26]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        actions.moveToElement(subMenu);
        actions.click().build().perform();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[25]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[26]/app-game-card/div/div[2]/div/div[1]/a[3]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        int size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
        if(size > 0) {
            System.out.println("********We are switch to the iframe*******" + "size = " + size  + "  " + "Burning_Ice_10 game");
        }
        else
        {
            System.out.println("underfound this game namme ' Burning_Ice_10'");
        }
        driver.quit();

    }

    @Test
    public static void Magic_Garden_10() {
        GameLaunch gamelaunch = new GameLaunch();
        System.out.println("positive test");
        GameLaunch.chakicon("test142A", "test142A");
        System.out.println("next step is starting");
        //****** choose Magic_Garden_10  game
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-footer/footer/div/div[2]/a[1]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        //**** Sckroll down to Magic_Garden position

        WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[7]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu);
        WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[27]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        actions.moveToElement(subMenu);
        actions.click().build().perform();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[27]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[27]/app-game-card/div/div[2]/div/div[1]/a[3]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        int size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
        if(size > 0) {
            System.out.println("********We are switch to the iframe*******" + "size = " + size  + "  " + "Magic_Garden_10 game");
        }
        else
        {
            System.out.println("underfound this game namme ' Magic_Garden_10'");
        }
        driver.quit();

    }
    @Test
    public static void Virtual_Roullette() {
        GameLaunch gamelaunch = new GameLaunch();
        System.out.println("positive test");
        GameLaunch.chakicon("test142A", "test142A");
        System.out.println("next step is starting");
        //****** choose Virtual_Roullette  game
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-footer/footer/div/div[2]/a[1]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        //**** Sckroll down to Magic_Garden position

        WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[7]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu);
        WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[28]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        actions.moveToElement(subMenu);
        actions.click().build().perform();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[28]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[28]/app-game-card/div/div[2]/div/div[1]/a[3]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        int size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
        if(size > 0) {
            System.out.println("********We are switch to the iframe*******" + "size = " + size  + "  " + "Virtual_Roullette game");
        }
        else
        {
            System.out.println("underfound this game namme ' Virtual_Roullette'");
        }
        driver.quit();

    }

    @Test
    public static void Virtual_Burning_Roullette() {
        GameLaunch gamelaunch = new GameLaunch();
        System.out.println("positive test");
        GameLaunch.chakicon("test142A", "test142A");
        System.out.println("next step is starting");
        //****** choose Virtual_Burning_Roullette  game
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-footer/footer/div/div[2]/a[1]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        //**** Sckroll down to Magic_Garden position

        WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[7]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu);
        WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[29]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        actions.moveToElement(subMenu);
        actions.click().build().perform();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[29]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[29]/app-game-card/div/div[2]/div/div[1]/a[3]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        int size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
        if(size > 0) {
            System.out.println("********We are switch to the iframe*******" + "size = " + size  + "  " + "Virtual_Burning_Roullette game");
        }
        else
        {
            System.out.println("underfound this game namme ' Virtual_Burning_Roullette'");
        }
        driver.quit();

    }

    @Test
    public static void Sic_Bo() {
        GameLaunch gamelaunch = new GameLaunch();
        System.out.println("positive test");
        GameLaunch.chakicon("test142A", "test142A");
        System.out.println("next step is starting");
        //****** choose Sic_Bo  game
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-footer/footer/div/div[2]/a[1]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        //**** Sckroll down to Sic_Bo position

        WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[7]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu);
        WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[30]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        actions.moveToElement(subMenu);
        actions.click().build().perform();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[30]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[30]/app-game-card/div/div[2]/div/div[1]/a[3]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        int size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
        if(size > 0) {
            System.out.println("********We are switch to the iframe*******" + "size = " + size  + "  " + "Sic_Bo game");
        }
        else
        {
            System.out.println("underfound this game namme ' Sic_Bo'");
        }
        driver.quit();

    }

    @Test
    public static void Classic_Roulette() {
        GameLaunch gamelaunch = new GameLaunch();
        System.out.println("positive test");
        GameLaunch.chakicon("test142A", "test142A");
        System.out.println("next step is starting");
        //****** choose Classic_Roulette  game
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-footer/footer/div/div[2]/a[1]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        //**** Sckroll down to Classic_Roulette position

        WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[7]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu);
        WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[31]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        actions.moveToElement(subMenu);
        actions.click().build().perform();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[31]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[31]/app-game-card/div/div[2]/div/div[1]/a[3]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        int size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
        if(size > 0) {
            System.out.println("********We are switch to the iframe*******" + "size = " + size  + "  " + "Classic_Roulette game");
        }
        else
        {
            System.out.println("underfound this game namme ' Classic_Roulette'");
        }
        driver.quit();

    }

    @Test
    public static void Lucky_Seven() {
        GameLaunch gamelaunch = new GameLaunch();
        System.out.println("positive test");
        GameLaunch.chakicon("test142A", "test142A");
        System.out.println("next step is starting");
        //****** choose Lucky_Seven  game
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-footer/footer/div/div[2]/a[1]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        //**** Sckroll down to Lucky_Seven position

        WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[7]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu);
        WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[32]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        actions.moveToElement(subMenu);
        actions.click().build().perform();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[32]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[32]/app-game-card/div/div[2]/div/div[1]/a[3]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        int size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
        if(size > 0) {
            System.out.println("********We are switch to the iframe*******" + "size = " + size  + "  " + "Lucky_Seven game");
        }
        else
        {
            System.out.println("underfound this game namme ' Lucky_Seven'");
        }
        driver.quit();

    }


    @Test
    public static void Triple_seven() {
        GameLaunch gamelaunch = new GameLaunch();
        System.out.println("positive test");
        GameLaunch.chakicon("test142A", "test142A");
        System.out.println("next step is starting");
        //****** choose Triple_seven  game
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-footer/footer/div/div[2]/a[1]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        //**** Sckroll down to Triple_seven position

        WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[7]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu);
        WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[33]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        actions.moveToElement(subMenu);
        actions.click().build().perform();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[33]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[33]/app-game-card/div/div[2]/div/div[1]/a[3]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        int size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
        if(size > 0) {
            System.out.println("********We are switch to the iframe*******" + "size = " + size  + "  " + "Triple_seven game");
        }
        else
        {
            System.out.println("underfound this game namme ' Triple_seven'");
        }
         driver.quit();

    }

    @Test
    public static void Balloon() {
        GameLaunch gamelaunch = new GameLaunch();
        System.out.println("positive test");
        GameLaunch.chakicon("test142A", "test142A");
        System.out.println("next step is starting");
        //****** choose Balloon  game
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-footer/footer/div/div[2]/a[1]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        //**** Sckroll down to Balloon position

        WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[7]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu);
        WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[32]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        actions.moveToElement(subMenu);
        actions.click().build().perform();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[34]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[34]/app-game-card/div/div[2]/div/div[1]/a[3]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        int size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
        if(size > 0) {
            System.out.println("********We are switch to the iframe*******" + "size = " + size  + "  " + "Balloon game");
        }
        else
        {
            System.out.println("underfound this game namme ' Balloon'");
        }
         driver.quit();

    }


    @Test
    public static void Space_Lotto() {
        GameLaunch gamelaunch = new GameLaunch();
        System.out.println("positive test");
        GameLaunch.chakicon("test142A", "test142A");
        System.out.println("next step is starting");
        //****** choose Space_Lotto  game
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-footer/footer/div/div[2]/a[1]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        //**** Sckroll down to Space_Lotto position

        WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[7]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu);
        WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[32]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        actions.moveToElement(subMenu);
        actions.click().build().perform();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[34]/app-game-card/div/div[2]/div/div[2]/picture/img"));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
        driver.findElement(By.xpath("//*[@id=\"page__id\"]/div[2]/div/app-providers/section/div/div[2]/div[34]/app-game-card/div/div[2]/div/div[1]/a[3]/img")).click();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        int size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
        if(size > 0) {
            System.out.println("********We are switch to the iframe*******" + "size = " + size  + "  " + "Space_Lotto game");
        }
        else
        {
            System.out.println("underfound this game namme ' Space_Lotto'");
        }
        driver.quit();

    }


}
