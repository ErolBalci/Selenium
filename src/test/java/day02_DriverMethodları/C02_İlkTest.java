package day02_DriverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_İlkTest {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
        WebDriver driver =new ChromeDriver();


        // 3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com.tr");

        // 4. Sayfa basligini(title) yazdirin
        System.out.println("Sayfa başlığı :" + driver.getTitle());
        //5. Sayfa basliginin “Amazon” icerdigini test edin

        String expectedIcerik="Amazon";
        String actualTitle=driver.getTitle();

        if (actualTitle.contains(expectedIcerik)){
            System.out.println( "Title Amazon içeriyor , Test PASSED");
        }else {
            System.out.println( "Title Amazon içermiyor , Test FAILED");
        }



       //6. Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());
        //7. Sayfa url’inin “amazon” icerdigini test edin.
        expectedIcerik="amazon";
        String actualUrl=driver.getCurrentUrl();
        if (actualUrl.contains(expectedIcerik)){
            System.out.println( "Url Amazon içeriyor , Test PASSED");
        }else{
            System.out.println( "Url Amazon içermiyor , Test FAILED");
        }

       //8. Sayfa handle degerini yazdirin

        System.out.println(driver.getWindowHandle());
        //9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
     expectedIcerik="alisveris";
     String actualPageSource=driver.getPageSource();

        if (actualPageSource.contains(expectedIcerik)){
            System.out.println("Sayfa kaynak kodlari alisveris iceriyor, test PASSED");
        }else {
            System.out.println("Sayfa kaynak kodlari alisveris icermiyor, test FAILED");
        }


       //10. Sayfayi kapatin.

        Thread.sleep(2000);
        driver.close();

    }
}
