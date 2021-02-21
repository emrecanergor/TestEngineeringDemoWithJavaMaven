package com.automationpractice.pages;

import com.automationpractice.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLogin extends TestBase {

    @FindBy(className = "login")
    WebElement btnSignIn;

    @FindBy(id = "email")
    WebElement txtEmail;

    @FindBy(id = "passwd")
    WebElement txtPassword;

    @FindBy(id = "SubmitLogin")
    WebElement btnSubmit;

    @FindBy(className = "account")
    WebElement lblLoggedInUserName;


    public PageLogin() {
        PageFactory.initElements(getDriver(), this);
    }

    public PageLogin setTxtPassword(String txtPassw) {
        txtPassword.clear();
        txtPassword.sendKeys(txtPassw);
        return this;
    }

    public PageLogin setTxtEmail(String email) {
        txtEmail.clear();
        txtEmail.sendKeys(email);
        return this;
    }

    public PageLogin clickBtnSignIn() {
        btnSignIn.click();
        return this;
    }

    public PageLogin clickBtnSubmit() {
        btnSubmit.click();
        return this;
    }

    public PageLogin login(String email, String password) {
        btnSignIn.click();

        txtEmail.clear();
        txtEmail.sendKeys(email);

        txtPassword.clear();
        txtPassword.sendKeys(password);

        btnSubmit.click();

        System.out.println("Kullanıcı: " + lblLoggedInUserName.getText());

        return this;
    }


}
