package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TommyHilfigerHomePage extends AbstractPage {

    private final String HOMEPAGE_URL = "https://ru.tommy.com/%D0%BC%D1%83%D0%B6%D1%87%D0%B8%D0%BD%D1%8B";

    public TommyHilfigerHomePage(WebDriver driver){
        super(driver);
    }

    public TommyHilfigerHomePage openPage(){
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public TommyHilfigerSearchResultsPage inputValueInSearchBar(){
        WebElement headerInput = (new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("headerSearchInput")));
        headerInput.click();
        headerInput.sendKeys("MW0MW12983_BD2");
        headerInput.sendKeys(Keys.ENTER);
        return new TommyHilfigerSearchResultsPage(driver);
    }

    public TommyHilfigerHomePage closeCoockiesPoliticsWindow(){
        WebElement closeCookiesPoliticsButton = (new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS))
                .until(ExpectedConditions.presenceOfElementLocated(By
                        .xpath("//button[@class='cookie-notice__agree-button cookie-notice__agree-button--ru button']")));
        closeCookiesPoliticsButton.click();
        return this;
    }

    public TommyHilfigerMensClothesPage openFestiveStylePage(){
        WebElement festiveStyleButton = (new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS))
                .until(ExpectedConditions.presenceOfElementLocated(By
                        .xpath("//a[@data-track-container-of-cta-id='3243130']")));
        festiveStyleButton.click();
        return new TommyHilfigerMensClothesPage(driver);
    }
}
