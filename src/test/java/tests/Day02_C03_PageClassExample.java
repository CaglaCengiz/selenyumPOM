package tests;

import clarusway.pages.HtmlGoodiesHomePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.Driver;

public class Day02_C03_PageClassExample {
   // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
   // Fill in capitals by country
 // URL'ye gidin: http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
 // Ülkeye göre büyük harfleri doldurun
    @Test
    public void test() {
        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        HtmlGoodiesHomePage hp=new HtmlGoodiesHomePage();
        Actions actions=new Actions(Driver.getDriver());
        actions
               .dragAndDrop(hp.Copenhag, hp.denmark)
                .dragAndDrop(hp.Seoul, hp.sKorea)
                .dragAndDrop(hp.Washington,hp.us)
                .dragAndDrop(hp.Rome, hp.italy)
                .dragAndDrop(hp.Madrid, hp.spain)
                .dragAndDrop(hp.Oslo,hp.norway)
                .dragAndDrop(hp.Stockholm,hp.sweden)
                .perform();
    }
}
