package day02_DriverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverGetMethodları {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.get("https://wisequarter.com");

        System.out.println(driver.getTitle()); // web sayfasının titlesini döndürür.
        System.out.println(driver.getCurrentUrl());//web sayfasının urlini döndürür.
        //System.out.println(driver.getPageSource());//web sayfasının kaynak kodlarını döndürür.
        System.out.println(driver.getWindowHandle());
        System.out.println(driver.getWindowHandles());
        // Eğer çalışırken birden fazla pencere açarsa açılan tümpencerelerin unique
        //hash codlarını bir set olarak bize döndürür.

        Thread.sleep(3000);
        driver.close();



    }
}
