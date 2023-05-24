package TekrarCalismasi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C10_syf49 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       //  1- https://www.amazon.com/ sayfasına gidin.
        driver.get("https://www.amazon.com");
       //  2- Arama kutusuna “city bike” yazip aratin
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);
       //  3- Görüntülenen sonuçların sayısını yazdırın
       WebElement sonucElementi= driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]"));
        System.out.println(sonucElementi.getText());

        //  4- Listeden ilk urunun resmine tıklayın.
        driver.findElement(By.xpath("(// img[@class='s-image'])[1]")).click();


        driver.close();

    }
}
