package software.ulpgc.apps.mock;

import software.ulpgc.architecture.model.Currency;
import software.ulpgc.architecture.model.Money;
import software.ulpgc.architecture.view.MoneyDialog;

import java.util.List;

public class MockMoneyDialog implements MoneyDialog {
    private final List<Currency> currencies;

    public MockMoneyDialog(List<Currency> currencies) {
        this.currencies = currencies;
    }

    @Override
    public Money get() {
        return new Money(100, currencies.get(-1));
    }
}
