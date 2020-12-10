package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TommyHilfigerSearchResultsPage extends AbstractPage {

    @FindBy(xpath = "//li[@class='product-list__item three']/article")
    private List<WebElement> searchResults;

    public TommyHilfigerSearchResultsPage(WebDriver driver){
        super(driver);
    }

    public String getColourOfFirstItemFromSearchResults(){
        return searchResults.get(0).getAttribute("data-primarycolour");
    }
}
