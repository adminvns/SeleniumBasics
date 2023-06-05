package org.example;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OPOS {

    public void LibOpos(ChromeDriver driver) throws InterruptedException   {

        WebElement opos_btn =driver.findElement(By.xpath("//*[@id=\"maincontent\"]//a[@href='https://bcln-001.sandbox.us01.dx.commercecloud.salesforce.com/s/marykayintouch-br/opos?lang=pt_BR']"));
        opos_btn.click();


        Thread.sleep(3000);


        WebElement expand_link =driver.findElement(By.xpath("//*[@id=\"maincontent\"]//span[@class='expand-label']"));
        expand_link.click();

        //logic for getting all the OPOS SKU product's count
        List <WebElement> sku_Counts =  driver.findElements(By.xpath("//input[contains(@class,'quantity-select')]"));
        int count =0;

        for( WebElement sku_Count : sku_Counts) {

            count++;
        }
        System.out.println(count);



    }

}
