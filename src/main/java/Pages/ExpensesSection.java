package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Log4j;

public class ExpensesSection extends BasePage {

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
        Log4j.info("Typing monthlyRent input field");
        sendKeysFunction(monthlyRent, value);
    }

    public void typeCellPhoneBill(String value) {
        Log4j.info("Typing cellPhoneBill input field");
        sendKeysFunction(cellPhoneBill, value);
    }

    public void typeUtilitiesCost(String value) {
        Log4j.info("Typing utilitiesCost input field");
        sendKeysFunction(utilitiesCost, value);
    }

    public void typeFoodCost(String value) {
        Log4j.info("Typing foodCast input field");
        sendKeysFunction(foodCost, value);
    }

    public void typeCreditCardPayment(String value) {
        jsScrollToElement("arguments[0].scrollIntoView();", creditCardPayment);
        waitFor(1);
        Log4j.info("Typing CreditCard input field");
        sendKeysFunction(creditCardPayment, value);
    }

    public void openOthersOptions() {
        jsScrollToElement("arguments[0].scrollIntoView();", othersSection);
        waitFor(1);
        Log4j.info("Passing to Others section");
        clickFunction(othersSection);
    }

}
