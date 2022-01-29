package ActionItem_4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;

public class WeightWatchers_arraylist {
    public static void main(String[] args) throws InterruptedException {
//create an arraylist to store 3 zipcodes

        ArrayList<String> zipcode = new ArrayList<>();
        zipcode.add("11434");
        zipcode.add("11208");
        zipcode.add("10012");

        //call the web driver manager
        WebDriverManager.chromedriver().setup();
        //call chromeoptions
        ChromeOptions options = new ChromeOptions();
        //set incognito and maximize the driver
        options.addArguments("start-maximized");
        //options.addArguments("incognito");
        //set my webdriver
        WebDriver driver = new ChromeDriver(options);

        for(int i=0; i<zipcode.size();i++) {

            //navigate to weightwatchers
            driver.navigate().to("https://www.weightwatchers.com");
            Thread.sleep(2500);

            //click on attend dropdown
            try {
                driver.findElement(By.xpath("//*[text()='Attend']")).click();
            } catch (Exception e) {
                System.out.println("unable to click on attend" + e);
            }

            //click on unlimited dropdown
            try {
                driver.findElement(By.xpath("//*[@data-e2e-name='unlimited_workshops']")).click();
            } catch (Exception e) {
                System.out.println("unable to click on unlimited dropdown " + e);
            }
            //click on find a studio link
            try {
                driver.findElement(By.xpath("//*[text()='Studio']")).click();
            } catch (Exception e) {
                System.out.println("unable to click on Studio" + e);
            }
            //enter your zipcode
            try {
                driver.findElement(By.xpath("//*[@id='location-search']")).sendKeys(zipcode.get(i));
            } catch (Exception e) {
                System.out.println("unable to click on zipcode" + e);
            }
            //click on search arrow
            try {
                driver.findElement(By.xpath("//*[@class='rightArrow-daPRP']")).click();
            } catch (Exception e) {
                System.out.println("unable to click on search" + e);
            }
            Thread.sleep(2000);

            //click on the specific link for studios
            try {
                List<WebElement> myList = driver.findElements(By.xpath("//*[@class='container-3SE46']"));
                //use if condition
                if (i == 0) {
                    myList.get(1).click();
                }
                if (i == 1) {
                    myList.get(2).click();
                }
                if (i == 2) {
                    myList.get(0).click();
                }


            } catch (Exception e) {
                System.out.println("unable to click on specific link for studios" + e);
            }

            //capture the entire address on a variable and print out the address

            try {
                String result = driver.findElement(By.xpath("//*[@class='address-2PZwW']")).getText();

                System.out.println(result);

            } catch (Exception e) {
                System.out.println("unable to print entire address on a variable" + e);
            }


            Thread.sleep(2000);

            //scroll to the bottom using JavascriptExecutor
            try {
                JavascriptExecutor jse = (JavascriptExecutor) driver;

                WebElement studioHoursText = driver.findElement(By.xpath("//*[@class='scheduleContainerMobile-1RfmF']"));

                jse.executeScript("arguments[0].scrollIntoView(true);", studioHoursText);
                    Thread.sleep(1500);

                //capture the entire table with days and hours for studio

            } catch (Exception e) {
                System.out.println("unable to capture the entire table with days and hours" + e);
            }

                Thread.sleep(2000);
            //capture the entire table with days and hours for studio
            try {
                String schedule = driver.findElement(By.xpath("//*[contains(@class,'scheduleContainer')]")).getText();

                System.out.println(schedule);

            } catch (Exception e){
                System.out.println(" cek" + e);
            }










        }//end of for loop

    }//end of main method


}//end of java class
