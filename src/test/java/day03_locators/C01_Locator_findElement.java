package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locator_findElement {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // Amazona git
        driver.get("https://www.amazon.com.tr");
        // arama kutusuna Nutella yazdırın
        WebElement aramaKutusuElementi= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusuElementi.sendKeys("Nutella");
        //enter tuşuna basıp arama yaptırın.
        aramaKutusuElementi.submit();




        Thread.sleep(5000);
        driver.close();




    }
}
