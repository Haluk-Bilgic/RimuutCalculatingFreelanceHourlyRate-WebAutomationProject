package TestAutomation;


import Pages.CurrencySection;
import Pages.ExpensesSection;
import Pages.OthersSection;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


public class TestCalculation extends BaseTest {

    CurrencySection currencySection = new CurrencySection(driver);
    ExpensesSection expensesSection = new ExpensesSection(driver);
    OthersSection othersSection = new OthersSection(driver);

    @Test
    @DisplayName("CurrencySection")
    public void test1() {
        currencySection.clickAcceptAllbutton();
        currencySection.selectCurrencyType("TRY");
        currencySection.openExpensesOptions();
    }

    @Test
    @DisplayName("ExpensesSection")
    public void test2() {
        expensesSection.typeMonthlyRent("2000");
        expensesSection.typeCellPhoneBill("100");
        expensesSection.typeUtilitiesCost("1200");
        expensesSection.typeFoodCost("3000");
        expensesSection.typeCreditCardPayment("4000");
        expensesSection.openOthersOptions();
    }

    @Test
    @DisplayName("OthersSection")
    public void test3() {
        othersSection.typeTaxationCost("10");
        othersSection.typeProfitMargin("5000");
        othersSection.typeHoursForWorking("30");
        othersSection.viewResult();
        othersSection.screenshot();

    }
}