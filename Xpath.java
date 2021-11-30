package SeleniumRegisterPge;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Xpath {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //navigate to URL
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        //navigate to register icon
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.xpath("//label[@ for='gender']"));
        driver.findElement(By.xpath("//input[@value='F']")).click();

        //navigate to firstname and lastname
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).sendKeys("Manisha");
        driver.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys("Patel");

        //select date of Birth
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        Select sDate = new Select(driver.findElement(By.xpath("//*[@name='DateOfBirthDay']")));
        sDate.selectByVisibleText("13");

        Select sMonth = new Select(driver.findElement(By.xpath("//*[@name='DateOfBirthMonth']")));
        sMonth.selectByVisibleText("November");

        Select sYear = new Select(driver.findElement(By.xpath("//*[@name='DateOfBirthYear']")));
        sYear.selectByVisibleText("1995");

        // valid email
        driver.findElement(By.xpath("//*[@id='Email' ]")).sendKeys("test123@gmail.com");

        // company
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("Unify Testing");

        //password
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123456");

        //Confirm password
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("123456");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        //register
        driver.findElement(By.xpath("//button[@name='register-button']")).click();

    }
}
