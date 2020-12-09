package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TommyHilfigerMensClothesPage extends AbstractPage {

    public TommyHilfigerMensClothesPage(WebDriver driver){
        super(driver);
    }

    public TommyHilfigerFirstItemInListPage openFirstItemPage(){
        List<WebElement> firstItemInList = driver.findElements(By.xpath("//ul[@class='product-list__items']/li"));
        firstItemInList.get(0).click();
        return new TommyHilfigerFirstItemInListPage(driver);
    }
}
