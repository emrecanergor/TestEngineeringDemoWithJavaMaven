package com.automationpractice;

import com.automationpractice.base.TestBase;
import com.automationpractice.pages.PageAccountDetail;
import com.automationpractice.pages.PageCheckout;
import com.automationpractice.pages.PageLogin;
import com.automationpractice.pages.PageProducts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FirstTestRefactored extends TestBase { //Common ile testbase'e bağlanabiliriz


    @Test
    public void test2() {
        driver.get("https://google.com.tr/");
    }

//    @Test
//    public void test3(){
//        System.out.println("test3");
//    }

    @Test
    public void test() {

        driver.get("http://automationpractice.com/");

        String password = "Avis3101";
        String email = "recep.duman@yahoo.com";

        PageLogin pageLogin = new PageLogin();
        pageLogin.login(email, password);

//        pageLogin
//                .clickBtnSignIn()
//                .setTxtEmail(email)
//                .setTxtPassword(password)
//                .clickBtnSubmit();

        PageAccountDetail pageAccountDetail = new PageAccountDetail();
        pageAccountDetail.changeLastNameAndSave("Mehmet", password);

        //WebDriverWait shortWait = new WebDriverWait(driver,5);
        //shortWait.until(ExpectedConditions.elementToBeClickable(btnSave));

        getCommon().menuSec("Women");

        PageProducts pageProducts = new PageProducts();
        pageProducts.selectFirstProductAndAddToCart();

        PageCheckout pageCheckout = new PageCheckout();
        pageCheckout.completeCheckout();

        //System.out.println("test Hello");

        //throw new RuntimeException("process is failed!");

    }

    @Test
    public void dropdownTest() {

        goToUrl("https://the-internet.herokuapp.com/dropdown");

        WebElement inpDropdown = driver.findElement(By.id("dropdown"));

        Select selectDropdown = new Select(inpDropdown);
        selectDropdown.selectByVisibleText("Option 2");
        selectDropdown.selectByValue("1");

        List<WebElement> selectOptions = selectDropdown.getOptions();

        for (int i = 0; i < selectOptions.size(); i++) {
            String optionText = selectOptions.get(i).getText();
            String optionValue = selectOptions.get(i).getAttribute("value");

            System.out.println(optionText);
            System.out.println(optionValue);
        }


    }

    @AfterMethod
    public void afterMethod() {
        //driver.quit();
    }
}
