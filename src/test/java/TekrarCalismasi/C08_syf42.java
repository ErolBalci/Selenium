package TekrarCalismasi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C08_syf42 {
    public static void main(String[] args) {

      //  1- Bir test class’i olusturun ilgili ayarlari yapin
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

      //  2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com");
      //  3- Category bolumundeki elementleri locate edin
        List<WebElement> CategoryElementleriListesi =driver.findElements(By.xpath("//*[@ class='panel panel-default']"));
      //  4- Category bolumunde 3 element oldugunu test edin
        int expextedSize=3;
        int actualSize=CategoryElementleriListesi.size();
        if (actualSize==expextedSize){
            System.out.println("Category Elementleri Testi Passed");
        }else {
            System.out.println("Category Elementleri Testi Failed");
        }

      //  5- Category isimlerini yazdirin
        for (WebElement eachList:CategoryElementleriListesi ) {
            System.out.println(eachList.getText());

        }

      //  6- Sayfayi kapatin
        driver.close();




    }
}
