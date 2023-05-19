package TekrarCalismasi;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_syf29 {
    public static void main(String[] args) {


        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    //  2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com.tr");
    //  3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Başlangıçta konum : " + driver.manage().window().getPosition());
        System.out.println("Başlangıçtaki boyut: " + driver.manage().window().getSize());
    //  4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setSize(new Dimension(604,603));
        driver.manage().window().setPosition(new Point(100,100));
        System.out.println("İkinci konum : " + driver.manage().window().getPosition());
        System.out.println("İkinci boyut: " + driver.manage().window().getSize());

    //  5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        int expectedKonum=100;
        int actualKonum=driver.manage().window().getPosition().x;
        if (actualKonum==expectedKonum){
            System.out.println("Konum Testi Passed");
        }else {
            System.out.println("Konum Testi Failed");
        }
        int expectedBoyut=604;
        int actualBoyut=driver.manage().window().getSize().height;
        if (actualBoyut==expectedBoyut){
            System.out.println("Boyut Testi Passed");
        }else {
            System.out.println("Boyut Testi Failed");
        }


    //  8. Sayfayi kapatin
        driver.close();



    }
}
