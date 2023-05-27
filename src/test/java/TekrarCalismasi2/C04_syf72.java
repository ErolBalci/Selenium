package TekrarCalismasi2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_syf72 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

      //  1- https://www.amazon.com/ sayfasina gidelim
        driver.get("https://www.amazon.com/");
      //  2- arama kutusunu locate edelim
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
      //  3- “Samsung headphones” ile arama yapalim
        aramaKutusu.sendKeys("Samsung headphones"+ Keys.ENTER);
      //  4- Bulunan sonuc sayisini yazdiralim
        driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]")).getText();
      //  5- Ilk urunu tiklayalim
        driver.findElement(By.xpath("(// img[@class='s-image'])[1]")).click();
      //  6- Sayfadaki tum basliklari yazdiralim
        System.out.println(driver.getTitle());

        driver.close();

    }
}
