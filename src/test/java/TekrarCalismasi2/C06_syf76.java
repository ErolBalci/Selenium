package TekrarCalismasi2;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C06_syf76 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //   1- C01_TekrarTesti isimli bir class olusturun
        //   2- https://www.google.com/ adresine gidin
        driver.get("https://www.google.com");
        //   3- cookies uyarisini kabul ederek kapatin
        //   4- Sayfa basliginin “Google” ifadesi icerdigini test edin
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        //   5- Arama cubuguna “Nutella” yazip aratin
        driver.findElement(By.xpath("// *[@id='APjFqb']")).sendKeys("Nutella" + Keys.ENTER);
        //   6- Bulunan sonuc sayisini yazdirin
        WebElement aramaSonucYazisi = driver.findElement(By.xpath("//*[@id=\"result-stats\"]"));
        System.out.println(aramaSonucYazisi.getText());
        //   7- sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
        List<String> sonucList = List.of(aramaSonucYazisi.getText().split(" "));
        System.out.println(sonucList);
        String sonucSayisi = sonucList.get(1);
        //sonucSayisi.replace(".", "");
        System.out.println();
        System.out.println(sonucSayisi);
        sonucSayisi.replaceAll(".","\"\"");

      int sonucSayisiSon= Integer.parseInt(sonucSayisi);
        if (sonucSayisiSon > 10000000) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        //   8- Sayfayi kapatin
        driver.close();


    }
}