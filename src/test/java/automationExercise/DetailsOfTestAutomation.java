package automationExercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;


public class DetailsOfTestAutomation {

    @Test
    public void UseCaseOne() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://bronze.eplan-inc.com/AUDIT/marketing/");


        WebElement signIn = driver.findElement(By.xpath("//a[.=' Sign In ']"));
        Thread.sleep(1000);
        signIn.click();
        String userName = "anemes";
        String password = "V6dA$xc%$ZrADCRv";
        String securityQ = "ePlan";

        WebElement userNameOne = driver.findElement(By.xpath("//input[@name='username']"));
        userNameOne.sendKeys(userName);
        WebElement passwordOne = driver.findElement(By.xpath("//input[@name='password']"));
        passwordOne.sendKeys(password);

        WebElement signInOne = driver.findElement(By.id("loginButton"));
        signInOne.click();

        WebElement securityQOne = driver.findElement(By.xpath("//input[@name='securityAnswer']"));
        securityQOne.sendKeys(securityQ);
        Thread.sleep(5000);
        WebElement submitButton = driver.findElement(By.id("submitButton"));
        submitButton.click();


    }


/*
A user provides the correct username/password combination
and is logged into their 401k account.
 */

}
