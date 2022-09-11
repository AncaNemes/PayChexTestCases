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
        //Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        signIn.click();

        String userName = "anemes";
        String password = "PentruInceput22@";
        String securityQ = "ePlan";

        WebElement userNameOne = driver.findElement(By.xpath("//input[@name='username']"));
        userNameOne.sendKeys(userName);
        // driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement passwordOne = driver.findElement(By.xpath("//input[@name='password']"));
        passwordOne.sendKeys(password);

        //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        // Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement signInOne = driver.findElement(By.id("loginButton"));
        signInOne.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     //   Thread.sleep(5000);

      //  WebElement securityQOne = driver.findElement(By.xpath("//input[@name='securityAnswer']"));
      //  securityQOne.sendKeys(securityQ);
        //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement submitButton = driver.findElement(By.id("submitButton"));
        submitButton.click();




        driver.close();

    }


/*
    public static void main(String[] args) {

        String[] user = new String[]{
          "anemes",
          "anemes",
          "anemes",

        };

        for(String user: users){
            //new user sign up
            driver.findElement(By.id("email")).sendKeys(email);
            driver.findElement(By.id("password")).sendKeys("123456");
            driver.findElement(By.id("submit")).click();
//new user like
            driver.findElement(By.id("like")).click();
//new user log out
            driver.findElement(By.id("logout")).click();
        }
    }



A user provides the correct username/password combination
and is logged into their 401k account.
 */

}
