package Practice;

import Day9_010822.Reusable_Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;

import java.util.ArrayList;

public class Edroll {
    private static Object Select;

    public static void main(String[] args) throws InterruptedException {
      //create an arraylist
        ArrayList<String> name = new ArrayList<>();
        name.add("Ariana Grande");

        ArrayList<String> mobile = new ArrayList<>();
        mobile.add("01889168205");

        ArrayList<String> email = new ArrayList<>();
        email.add("arianagrande0988@gmail.com");

        ArrayList<String> date = new ArrayList<>();
        date.add("20");

        ArrayList<String> time = new ArrayList<>();
        time.add("01:00PM");

        //call the web driver manager
        WebDriverManager.chromedriver().setup();
        //call chromeoptions
        ChromeOptions options = new ChromeOptions();
        //set incognito and maximize the driver
        options.addArguments("start-maximized");
        //options.addArguments("incognito");
        //set my webdriver
        WebDriver driver = new ChromeDriver(options);

        for (int i = 0; i < name.size(); i++) {
            //navigate to edrol.net
            driver.navigate().to("https://edroll.net");
            Thread.sleep(2500);

            //click on appointment
            driver.findElement(By.xpath("//*[@id='menu-item-2970']")).click();

            JavascriptExecutor jse = (JavascriptExecutor)driver;
            //scroll to the view by pixels
            jse.executeScript("scroll(0,2500)");

            //enter full name (email array list)
            driver.findElement(By.xpath("//*[@class='form-control']")).sendKeys(name.get(i));
            //enter mobile no.
            driver.findElement(By.xpath("//*[@placeholder='Mobile Number']")).sendKeys(mobile.get(i));
            //enter email
            driver.findElement(By.xpath("//*[@placeholder='Email Address']")).sendKeys(email.get(i));
            //select date (cant use SELECT if website doesn't have select tag)
            driver.findElement(By.xpath("//*[@placeholder='Select Date']")).sendKeys(date.get(i));
            //select time
            driver.findElement(By.xpath("//*[@class='nice-select form-control']")).click();
            driver.findElement(By.xpath("//*[@class='list']")).click();
            //driver.findElement(By.xpath("//*[text()='"+time.get(i)+"']")).click();

            //click SUBMIT now
            driver.findElement(By.xpath("//*[@value='Submit Now']")).submit();





        }//end of loop







        }//end of main method



}//end of java class
