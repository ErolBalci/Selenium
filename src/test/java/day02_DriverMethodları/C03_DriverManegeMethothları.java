package day02_DriverMethodları;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_DriverManegeMethothları {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // websayfası açılıncaya yada aradığımız elementler bulununcaya kadar driverin bekleyeceği max süreyi belirler.
        driver.get("https://www.amazon.com.tr");

        System.out.println("Baş. konum"+ driver.manage().window().getPosition());
        System.out.println("Baş. Boyut "+ driver.manage().window().getSize());
        Thread.sleep(1000);

        driver.manage().window().maximize();
        System.out.println("Max. konum"+ driver.manage().window().getPosition());
        System.out.println("Max. Boyut "+ driver.manage().window().getSize());
        Thread.sleep(1000);

        driver.manage().window().fullscreen();
        System.out.println("Full. konum"+ driver.manage().window().getPosition());
        System.out.println("Fullscreen. Boyut "+ driver.manage().window().getSize());
        Thread.sleep(1000);

        driver.manage().window().minimize();
        System.out.println("Min. konum"+ driver.manage().window().getPosition());
        System.out.println("Min. Boyut "+ driver.manage().window().getSize());
        Thread.sleep(1000);

        driver.manage().window().setPosition(new Point(50,50));
        driver.manage().window().setSize(new Dimension(500,500));
        System.out.println("İstediğimiz konum"+ driver.manage().window().getPosition());
        System.out.println("İstediğimiz Boyut "+ driver.manage().window().getSize());
        Thread.sleep(2000);





        driver.close();


    }
}
