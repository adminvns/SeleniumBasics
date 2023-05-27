package org.example;

import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.grid.config.EnvConfig;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class login {


    public void funcLogin(ChromeDriver driver) throws InterruptedException {
        Dotenv dotenv = Dotenv.load();
        driver.get(dotenv.get("URL"));
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.id("login-form-email"));
        WebElement password = driver.findElement(By.id("login-form-password"));
        WebElement login_btn = driver.findElement(By.xpath("(//*[@id=\"login\"]//button)[1]"));
        username.sendKeys(dotenv.get("ID"));
        password.sendKeys(dotenv.get("PASS"));
        Thread.sleep(4000);
        login_btn.click();
        Thread.sleep(5000);

    }

    public void funcBrowserClose(ChromeDriver driver) {

        driver.close();
        driver.quit();
    }


}



