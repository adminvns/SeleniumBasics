import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.GoogleSearch;
import org.example.OPOS;
import org.example.login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FirstTest {

    @Test(priority = 2)
    public void Hello_test() {
        System.out.println("Test case demo executed!!");


    }

    @Ignore
    @Test
    public void Login_storefront() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        login login = new login();
        login.funcLogin(driver);
        login.funcBrowserClose(driver);
    }
    @Test(priority = 1)
    public void Google_Search_Test() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        GoogleSearch googleSearch = new GoogleSearch();
        googleSearch.runner(driver);
        googleSearch.funcBrowserClose(driver);
    }

}


