package com.automationpractice.pages;

        import com.automationpractice.base.TestBase;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.interactions.Actions;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import org.testng.Assert;

public class PageProducts extends TestBase {

    @FindBy(xpath = "//UL[@class='product_list grid row']/li")
    WebElement productGrid;

    @FindBy(xpath = "(//A[@title='Add to cart'])[1]")
    WebElement firstProductAddButton;

    @FindBy(xpath = "//DIV[@id='layer_cart']//H2[contains(., 'Product successfully added to your shopping cart')]")
    WebElement cartResultMessage;

    @FindBy(xpath = "//A[@title='Proceed to checkout' and @rel='nofollow']")
    WebElement btnProceedToCheckOut;

    public PageProducts() {
        PageFactory.initElements(getDriver(), this);
    }

    public void selectFirstProductAndAddToCart() {
        Actions actions = new Actions(driver);
        actions.moveToElement(productGrid).build().perform();

        //moveTo event'i hover gibi çalışıyor
        firstProductAddButton.click();


        WebDriverWait shortWait = new WebDriverWait(driver, 5);
        shortWait.until(ExpectedConditions.visibilityOf(cartResultMessage));

        Assert.assertTrue(cartResultMessage.isDisplayed(), "Sepete Ekleme Başarısız");

        btnProceedToCheckOut.click();
    }

}
