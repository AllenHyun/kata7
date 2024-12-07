package software.ulpgc.apps.mock;

import software.ulpgc.architecture.control.Command;
import software.ulpgc.architecture.control.ExchangeCommand;
import software.ulpgc.architecture.model.Currency;
import software.ulpgc.architecture.persistence.ExchangeRateLoader;
import software.ulpgc.architecture.view.CurrencyDialog;
import software.ulpgc.architecture.view.MoneyDialog;
import software.ulpgc.architecture.view.MoneyDisplay;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Currency> currencies = new MockCurrencyLoader().load();
        MoneyDialog moneyDialog = new MockMoneyDialog(currencies);
        CurrencyDialog currencyDialog = new MockCurrencyDialog(currencies);
        ExchangeRateLoader exchangeRateLoader = new MockExchangeRateLoader();
        MoneyDisplay moneyDisplay = new MockMoneyDisplay();
        Command command = new ExchangeCommand(
                moneyDialog,
                currencyDialog,
                exchangeRateLoader,
                moneyDisplay
        );
        command.execute();
    }
}
