package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpensesSection extends BasePage{

    public ExpensesSection(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//input[@type='text'])[1]")
    @CacheLookup
    private WebElement monthlyRent;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    @CacheLookup
    private WebElement cellPhoneBill;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    @CacheLookup
    private WebElement utilitiesCost;

    @FindBy(xpath = "(//input[@type='text'])[4]")
    @CacheLookup
    private WebElement foodCost;

    @FindBy(xpath = "(//input[@type='text'])[8]")
    @CacheLookup
    private WebElement creditCardPayment;

    @FindBy(id = "headingOthers")
    @CacheLookup
    private WebElement othersSection;

    public void typeMonthlyRent(String value) {
        sendKeysFunction(monthlyRent,value);
    }
    public void typeCellPhoneBill(String value) {
        sendKeysFunction(cellPhoneBill,value);
    }
    public void typeUtilitiesCost(String value) {
        sendKeysFunction(utilitiesCost,value);
    }
    public void typeFoodCost(String value) {
        sendKeysFunction(foodCost,value);
    }
    public void typeCreditCardPayment(String value) {
        jsScrollToElement("arguments[0].scrollIntoView();",creditCardPayment);
        waitFor(1);
        sendKeysFunction(creditCardPayment,value);
    }
    public void openOthersOptions(){
        jsScrollToElement("arguments[0].scrollIntoView();",othersSection);
        waitFor(1);
        clickFunction(othersSection);
    }

}
