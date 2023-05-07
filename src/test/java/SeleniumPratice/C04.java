package SeleniumPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04 {
    public static void main(String[] args) throws InterruptedException {

        // Exercise3...
        //1-Java class'imiza chnomedriver. exetyi tanitalim
        System.setProperty("webdriver. chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
        //2-Driver oluşturalim
        WebDriver driver =new ChromeDriver();
        //3-Driver'in tum ekranı kaplamasini sagu ayalim
        driver.manage().window().maximize();
        //4-Driverla sayfanın yuklenmesini  beklesini söyleyelim.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         //5- Navigate to website https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");
         // Under the ORIGINAL CONTENTS
        // click on Alerts
        driver.findElement(By.id("alerts")).click();
         // print the URL
        System.out.println(driver.getCurrentUrl());
        // navigate back
        driver.navigate().back();
         // print the URL
        System.out.println(driver.getCurrentUrl());
        // Click on Basic Ajax
        driver.findElement(By.id("basicajax")).click();
        Thread.sleep(2000);
         // print the URL
        System.out.println(driver.getCurrentUrl());
        // enter value 20 and ENTER
        driver.findElement(By.id("lteq30")).sendKeys("20" + Keys.ENTER);
         // and then verify Submitted Values is displayed open page
     String expected="Submitted Values";
     String actualResult= driver.findElement(By.xpath("//*[text()='Submitted Values']")).getText();
        if (expected.equals(actualResult)){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
        }

         // close driver
        driver.close();







    }
}
