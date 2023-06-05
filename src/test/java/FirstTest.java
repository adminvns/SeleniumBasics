import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.OPOS;
import org.example.login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {

    @Test(priority = 3)
    public void Hello_test() {
        System.out.println("Hello");


    }

//    @Test(priority = 1)
//    public void Login_storefront() throws InterruptedException {
//        ChromeDriver driver = new ChromeDriver();
//        login login = new login();
//        login.funcLogin(driver);
//        login.funcBrowserClose(driver);
//    }

}


