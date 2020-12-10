package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.TommyHilfigerHomePage;

import java.util.List;

public class PageObjectTommyHilfigerTest {
    private WebDriver driver;
    private final Integer expectedResultOfAddingItemInFavorite = 1;
    private final String expectedResultOfSearchingItem = "MW0MW12983_BD2";

    @BeforeMethod(alwaysRun = true)
    public void browserSetup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void searchItemTest() throws InterruptedException {
        String searchingResult = new TommyHilfigerHomePage(driver)
                .openPage()
                .closeCookiesPoliticsWindow()
                .inputValueInSearchBar(expectedResultOfSearchingItem)
                .getColourOfFirstItemFromSearchResults();
        Assert.assertEquals(searchingResult, expectedResultOfSearchingItem);
    }

    @Test
    public void addItemInFavoriteTest() throws InterruptedException {
        Integer favoriteResult = new TommyHilfigerHomePage(driver)
                .openPage()
                .closeCookiesPoliticsWindow()
                .openMensClothesPage()
                .openFirstItemPage()
                .addItemInFavorite()
                .openFavoritePage()
                .getFavoriteResults();
        Assert.assertEquals(favoriteResult, expectedResultOfAddingItemInFavorite);
    }

    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {
        driver.quit();
    }
}
