package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TommyHilfigerSearchResultsPage extends AbstractPage {

    public TommyHilfigerSearchResultsPage(WebDriver driver){
        super(driver);
    }

    public String getColourOfFirstItemFromSearchResults(){
        List<WebElement> seacrhResults = driver
                .findElements(By.xpath("//li[@class='product-list__item three']/article"));
        return seacrhResults.get(0).getAttribute("data-primarycolour");
    }
}
