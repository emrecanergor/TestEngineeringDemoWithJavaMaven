package com.automationpractice.base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;

public class Common extends  TestBase{

    public void menuSec(String menuAdi) {
        WebElement btnMenu = getDriver().findElement(By.xpath("//DIV[@id='block_top_menu']//A[@title='" + menuAdi + "']"));
        btnMenu.click();
    }

    public void checkElement(WebElement element) {
        Boolean isTermsChecked = Boolean.parseBoolean(element.getAttribute("checked"));

        System.out.println("İlk durum: " + isTermsChecked);
        if (!isTermsChecked) {
            element.click();
        }

        isTermsChecked = Boolean.parseBoolean(element.getAttribute("checked"));

        System.out.println("İkinci durum: " + isTermsChecked);
    }

    public void takeScreenshot(){
        try {
            File screenShot = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);

            new File("C:\\screenShots\\").mkdirs(); //create if not exist all folder path.

            File destinationFile = new File("C:\\screenShots\\firstScreenShot.png");

            FileUtils.copyFile(screenShot, destinationFile);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
