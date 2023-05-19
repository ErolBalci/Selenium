package TekrarCalismasi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_23syf {
    public static void main(String[] args) {

        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.com.tr");
        System.out.println(driver.getTitle());
        String expectedTitle="Amazon";
        String actualTitle=driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title Test Başarılı");
        }else{
            System.out.println("Title Test Başarısız");
        }

        System.out.println(driver.getCurrentUrl());
        String expectedUrl="amazon";
        String actualUrl=driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrl)){
            System.out.println("Url Test Başarılı");
        }else{
            System.out.println("Url Test Başarısız");
        }
        System.out.println(driver.getWindowHandle());
        String expectedPage="alisveris";
        String actualPage=driver.getPageSource();
        if (actualPage.contains(expectedPage)){
            System.out.println("Page Test Başarılı");

        }else {
            System.out.println("Page Test Başarısız");
        }
        driver.close();
    }



}
