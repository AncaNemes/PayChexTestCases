package automationExercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;

public class TestTwo {

    public TestTwo() throws AWTException {
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


        WebElement signIn = driver.findElement(By.xpath("//a[.=' Sign In ']"));
        signIn.click();


        String userOne = "anemes";
        String passwordOne = "passwordFirstAttempt";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
        user.sendKeys(userOne);
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(passwordOne);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(By.id("loginButton")).click();

        // driver.findElement(By.xpath("//input[@name='username']")).sendKeys("userOne");
        // driver.findElement(By.xpath("//input[@name='password']")).sendKeys("passwordOne");

        user.click();
        user.clear();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        password.click();
        password.clear();
//Thread.sleep(5000);
        WebElement userT = driver.findElement(By.xpath("//input[@name='username']"));
        userT.sendKeys(userOne);
        WebElement passwordT = driver.findElement(By.xpath("//input[@name='password']"));
        passwordT.sendKeys(passwordOne);

        userT.click();
        userT.clear();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        passwordT.click();
        passwordT.clear();
//Thread.sleep(5000);

        WebElement userTh = driver.findElement(By.xpath("//input[@name='username']"));
        userT.sendKeys(userOne);
        WebElement passwordTh = driver.findElement(By.xpath("//input[@name='password']"));
        passwordT.sendKeys(passwordOne);

        userTh.click();
        userTh.clear();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        passwordTh.click();
        passwordTh.clear();
//Thread.sleep(5000);
        WebElement accountIsLocked = driver.findElement(By.xpath("//span[.=\'Account is locked due to too many failed attempts.\']"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        System.out.println("accountIsLocked = " + accountIsLocked.getText());

        driver.close();

       /* String expectedURL= driver.getCurrentUrl();
        Assert.assertEquals(expectedURL,actualURL);



        System.out.println(driver.findElement(By.xpath("//span[@class='login-error ng-binding']")).getText());
*/


    }
}
