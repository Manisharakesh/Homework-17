package SeleniumRegisterPge;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.findElement(By.className("ico-register")).click();

        Thread.sleep(3000);
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("gender-female")).click();

        Thread.sleep(2000);
        driver.findElement(By.id("FirstName")).sendKeys("Manisha");
        driver.findElement(By.id("LastName")).sendKeys("Patel");


        Thread.sleep(3000);
        WebElement day = driver.findElement(By.name("DateOfBirthDay"));
       WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement year = driver.findElement(By.name("DateOfBirthYear"));
      //  day.sendKeys("13");
      //  month.sendKeys("March");
       // year.sendKeys("2000");

        Select select = new Select(day);
        select.selectByVisibleText("13");
       // select.selectByIndex(12);

        Select select1 =new Select(month);
        select1.selectByVisibleText("March");

        Select select2 =new Select(year);
        select2.selectByVisibleText("2000");





        Thread.sleep(3000);
        driver.findElement(By.id("Email")).sendKeys("nisha.patel16@gmail.com");
        driver.findElement(By.id("Company")).sendKeys("UnifyTesting");

        Thread.sleep(2000);
        driver.findElement(By.id("Newsletter")).click();

        driver.findElement(By.id("Password")).sendKeys("123456");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");

        driver.findElement(By.id("register-button")).click();


    }
}
