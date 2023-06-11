package TekrarCalismasi2;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class C07_syf77 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Actions actions =new Actions(driver);


    //  1. “https://www.saucedemo.com” Adresine gidin
        driver.get("https://www.saucedemo.com");
    //  2. Username kutusuna “standard_user” yazdirin
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
    //  3. Password kutusuna “secret_sauce” yazdirin
    //  4. Login tusuna basin
        actions.sendKeys(Keys.TAB)
                .sendKeys("secret_sauce")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();
    //  5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        WebElement ilkUrun = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        ilkUrun.click();
    //  6. Add to Cart butonuna basin
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
    //  7. Alisveris sepetine tiklayin
        driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
    //  8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        String expectedYazi="Sauce Labs Backpack";
        String actualYazi= driver.findElement(By.xpath("//div[@class='inventory_item_name']")).getText();

        if (actualYazi.contains(expectedYazi)){
            System.out.println("Test Passed");

        }else {
            System.out.println("Test Failed");
        }

    //  9. Sayfayi kapatin
        driver.close();









    }
}
