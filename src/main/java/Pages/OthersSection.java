package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OthersSection extends BasePage{

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
        sendKeysFunction(taxationCost,value);
    }
    public void typeProfitMargin(String value) {
        sendKeysFunction(yourProfitMargin,value);
    }
    public void typeHoursForWorking(String value) {
        sendKeysFunction(hoursForWorking,value);
    }
    public void viewResult(){
        getText(resultText);
    }
}
