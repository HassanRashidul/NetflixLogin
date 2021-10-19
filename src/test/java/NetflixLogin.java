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
    public static void WebSetup() throws Exception {
        MyScreenRecorder.startRecording("");
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BaseURL);
        Thread.sleep(3000);
        MyScreenRecorder.stopRecording();
    }

    @Test(priority = 0)
    public static void TestCase01() throws Exception {
        MyScreenRecorder.startRecording("");
        driver.findElement(By.xpath("//*[@class='authLinks redButton']")).click();
        Thread.sleep(3000);
        MyScreenRecorder.stopRecording();
    }

    @Test(priority = 1)
    public static void TestCase02() throws Exception {
        MyScreenRecorder.startRecording("");
        driver.findElement(By.xpath("//input[@id='id_userLoginId']")).sendKeys("jueal12@gmail.com");
        driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("ABCabc@12");
        driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='id_userLoginId']")).clear();
        driver.findElement(By.xpath("//input[@id='id_password']")).clear();
        MyScreenRecorder.stopRecording();
    }

    @Test(priority = 2)
    public static void TestCase03() throws Exception {
        MyScreenRecorder.startRecording("");
        driver.findElement(By.xpath("//input[@id='id_userLoginId']")).sendKeys("rashidul.h.hassan@gmail.com");
        driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("ABCabc@12");
        driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
        MyScreenRecorder.stopRecording();
    }

    @Test(priority = 3)
    public static void TestCase04() throws Exception {
        MyScreenRecorder.startRecording("");

        driver.findElement(By.xpath("//input[@id='id_userLoginId']")).sendKeys("01701040102");
        driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("ABCabc@12");
        driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='id_userLoginId']")).clear();
        driver.findElement(By.xpath("//input[@id='id_password']")).clear();
        MyScreenRecorder.stopRecording();
    }

    @Test(priority = 4)
    public static void TestCase05() throws Exception {
        MyScreenRecorder.startRecording("");
        driver.findElement(By.xpath("//input[@id='id_userLoginId']")).sendKeys("01404047804");
        driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("ABCabc@12");
        driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
        MyScreenRecorder.stopRecording();
    }

    @Test(priority = 5)
    public static void TestCase06() throws Exception {
        MyScreenRecorder.startRecording("");
        driver.findElement(By.xpath("//input[@id='id_userLoginId']")).sendKeys("01404047804");
        driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("ABCabc");
        driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
        Thread.sleep(3000);
        MyScreenRecorder.stopRecording();

    }

    @Test(priority = 6)
    public static void TestCase07() throws Exception {
        MyScreenRecorder.startRecording("");
        driver.get("https://www.netflix.com/bd/login");
        driver.findElement(By.xpath("//span[contains(text(),'Login with Facebook')]")).click();
        MyScreenRecorder.stopRecording();
    }
    @AfterTest
    public static void TestClosure(){

        driver.quit();
    }
}