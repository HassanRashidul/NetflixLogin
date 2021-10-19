import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class NetflixLogin {
    public static WebDriver driver;
    static String BaseURL = "https://www.netflix.com/bd/";
    static JavascriptExecutor js;

    @BeforeTest
    public static void WebSetup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BaseURL);
        Thread.sleep(3000);
    }

    @Test(priority = 1)
    public static void UserLogin() throws InterruptedException {
        driver.findElement(By.xpath("//*[@class='authLinks redButton']")).click();
        Thread.sleep(3000);
    }
}