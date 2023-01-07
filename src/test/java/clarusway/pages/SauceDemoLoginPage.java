package clarusway.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SauceDemoLoginPage {
    public SauceDemoLoginPage(){

        // initElements methodu Page class i initialize etmek adina kullanilir
        PageFactory.initElements(Driver.getDriver(),this);
    }
    // @FindBy annotasyonu elementleri locate ederken kullandigimiz ve initElements methodu ile elementlerin bulunmasini saglayan bir anotasyondur


    @FindBy(id = "user-name")
    public WebElement txtUsername;

    @FindBy(id = "password")
    public WebElement txtPassword;

    @FindBy(xpath = "//*[@id='login-button']")
    public WebElement btnLogin;
//ornek olması acısından @FindAll anotatıon kullanımı Page classtan bagımsızdır.
    @FindAll(
            {
                    @FindBy(id = "user-name"),
                    @FindBy(id = "password"),
                    @FindBy(xpath = "//*[@id='login-button']")
            }
    )
    public List<WebElement> inputElements;
}
