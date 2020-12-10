package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TommyHilfigerMensClothesPage extends AbstractPage {

    @FindBy(xpath = "//ul[@class='product-list__items']/li")
    List<WebElement> firstItemInList;

    public TommyHilfigerMensClothesPage(WebDriver driver){
        super(driver);
    }

    public TommyHilfigerFirstItemInListPage openFirstItemPage(){
        firstItemInList.get(0).click();
        return new TommyHilfigerFirstItemInListPage(driver);
    }
}
