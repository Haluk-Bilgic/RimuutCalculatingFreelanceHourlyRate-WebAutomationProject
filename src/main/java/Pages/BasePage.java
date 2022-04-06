package Pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class BasePage {

    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver,10);
    }

    public void clickFunction(WebElement clickElement){
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }

    public void selectElement(WebElement dropdown,String element){
        Select slc=new Select(dropdown);
        slc.selectByVisibleText(element);
    }

}
