package automationExercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestThree {

    /*
    To unlock a locked user account, users need to answer a security question/answer challenge.
    The security question and answer are established when the account is first created.
    We have done the account setup already including selecting the security answer/question.
     To use the Self-service password reset flow, click the “Having Trouble Logging In” link,
     and choose Reset My Password on the next screen.
      If the user answers the security question correctly, the account will be unlocked and the
      user will receive a new password via email.


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
        Thread.sleep(4000);
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement havingTrouble = driver.findElement(By.xpath("//a[.='Having trouble signing in?']"));
        havingTrouble.click();


       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement resetPasswordButton = driver.findElement(By.id("resetPasswordButton"));
        resetPasswordButton.click();

        Thread.sleep(4000);
      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String userName = "anemes";
        WebElement provideUserName = driver.findElement(By.xpath("//input[@ng-model='user.name']"));
        provideUserName.sendKeys(userName);

        WebElement continueButton = driver.findElement(By.id("continueButton"));
        continueButton.click();

        String answerSecQuestion = "ePlan";
        WebElement questionSecurity = driver.findElement(By.xpath("//input[@class='input username-input help-input ng-pristine ng-untouched ng-valid ng-empty']"));
        questionSecurity.sendKeys(answerSecQuestion);


        WebElement finishButton = driver.findElement(By.id("finishButton"));
        finishButton.click();

        WebElement confirmationMessage = driver.findElement(By.xpath("//div[@class='txt reset-success-txt']"));

        System.out.println("confirmationMessage = Succesfully reset password" + confirmationMessage);
        driver.close();
    }
}