package software.ulpgc.apps.windows;

import software.ulpgc.apps.mock.MockCurrencyLoader;
import software.ulpgc.apps.mock.MockExchangeRateLoader;
import software.ulpgc.architecture.control.ExchangeCommand;
import software.ulpgc.architecture.model.Currency;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Currency> currencies = new MockCurrencyLoader().load();
        MainFrame mainFrame = new MainFrame(currencies);
        ExchangeCommand exchangeCommand = new ExchangeCommand(
                mainFrame.moneyDialog(),
                mainFrame.currencyDialog(),
                new MockExchangeRateLoader(),
                mainFrame.moneyDisplay()
        );
    }
}
