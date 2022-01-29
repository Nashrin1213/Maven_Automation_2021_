package ActionItem_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebdriverWithJava_bing {
    public static void main(String[] args) throws InterruptedException {

        //search for multiple sports and each time capture the search number from the result page

        //set an array
        String[] sports = new String[6];
        sports[0] = "Soccer";
        sports[1] = "Swimming";
        sports[2] = "Badminton";
        sports[3] = "Cricket";
        sports[4] = "Football";
        sports[5] = "Tennis";

        //define the webdriver outside of the for loop
        //set the property of the chromedriver we are using
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        //define the web driver you are using
        WebDriver driver = new ChromeDriver();

        for (int i = 0; i < sports.length; i++) {
            //simply open the bing web site
            driver.navigate().to("https://www.bing.com");

            //maximize my browser
            //driver.manage().window().fullscreen(); //for mac
            driver.manage().window().maximize(); //for windows

            //anytime when you go to a new page you should put some wait statement
            Thread.sleep(2000);

            //searching for sports on bing search field
            driver.findElement(By.xpath("//*[@class='sb_form_q']")).sendKeys(sports[i]);

            //hit submit on bing search button
            driver.findElement(By.xpath("//*[@id='sb_form_go']")).submit();

            //another wait statement since we came to a new page(result page)
            Thread.sleep(3000);

            //capture the search result and store it as a variable
            String result = driver.findElement(By.xpath("//*[@class='sb_count']")).getText();
            //declaring the array variable to split the result
            String[] arrayResult = result.split(" ");
            //now print the search number only
            System.out.println("My search number for city " + sports[i] + " is " + arrayResult[0]);

        }//end of the for loop

//quit will be defined outside of loop because you are quitting only once at the end
        driver.quit();

    }//end of main method


}//end of java class










