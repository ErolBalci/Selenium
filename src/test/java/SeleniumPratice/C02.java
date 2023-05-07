package SeleniumPratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02 {

    public static void main(String[] args) {


      //  Exercise2...
      //1-Java class'imiza chnomedriver. exetyi tanitalim
        System.setProperty("webdriver. chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
      //2-Driver oluşturalim
        WebDriver driver =new ChromeDriver();
      //3-Driver'in tum ekranı kaplamasini sagu ayalim
        driver.manage().window().maximize();
      //4-Driverla sayfanın yuklenmesini 10.809 milisaniye (10 saniye) boyunca beklesini söyleyelim. Egen oncesinde sqyfq Yüklenirse, beklemeyi bıraksın.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      //5-"https://www.otta.de" adresine gidelim
        driver.get("https://www.otta.de");
      //6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim
        String sayfaBasligi =driver.getTitle();
        String sayfaAdresi =driver.getCurrentUrl();
        System.out.println(sayfaAdresi+"\n" +sayfaBasligi);
      //7-Title ve url inin "0TT0" kelimesinin içerip icermedigini kontrol edelim
        if (sayfaBasligi.contains("OTTO")&& sayfaAdresi.contains("OTTO")){
            System.out.println("Title ve Url OTTO içeriyor, Test PASSED ");
        }else {
            System.out.println("Title ve Url OTTO içermiyor, Test FAILED ");
        }
     //8-Ardindan "https://wisequarter.com/" adresine gidip
        driver.get("https://wisequarter.com/");
      //9-BU adresin basligini alalim ve "Quarter" kelimesini icenip icermedigini kontrol edelim
         String QuarterAdresBasligi =driver.getTitle();
         if (QuarterAdresBasligi.contains("Quarter")){
             System.out.println("QuarterTitle Quarter içeriyor Test PASSED");
         }else {
             System.out.println("QuarterTitle Quarter içermiyor Test FAILED");
         }
      //10-Bir onceki web sayfamiza geri donelim
        driver.navigate().back();
      //11-Sayfayı yenileyelim
        driver.navigate().refresh();
      //12-Daha sonra web sgyfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
        driver.navigate().back();
        driver.close();
      //13- En son adim olarak butun sayfalarimizi kapatmis olalim
        driver.quit();




    }


}
