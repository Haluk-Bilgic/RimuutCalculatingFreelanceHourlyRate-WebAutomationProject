package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.Log4j;

public class OthersSection extends BasePage {

    public OthersSection(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//input[@type='text'])[14]")
    @CacheLookup
    private WebElement taxationCost;

    @FindBy(xpath = "(//input[@type='text'])[15]")
    @CacheLookup
    private WebElement yourProfitMargin;

    @FindBy(xpath = "(//input[@type='text'])[16]")
    @CacheLookup
    private WebElement hoursForWorking;

    @FindBy(className = "result")
    @CacheLookup
    private WebElement resultText;


    public void typeTaxationCost(String value) {
        Log4j.info("Typing taxationCost input field");
        sendKeysFunction(taxationCost, value);
    }

    public void typeProfitMargin(String value) {
        Log4j.info("Typing yourProfitMargin input field");
        sendKeysFunction(yourProfitMargin, value);
    }

    public void typeHoursForWorking(String value) {
        Log4j.info("Typing hoursForWorking input field");
        sendKeysFunction(hoursForWorking, value);
    }

    public void viewResult() {
        Log4j.info("Printing Result");
        getText(resultText);
    }

    public void screenshot() {
        waitFor(1);
        Log4j.info("Creating Screenshot");
        BrowserUtils.getScreenshot("HourlyRateResult", driver);
    }

}
