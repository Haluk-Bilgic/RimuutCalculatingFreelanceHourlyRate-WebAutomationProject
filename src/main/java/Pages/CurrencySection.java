package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CurrencySection extends BasePage {

    public CurrencySection(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/div[2]/section/div/div/div[2]/button[2]")
    @CacheLookup
    private WebElement acceptAll;

    @FindBy(id = "currency")
    @CacheLookup
    private WebElement currency;

    @FindBy(className = "box-header")
    @CacheLookup
    private WebElement expenses;


    public void clickAcceptAllbutton() {
        clickFunction(acceptAll);
    }

    public void selectCurrencyType(String currencyType) {

        selectElement(currency, currencyType);
    }

    public void openExpensesOptions() {
        clickFunction(expenses);
    }
}
