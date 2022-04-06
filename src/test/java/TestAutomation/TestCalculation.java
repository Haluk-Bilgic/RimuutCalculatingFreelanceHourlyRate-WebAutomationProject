package TestAutomation;


import Pages.CurrencySection;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


public class TestCalculation extends BaseTest {

    CurrencySection currencySection = new CurrencySection(driver);

    @Test
    @DisplayName("HomePage")
    public void test1() {
        currencySection.clickAcceptAllbutton();
        currencySection.selectCurrencyType("TRY");
        currencySection.openExpensesOptions();
    }


}