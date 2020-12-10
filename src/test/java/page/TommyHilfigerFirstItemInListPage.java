package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TommyHilfigerFirstItemInListPage extends AbstractPage  {

    @FindBy(xpath = "//span[@class='wishlist__toggle--button']")
    private WebElement addInFavoriteToggle;

    @FindBy(xpath = "//button[@class='wishlist__button']")
    private WebElement favoriteButton;

    public TommyHilfigerFirstItemInListPage(WebDriver driver){
        super(driver);
    }

    public TommyHilfigerFirstItemInListPage addItemInFavorite(){
        addInFavoriteToggle.click();
        return this;
    }

    public TommyHilfigerFavoritePage openFavoritePage(){
        favoriteButton.click();
        return new TommyHilfigerFavoritePage(driver);
    }
}
