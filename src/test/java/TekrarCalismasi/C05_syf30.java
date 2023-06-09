package TekrarCalismasi;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_syf30 {
        public static void main(String[] args) {


                //   1.Yeni bir class olusturalim (Homework)
                //   2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin
                //   (title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi
                //   yazdirin.

                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
                driver.get("https://tr-tr.facebook.com");
                String expectedIcerik = "facebook";
                String actualTitle = driver.getTitle();
                if (actualTitle.contains(expectedIcerik)){
                        System.out.println("Title facebook içeriyor test Passed");
                }else {
                        System.out.println("Title" + driver.getTitle());
                }

                //   3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
               String expectedUrl="facebook";
               String actualUrl=driver.getCurrentUrl();
               if (actualUrl.contains(expectedUrl)){
                       System.out.println("Url facebook içeriyor Test Passed");
               }else {
                       System.out.println("Url " + driver.getCurrentUrl());
               }

                //   4.https://www.walmart.com/ sayfasina gidin.
                driver.get("https://www.walmart.com/");
                //   5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
                expectedIcerik = "Walmart.com";
                actualTitle = driver.getTitle();
                if (actualTitle.contains(expectedIcerik)){
                        System.out.println("Title Walmart.com içeriyor test Passed");
                }else {
                        System.out.println("Title" + driver.getTitle());
                }
                //   6. Tekrar “facebook” sayfasina donun
                driver.navigate().back();
                //   7. Sayfayi yenileyin
                driver.navigate().refresh();
                //   8. Sayfayi tam sayfa (maximize) yapin
                driver.manage().window().maximize();
                //   9.Browser’i kapatin
                driver.close();

        }
    }

