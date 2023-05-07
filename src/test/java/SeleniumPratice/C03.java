package SeleniumPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03 {
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
        // 5 Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        //6 Click on  Calculater under Micro Apps
        driver.findElement(By.id("calculatetest")).click();
        Thread.sleep(3000);
        //7 Type any number in the first input
        driver.findElement(By.id("number1")).sendKeys("24");
        Thread.sleep(2000);
        //8 Type any number in the second input
        driver.findElement(By.id("number2")).sendKeys("36");
        //9 Click on Calculate
        driver.findElement(By.id("calculate")).click();
        Thread.sleep(2000);
        //10 Get the result
      WebElement sonuç= driver.findElement(By.xpath("//*[@id=\"answer\"]"));
        //11 Print the result
        String result =driver.findElement(By.xpath("//*[@id=\"answer\"]")).getText();
        System.out.println(result);
        driver.close();


    }
}
