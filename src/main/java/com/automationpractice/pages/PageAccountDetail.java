package com.automationpractice.pages;

import com.automationpractice.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PageAccountDetail extends TestBase {

    @FindBy(xpath = "//A[@title='Information']")
    WebElement btnMyPersonalInformation;

    @FindBy(id = "lastname")
    WebElement txtLastName;

    @FindBy(id = "old_passwd")
    WebElement txtCurrentPassword;

    @FindBy(name = "submitIdentity")
    WebElement btnSave;

    @FindBy(xpath = "//P[contains(text(),\"Your personal information has been successfully updated.\")]")
    WebElement lblSuccessResultText;

    public PageAccountDetail() {
        PageFactory.initElements(getDriver(), this);
    }

    public void changeLastNameAndSave(String newLastName, String currentPassword) {
        btnMyPersonalInformation.click();

        txtLastName.clear();
        txtLastName.sendKeys(newLastName);

        txtCurrentPassword.sendKeys(currentPassword);

        btnSave.click();

        //display-none yapınca ekranda görünmediği için patlıyor.
        Assert.assertTrue(lblSuccessResultText.isDisplayed(), "Başarı Mesajı Ekranda Görüntülenemedi.");

        getCommon().takeScreenshot();
    }


}
