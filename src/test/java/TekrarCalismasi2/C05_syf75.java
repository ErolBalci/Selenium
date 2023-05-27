package TekrarCalismasi2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_syf75 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

      //   1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");
      //   2. Signin buttonuna tiklayin
        driver.findElement(By.xpath("// button[@ id='signin_button']")).click();
      //   3. Login alanine “username” yazdirin
        WebElement loginElementi= driver.findElement(By.id("user_login"));
        loginElementi.sendKeys("username");
      //   4. Password alanina “password” yazdirin
        WebElement passwordElementi= driver.findElement(By.id("user_password"));
        passwordElementi.sendKeys("password");
      //   5. Sign in buttonuna tiklayin
        driver.findElement(By.xpath("// input[@ type='submit']")).click();
      //   6. Back tusu ile sayfaya donun
        driver.navigate().back();
      //   7. Online Banking menusunden Pay Bills sayfasina gidin
        driver.findElement(By.id("onlineBankingMenu")).click();
        driver.findElement(By.id("pay_bills_link")).click();
      //   8. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        WebElement amount = driver.findElement(By.id("sp_amount"));
        amount.sendKeys("25");
      //   9. tarih kismina “2020-09-10” yazdirin
        WebElement tarih = driver.findElement(By.id("sp_date"));
        tarih.sendKeys("2020-09-10");
      //   10. Pay buttonuna tiklayin
        driver.findElement(By.id("pay_saved_payees")).click();
      //   11. “The payment was successfully submitted.” mesajinin
      //   ciktigini test edin
        WebElement sonuçYazisiElementi=driver.findElement(By.id("alert_content"));
        String expectedIcerik="The payment was successfully submitted.";
        String actualYazi=sonuçYazisiElementi.getText();
        if (actualYazi.contains(expectedIcerik)){
            System.out.println("Sonuş Yazısı Elementi Testi Passed");
        }else {
            System.out.println("Sonuş Yazısı Elementi Testi Failed");
        }

        driver.close();


    }
}
