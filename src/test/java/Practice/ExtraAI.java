package Practice;

import Day8_122621.ArrayList_examples;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class ExtraAI {
    public static void main(String[] args) throws InterruptedException {

        //create an array list Integer - zipcode, milesRange
        ArrayList<Integer> zipcode = new ArrayList<>();
        zipcode.add(11208);
        zipcode.add(11201);
        zipcode.add(11218);

        //call the webdriver manager
        ChromeDriverManager.chromedriver().setup();
        //add argument for chrome driver
        ChromeOptions options = new ChromeOptions();
        //set incognito and maximize the driver
        options.addArguments("incognito", "start-maximized");
        //set my webdriver
        WebDriver driver = new ChromeDriver(options);

        //navigate to "www.aetna.com"
        driver.navigate().to("https://www.aetna.com");

        //verify homepage title "health insurance plans"
        driver.getTitle();
        if (driver.getTitle().contains("Health Insurance Plans | Aetna")){
            System.out.println("The title is correct");
        }
        else {
            System.out.println("The title is not correct");
        }

        Thread.sleep(2000);
        //click on shop for plan
        try {
            driver.findElement(By.xpath("//*[text()='Shop for a plan']")).click();
        }
        catch (Exception e) {
            System.out.println("Unable to click on shop for plan" + e);
        }

        //click on medicare link
        try {
            driver.findElement(By.xpath("//*[text()='Medicare']")).click();
        }
        catch (Exception e) {
            System.out.println("unable to click on medicare link" + e);
        }

        Thread.sleep(2000);
        //find a doctor
        //whenevr you use contain put coma after text not =
        try {
            driver.findElement(By.xpath("//*[contains(text(),'Find a doctor')]")).click();
        }
        catch (Exception e) {
            System.out.println("unable to click on find a doctor" + e);
        }
        Thread.sleep(4000);

        //on guest section click on 2021 Medicare plans you purchase yourself
        try {
            driver.findElement(By.xpath("//*[@class='primaryPurple BtnWidth mgbutton w400']")).click();
        }
        catch (Exception e) {
            System.out.println("unable to click on 2021 medicare plans" + e);
        }

        //clear and enter a zipcode(this is where you pass zipCode variable)
        try {
            driver.findElement(By.xpath("//*[@type='text']")).sendKeys("11208");
        }
        catch (Exception e) {
            System.out.println("umable to enter zipcode" + e);
        }
        //wait few seconds then zipcode drop down suggestion will appear and then click on the appropriate matching
        // zipcode link
        Thread.sleep(2500);
        try {
            driver.findElement(By.xpath("//*[@class='typeahead_grouping active']")).click();
        }
        catch (Exception e) {
            System.out.println("unable to click on zipcode drop down" + e);
        }
        //automate range slider







    }//end of main method


}//end of java class
