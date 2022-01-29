package ActionItem_5;

import Day9_010822.Reusable_Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Hulu_ReusableMethod {

    //precondition - set the Web driver
    WebDriver  driver;

    @BeforeSuite
    public void SetTheDriver() { driver= Reusable_Actions.setDriver();
    }//end of pre-condition

    @Test (priority = 1)
    public void SignUpHuluLoop() throws InterruptedException {
        ArrayList<String> email = new ArrayList<>();
        email.add("fallqaclass21@gmail.com");
        email.add("signupforhulu33@gmail.com");

        ArrayList<String> password = new ArrayList<>();
        password.add("Automation01");
        password.add("Qaclass01");

        ArrayList<String> name = new ArrayList<>();
        name.add("Nashrin Soltana");
        name.add("Nashrin Malek");

        ArrayList<String> birthMonth = new ArrayList<>();
        birthMonth.add("December");
        birthMonth.add("February");

        ArrayList<String> birthDate = new ArrayList<>();
        birthDate.add("13");
        birthDate.add("23");

        ArrayList<String> birthYear = new ArrayList<>();
        birthYear.add("1995");
        birthYear.add("1990");

        ArrayList<String> gender = new ArrayList<>();
        gender.add("female");
        gender.add("male");

        //set for loop
        for(int i = 0; i < email.size(); i++){
            //navigate to Hulu
            driver.navigate().to("https://hulu.com");
            driver.manage().window().fullscreen();


            //verify we are on following page title contains "Stream TV and Movies"
            driver.getTitle();
            if (driver.getTitle().contains("Stream TV and Movies Live and Online | Hulu")){
                System.out.println("The title is correct");
            }
            else {
                System.out.println("The title is not correct");
            }

            //Scroll to the bottom of the page; use JavascriptExecutor with pixels
            Reusable_Actions.scrollMethod(driver, "0","3300", "scroll");

            //under most popular 30 days free trail click select button
            Reusable_Actions.clickMethod(driver,"//*[@aria-label='Get Hulu plan']", "Select");

            //Enter email - email arraylist value goes here
            Reusable_Actions.sendKeysMethod(driver,"//*[@id='email']",email.get(i), "Email" );

            //Enter password
            Reusable_Actions.sendKeysMethod(driver, "//*[@id='password']",password.get(i), "Password");

            //Enter Name
            Reusable_Actions.sendKeysMethod(driver, "//*[@id='firstName']",name.get(i), "Name");

            //Select value from birth month- birthMonth arraylist
            Reusable_Actions.clickMethod(driver,"//*[text()='Month']", "Month");
            Reusable_Actions.SelectMethod(driver,"//*[@id='birthdayMonth-menu']", birthMonth.get(i),"Month");

            //Select value from birthDay
            Reusable_Actions.clickMethod(driver,"//*[text()='Day']", "Day");
            Reusable_Actions.SelectMethod(driver,"//*[@id='birthdayDay-menu']", birthDate.get(i), "Date");

            //Select value from birthYear
            Reusable_Actions.clickMethod(driver, "//*[text()='Year']", "Year");
            Reusable_Actions.SelectMethod(driver, "//*[@id='birthdayYear-menu']", birthYear.get(i), "Year");

            //Select value from gender
            Reusable_Actions.clickMethod(driver, "//*[text()='Select']", "Gender");
            Reusable_Actions.SelectMethod(driver, "//*[@id='gender-menu']", gender.get(i), "Gender");

            //Thread.sleep(2000);
            //Click on 'continue' button
            Reusable_Actions.submitMethod(driver,"//*[text()='CONTINUE']", "Continue");
            //Reusable_Actions.clickMethod(driver, "//*[@class='button button--continue ']", "Continue");
            //Reusable_Actions.clickMethod(driver, "//*[contains(@class,'button button--continue')]", "Continue");

            //Capture your subscription amount and store it in a variable and print the amount
            //String resultValue = Reusable_Actions.getTextMethod(driver, ""







            //Delete all cookies
            driver.manage().deleteAllCookies();
        }//


        }//end of test


}//end of java class
