package TekrarCalismasi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_syf31 {
    public static void main(String[] args) {


    // 1. Yeni bir class olusturun (TekrarTesti)
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    // 2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın (verify),
        // eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://www.youtube.com");
        String expectedIçerik="youtube";
        String actualTitle=driver.getTitle();
        if (actualTitle.contains(expectedIçerik)){
            System.out.println("Title youtube içeriyor, Test Passed");
        }else {
            System.out.println("Title youtube icermiyor, Title: "+ driver.getTitle());
        }
    // 3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.
        expectedIçerik="youtube";
        String actualUrl=driver.getCurrentUrl();
        if (actualTitle.contains(expectedIçerik)){
            System.out.println("Url youtube içeriyor, Test Passed");
        }else {
            System.out.println("Url youtube içermiyor, Url: " +driver.getCurrentUrl());
        }
    // 4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com");
    // 5. Youtube sayfasina geri donun
        driver.navigate().back();
    // 6. Sayfayi yenileyin
        driver.navigate().refresh();
    // 7. Amazon sayfasina donun
        driver.navigate().forward();
    // 8. Sayfayi tamsayfa yapin
        driver.manage().window().fullscreen();
    // 9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,Yoksa doğru başlığı( Title) yazdırın.
        expectedIçerik="Amazon";
        actualTitle=driver.getTitle();
        if (actualTitle.contains(expectedIçerik)){
            System.out.println("Title Amazon içeriyor, Test Passed");
        }else {
            System.out.println("Title Amazon icermiyor, Title: "+ driver.getTitle());
        }
    // 10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın
        expectedIçerik="https://www.amazon.com/";
        actualUrl=driver.getCurrentUrl();
        if (actualTitle.contains(expectedIçerik)){
            System.out.println("Url https://www.amazon.com/ içeriyor, Test Passed");
        }else {
            System.out.println("Url https://www.amazon.com/ içermiyor, Url: " +driver.getCurrentUrl());
        }
    // 11.Sayfayi kapatin
        driver.close();





    }
}
