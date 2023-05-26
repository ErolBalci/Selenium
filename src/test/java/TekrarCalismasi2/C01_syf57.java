package TekrarCalismasi2;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_syf57 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      //  1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
      //  2- Add Element butonuna basin
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
      //  3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu= driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
        if (deleteButonu.isDisplayed()){
            System.out.println("Delete butonu görünüyor Test Passed");
        }else {
            System.out.println("Delete butonu görünmüyor Test Failed");
        }
      //  4- Delete tusuna basin
        deleteButonu.click();
      //  5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElementsButonu=driver.findElement(By.xpath("//h3"));
        if (addRemoveElementsButonu.isDisplayed()){
            System.out.println("addRemoveElements yazısı görünüyor Test Passed");
        }else {
            System.out.println("addRemoveElements yazısı görünmüyor Test Failed");
        }
        driver.close();

    }
}
