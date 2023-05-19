package TekrarCalismasi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_syf25 {
    public static void main(String[] args) {


    //   2. Youtube ana sayfasina gidelim . https://www.youtube.com/
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com");
    //   3. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
    //   4. Tekrar YouTube’sayfasina donelim
        driver.navigate().back();
    //   5. Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();
    //   6. Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();
    //   7. Sayfayi kapatalim / Tum sayfalari kapatalim
        driver.close();





    }
}
