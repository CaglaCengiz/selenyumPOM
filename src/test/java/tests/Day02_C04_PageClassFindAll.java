package tests;

import clarusway.pages.SauceDemoLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class Day02_C04_PageClassFindAll {
    @Test
    public  void test(){
        Driver.getDriver().get("https://www.saucedemo.com/");
        SauceDemoLoginPage lp=new SauceDemoLoginPage();
        Assert.assertEquals(3,lp.inputElements.size());
        Driver.closeDriver();
    }
}
