package software.ulpgc.apps.windows.view;

import software.ulpgc.architecture.model.Money;
import software.ulpgc.architecture.view.MoneyDialog;

import javax.swing.*;
import java.awt.*;
import java.util.Currency;
import java.util.List;

public class SwingMoneyDialog extends JPanel implements MoneyDialog {
    private final List<Currency> currencies;
    private final TextField amount;
    private final SwingCurrencyDialog currencyDialog;

    public SwingMoneyDialog(List<Currency> currencies) {
        this.currencies = currencies;
        this.setLayout(new FlowLayout());
        this.add(amount = createAmountInput());
        this.add(currencyDialog = new SwingCurrencyDialog(currencies));
    }

    private TextField createAmountInput(){
        TextField textField = new TextField();
        textField.setColumns(4);
        return textField;
    }

    @Override
    public Money get() {
        return new Money(toDouble(amount.getText()), currencyDialog.get());
    }

    private double toDouble(String text) {
        return Double.parseDouble(text);
    }

}
