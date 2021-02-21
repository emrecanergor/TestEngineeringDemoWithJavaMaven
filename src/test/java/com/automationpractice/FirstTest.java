package com.automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FirstTest {

    @BeforeMethod
    public void beforeMethod(){

        System.out.println("before method success");
    }

    @Test
    public void test2(){
        System.out.println("test2");
    }

    @Test
    public void test3(){
        System.out.println("test3");
    }

//    @Test
//    public void test(){
//
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//
//        //driver.manage().timeouts().implicitlyWait(40000, TimeUnit.MILLISECONDS);
//
//        driver.manage().window().maximize();
//
//        driver.get("http://automationpractice.com/");
//
//        //WebElement btnSignIn2 = driver.findElement(By.id("search_query_top"));
//        //WebElement btnSignIn3 = driver.findElement(By.xpath("//DIV[@id='search_block_top']//FORM//INPUT[@placeholder='search']"));
//
//
//        WebElement btnSignIn = driver.findElement(By.className("login"));
//        btnSignIn.click();
//
//        WebElement txtEmail = driver.findElement(By.id("email"));
//        txtEmail.clear();
//        txtEmail.sendKeys("recep.duman@yahoo.com");
//
//        WebElement txtPassword = driver.findElement(By.id("passwd"));
//        txtPassword.clear();
//        txtPassword.sendKeys("Avis3101");
//
//        WebElement btnSubmit = driver.findElement(By.id("SubmitLogin"));
//        btnSubmit.click();
//
//        WebElement lblLoggedInUserName = driver.findElement(By.className("account"));
//        System.out.println(lblLoggedInUserName.getText());
//
//        //Assert.assertEquals(lblLoggedInUserName.getText(), "Recep Mehmet");
//        //Assert.assertEquals(lblLoggedInUserName.getText(), "Recep Dumann", "Kullanıcı Adları Eşleşmiyor.");
//
//        WebElement btnMyPersonalInformation = driver.findElement(By.xpath("//A[@title='Information']"));
//        btnMyPersonalInformation.click();
//
//
//        WebElement txtLastName = driver.findElement(By.id("lastname"));
//        txtLastName.clear();
//        txtLastName.sendKeys("Mehmet");
//
//        WebElement txtCurrentPassword = driver.findElement(By.id("old_passwd"));
//        txtCurrentPassword.sendKeys("Avis3101");
//
//        WebElement btnSave = driver.findElement(By.name("submitIdentity"));
//        btnSave.click();
//
//
//        //WebDriverWait shortWait = new WebDriverWait(driver,5);
//        //shortWait.until(ExpectedConditions.elementToBeClickable(btnSave));
//
//        WebElement lblSuccessResultText = driver.findElement(By.xpath("//P[contains(text(),\"Your personal information has been successfully updated.\")]"));
//
//        //display-none yapınca ekranda görünmediği için patlıyor.
//        //Assert.assertTrue(lblSuccessResultText.isDisplayed(), "Başarı Mesahı Ekranda Görüntülenemedi.");
//
//
//        //driver.quit();
//
//
//        //System.out.println("test Hello");
//
//    //throw new RuntimeException("process is failed!");
//
//    }

    @AfterClass
    public void afterMethod(){

        System.out.println("after method success");
    }
}
