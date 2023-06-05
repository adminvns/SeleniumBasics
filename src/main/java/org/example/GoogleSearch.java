package org.example;

import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

    public void runner(ChromeDriver driver) throws InterruptedException {

        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    public void funcBrowserClose(ChromeDriver driver) {

        driver.close();
        driver.quit();
    }
}
