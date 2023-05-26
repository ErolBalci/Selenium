package TekrarCalismasi2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_syf599999 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

      //  1- bir class olusturun
      //  2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
      //  3- Browseri tam sayfa yapin
        driver.manage().window().maximize();
      //  4- Sayfayi “refresh” yapin
        driver.navigate().refresh();
      //  5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String expectedTitle="Spend less";
        String actualTitle=driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title Spend less yazısı içeriyor Test Passed");
        }else {
            System.out.println("Title Spend less yazısı içermiyor Test Failed");
        }
      //  6- Gift Cards sekmesine basin
        driver.findElement(By.xpath("(//span[@class='nav-text'])[2]")).click();
      //  7- Birthday butonuna basin

      //  8- Best Seller bolumunden ilk urunu tiklayin
      //  9- Gift card details’den 25 $’i secin
      //  10-Urun ucretinin 25$ oldugunu test edin
      //  11-Sayfayi kapatin
        driver.close();

    }
}
