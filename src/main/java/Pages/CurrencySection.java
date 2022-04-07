package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Log4j;

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
    private WebElement currencySection;

    @FindBy(xpath = "//div[@id='headingExpenses']")
    @CacheLookup
    private WebElement expensesSection;


    public void clickAcceptAllbutton() {
        Log4j.info("Accepting cookies");
        clickFunction(acceptAll);
    }

    public void selectCurrencyType(String currencyType) {
        Log4j.info("Selecting currency type");
        selectElement(currencySection, currencyType);
    }

    public void openExpensesOptions() {
        waitFor(2);
        Log4j.info("Passing to expenses section");
        clickFunction(expensesSection);
    }
}
