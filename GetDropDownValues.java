package SeleniumRegisterPge;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class GetDropDownValues {
    public static void main(String[]args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.className("ico-register")).click();

        Thread.sleep(3000);
        WebElement day = driver.findElement(By.name("DateOfBirthDay"));
        WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement year = driver.findElement(By.name("DateOfBirthYear"));

        Select select = new Select(day);
        List<WebElement> dayList = select.getOptions();


        for( int i=0; i< dayList.size(); i++){
            String value = dayList.get(i).getText();
            System.out.println(value);
        }

        Select select1 = new Select( month);
        List<WebElement> monthList = select1.getOptions();

        for (int j= 0; j< monthList.size(); j++){
            String value1 = monthList.get(j).getText();
            System.out.println(value1);
        }

        Select select2 = new Select( year);
        List<WebElement> yearList = select2.getOptions();

        for(int k=0; k< yearList.size(); k++){
            String value2 =yearList.get(k).getText();
            System.out.println( value2);
        }
    }

}
