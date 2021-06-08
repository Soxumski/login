import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class ChromeRunner {
 public static WebDriver driver;


    @BeforeMethod
    public static void RunChrome()
        {
            System.setProperty("webdriver.chrome.driver",
                    "C:\\Users\\ACER\\driver\\chromedriver.exe");

            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get("https://beta.betvili.com");

        }

}
