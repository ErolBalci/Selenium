package TekrarCalismasi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C09_syf47 {
    public static void main(String[] args) {


      //  1- Bir test class’i olusturun ilgili ayarlari yapin
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

      //  2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com");
      //  3- Sayfada 147 adet link bulundugunu test edin.
        List<WebElement> sayfadakiLinkElementleriList=driver.findElements(By.tagName("a"));
       // System.out.println(sayfadakiLinkElementleriList.size());
        int expectedSize=147;
        int actualSize=sayfadakiLinkElementleriList.size();
        if (actualSize==expectedSize){
            System.out.println("Link Testi Passed");
        }else {
            System.out.println("Link Testi Failed");
        }
        //  4- Products linkine tiklayin
        driver.findElement(By.xpath("//*[@href='/products']")).click();
      //  5- special offer yazisinin gorundugunu test edin
        WebElement specialOfferYazisi= driver.findElement(By.id("sale_image"));
        if (specialOfferYazisi.isDisplayed()){
            System.out.println("Special Offer Testi Passed");
        }else {
            System.out.println("Special Offer Testi Failed");
        }
      //  6- Sayfayi kapatin
        driver.close();





    }
}
