package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TommyHilfigerHomePage extends AbstractPage {

    @FindBy(id = "headerSearchInput")
    private WebElement headerInput;

    @FindBy(xpath = "//button[@class='cookie-notice__agree-button cookie-notice__agree-button--ru button']")
    private WebElement closeCookiesPoliticsButton;

    @FindBy(xpath = "//a[@data-track-container-of-cta-id='3243130']")
    private WebElement mensClothesButton;

    private final String HOMEPAGE_URL = "https://ru.tommy.com/%D0%BC%D1%83%D0%B6%D1%87%D0%B8%D0%BD%D1%8B";

    public TommyHilfigerHomePage(WebDriver driver) {
        super(driver);
    }

    public TommyHilfigerHomePage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public TommyHilfigerSearchResultsPage inputValueInSearchBar(String inputValue) {
        headerInput.click();
        headerInput.sendKeys(inputValue);
        headerInput.sendKeys(Keys.ENTER);
        return new TommyHilfigerSearchResultsPage(driver);
    }

    public TommyHilfigerHomePage closeCookiesPoliticsWindow() {
        closeCookiesPoliticsButton.click();
        return this;
    }

    public TommyHilfigerMensClothesPage openMensClothesPage() {
        mensClothesButton.click();
        return new TommyHilfigerMensClothesPage(driver);
    }
}
