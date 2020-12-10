package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TommyHilfigerFirstItemInListPage extends AbstractPage  {

    public TommyHilfigerFirstItemInListPage(WebDriver driver){
        super(driver);
    }

    public TommyHilfigerFirstItemInListPage addItemInFavorite(){
        WebElement addInFavoriteToggle = waitForElementsLocatedBy(driver,
                By.xpath("//span[@class='wishlist__toggle--button']"));
        addInFavoriteToggle.click();
        return this;
    }

    public TommyHilfigerFavoritePage openFavoritePage(){
        WebElement favoriteButton = waitForElementsLocatedBy(driver,
                By.xpath("//button[@class='wishlist__button']"));
        favoriteButton.click();
        return new TommyHilfigerFavoritePage(driver);
    }
}
