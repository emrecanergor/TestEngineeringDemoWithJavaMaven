package com.automationpractice.pages;

        import com.automationpractice.base.TestBase;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;
        import org.testng.Assert;

public class PageCheckout extends TestBase {

    @FindBy(xpath = "//DIV[@id='center_column']//A[@title='Proceed to checkout']")
    WebElement btnProceedToCheckOut;

    @FindBy(name = "processAddress")
    WebElement btnProcessAddress;

    @FindBy(id = "cgv")
    WebElement chkTerms;

    @FindBy(name = "processCarrier")
    WebElement btnProcessCarrier;

    @FindBy(xpath = "//DIV[@id='HOOK_PAYMENT']//A[@class='bankwire']")
    WebElement btnBankWire;

    @FindBy(xpath = "//P[@id='cart_navigation']//BUTTON[@type='submit']")
    WebElement btnConfirmOrder;

    @FindBy(xpath = "//P[@class='cheque-indent']")
    WebElement lblOrderConfirmationResult;




    public PageCheckout() {
        PageFactory.initElements(getDriver(), this);
    }

    public void completeCheckout() {
        btnProceedToCheckOut.click();
        btnProcessAddress.click();
        getCommon().checkElement(chkTerms);
        btnProcessCarrier.click();
        btnBankWire.click();
        btnConfirmOrder.click();

        Assert.assertEquals(lblOrderConfirmationResult.getText(), "Your order on My Store is complete.");
    }

}
