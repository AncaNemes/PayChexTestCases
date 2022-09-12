package automationExercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;

public class TestTwoAgain {


    public TestTwoAgain() throws AWTException {
    }

    /*
    After 3 unsuccessful login attempts, the account will
    be locked and the user will be prevented from logging in,
    even if they do provide the correct password.
     */
    @Test
    public void UseCaseTwo() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://bronze.eplan-inc.com/AUDIT/marketing/");

        String[] user = new String[]{
                "anemes",
                "anemes",
                "anemes",};


        for (String users : user) {
            //new user sign up

            driver.findElement(By.xpath("//input[@name='username']")).sendKeys("use");
             driver.findElement(By.xpath("//input[@name='password']")).sendKeys("passwordOne");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.findElement(By.id("loginButton")).click();

//new user like
            driver.findElement(By.id("like")).click();
//new user log out
            driver.findElement(By.id("logout")).click();
        }


    }
}

