package com.automationpractice.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    private Properties prop = new Properties();

    private void loadProperties(){
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(System.getProperty("user.dir") + "/src/main/resources/default.properties"));

            prop.load(fileInputStream);
        }
        catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public Common getCommon(){
        return new Common();
    }

    public void openBrowser(String browserType) {

        if (browserType.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();

            String implicitlyWaitInSeconds = prop.getProperty("implicitlyWaitInSeconds", "40");

            driver.manage().timeouts().implicitlyWait(Integer.parseInt(implicitlyWaitInSeconds), TimeUnit.SECONDS);

            driver.manage().window().maximize();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void goToUrl(String Url){
        driver.get(Url);
    }

    @BeforeMethod
    public void beforeMethod() {
        loadProperties();
        openBrowser("chrome");
    }

}
