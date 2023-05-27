import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void Test1() {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://google.com");
        System.out.println("Hello");


    }

    @Test
    public void Test2() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        login login = new login();
        login.funcLogin(driver);
        login.funcBrowserClose(driver);

    }
}
