package ActionItem_5;

import Day9_010822.Reusable_Actions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class HULU_2 {

    WebDriver driver;
    @BeforeSuite
    public void SetTheDriver() { driver =  Reusable_Actions.setDriver();
    }//end of precondition

    @Test(priority = 1)
    public void huluSearchLoop() {
        ArrayList<String> email = new ArrayList<>();
        email.add("nashdldbdf028@gmail.com");
        email.add("dkdmknnkd109@gmail.com");

        ArrayList<String> pass = new ArrayList<>();
        pass.add("Soltana19");
        pass.add("Malek12344");

        ArrayList<String> name = new ArrayList<>();
        name.add("Nashrin Soltana");
        name.add("Nashrin Malek");

        ArrayList<String> month = new ArrayList<>();
        month.add("June");
        month.add("July");

        ArrayList<String> day = new ArrayList<>();
        day.add("13");
        day.add("24");

        ArrayList<String> year = new ArrayList<>();
        year.add("1990");
        year.add("2000");

        ArrayList<String> gender = new ArrayList<>();
        gender.add("male");
        gender.add("female");

        for (int i = 0; i < email.size(); i++) {


            //navigating to hulu
            driver.navigate().to("https://www.hulu.com");


            //verify we are on following page title contains "Stream TV and Movies"
            String actualTitle = driver.getTitle();

            //by using if else to compare expected with actual title
            if (actualTitle.equals("Stream TV and Movies Live and Online | Hulu")) {
                System.out.println("Title matches " + actualTitle);
            } else {
                System.out.println("Title doesn't match. Actual title is " + actualTitle);
            }

            //Scroll to the bottom of the page; use JavascriptExecutor with pixels
            Reusable_Actions.scrollMethod(driver, "0", "3500", "scroll");

            //under most popular 30 days free trail click select button
            Reusable_Actions.clickMethod(driver, "//*[@aria-label= 'Get Hulu plan']", "click on Select button");

            //Enter email - email arraylist value goes here
            Reusable_Actions.sendKeysMethod(driver, "//*[@id= 'email']", email.get(i), "Email");

            //Enter password
            Reusable_Actions.sendKeysMethod(driver, "//*[@id= 'password']", pass.get(i), "Password");

            //Enter Name
            Reusable_Actions.sendKeysMethod(driver, "//*[@id= 'firstName']", name.get(i), "Name");

            //select value from birth month
            Reusable_Actions.clickMethod(driver, "//*[@class = 'selector-selected input__text placeholder']", "Birthmonth");
            Reusable_Actions.SelectMethod(driver, "//*[@id = 'birthdayMonth-menu']", month.get(i), "Birthmonth");
            //select value from birthday
            Reusable_Actions.clickMethod(driver, "//*[@class= 'selector-selected input__text placeholder']", "Birthday");
            Reusable_Actions.SelectMethod(driver, "//*[@id= 'birthdayDay-menu']", day.get(i), "Birthday");

            //select value from birth year
            Reusable_Actions.clickMethod(driver, "//*[@class= 'selector-selected input__text placeholder']", "Birthdayyear");
            Reusable_Actions.SelectMethod(driver, "//*[@id = 'birthdayYear-menu']", year.get(i), "Birthdayyear");

            //select value from gender
            Reusable_Actions.clickMethod(driver, "//*[@class= 'selector-selected input__text placeholder']", "Gender");
            Reusable_Actions.SelectMethod(driver, "//*[@id ='gender-menu']", gender.get(i), "Male");

            //click Continue
            Reusable_Actions.clickMethod(driver, "//*[@class='button button--continue ']", "Continue");

            //Capture your subscription amount and store it in a variable and print the amount
            String result = Reusable_Actions.getTextMethod(driver, "//*[@class= 'ledger__price']", "$6.99");
            System.out.println("The amount is " + result);

            String results = Reusable_Actions.getTextMethod(driver, "//*[@class= 'summary__price']", "$0.00");
            System.out.println("The amount is " + results);

            //delete cookies
            driver.manage().deleteAllCookies();
        } //end of forloop
    }//end of test1

    @Test (dependsOnMethods = "huluSearchLoop")
    public void Login()

    {
        driver.navigate().to("https://www.hulu.com");
        driver.manage().window().fullscreen();
        Reusable_Actions.clickMethod(driver, "//*[text()='Log In']", "click Login");
        Reusable_Actions.sendKeysMethod(driver, "//*[@id='email_id']", "nashdldbdf028@gmail.com", "enter Email");
        Reusable_Actions.sendKeysMethod(driver, "//*[@id='password_id']", "Soltana19", "enter Password");
        Reusable_Actions.clickMethod(driver, "//*[@class='jsx-4282396490 button-dark login-button']", "clicking on login button");
        String username = Reusable_Actions.getTextMethod(driver, "//*[text()='Nashrin Soltana']", "Nashrin Soltana");
        System.out.println("The username is " + username);
        //end of test 2
    }
    @AfterSuite
    public void endSession () {
        driver.quit();
    }

}//end of java class
