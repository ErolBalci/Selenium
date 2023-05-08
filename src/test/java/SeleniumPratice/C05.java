package SeleniumPratice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05 {
    public static void main(String[] args) throws InterruptedException {

      // 1-Driver oluşturalim
        WebDriverManager.chromedriver().setup();
      // 2-Java class'imiza chnomedriver. exetyi tanitalim
        WebDriver driver =new ChromeDriver();
      // 3-Driver'in tum ekranı kaplamasini sagu ayalim
        driver.manage().window().maximize();
      // 4-Driverla sayfanın yuklenmesini 10.809 milisaniye (10 saniye) boyunca beklesini söyleyelim.
      //         Eger oncesinde sqyfa Yüklenirse, beklemeyi bıraksın.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      // 5-Navigate to http://www.babayigit.net/murat/testpage.html
        driver.navigate().to("http://www.babayigit.net/murat/testpage.html");
      // 6-first name, surname, age, Your Job, Birth Palace, Last graduated school, Number of Children
      // alanlarına gerekli bilgileri yazsın
        driver.findElement(By.id("ad")).sendKeys("Birol");
        driver.findElement(By.id("soyad")).sendKeys("Bakırcı");
        driver.findElement(By.id("yas")).sendKeys("35");
        driver.findElement(By.id("meslek")).sendKeys("Software Development QA");
        driver.findElement(By.id("dogum_yeri")).sendKeys("Bursa");
        driver.findElement(By.id("mezun_okul")).sendKeys("Hacettepe Üniversitesi");
        driver.findElement(By.id("cocuk_sayisi")).sendKeys("2");
        Thread.sleep(2000);
      // 7-Submit tuşuna bassın.
        driver.findElement(By.xpath("/html/body/center/form/input[8]")).click();
        Thread.sleep(2000);
      // 8- All information was entered correctly.. yazısının göründüğünü test etsin
        WebElement uyarıYazısı =driver.findElement(By.xpath("//*[@id=\"uyari\"]"));
        System.out.println(uyarıYazısı.getText());
        String sonuç= uyarıYazısı.getText();
        String expectedİcerik="All information was entered correctly";


        // 9- Clear butonu ile tüm butonları temizlesin
        driver.findElement(By.xpath("/html/body/center/form/input[9]")).click();
      // 10- Manuel olarak temizlendiğini görecek kadar beklesin
        Thread.sleep(5000);
      // 11- Sayfayı kapatsın
        driver.close();
      // 12-8. maddededeki Test sonucunu yazdırsın
        if (sonuç.contains(expectedİcerik)){
            System.out.println("Uyarı yazısı görünüyor Test PASSED");
        }else {
            System.out.println("Uyarı yazısı görünmüyor Test FAILED");


    }
}}
