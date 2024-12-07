package software.ulpgc.apps.mock;

import software.ulpgc.architecture.model.Currency;
import software.ulpgc.architecture.persistence.CurrencyLoader;

import java.util.List;

public class MockCurrencyLoader implements CurrencyLoader {
    @Override
    public List<Currency> load() {
        return List.of(
                new Currency("USD", "Dólar americano", "$"),
                new Currency("EUR", "Euro", "€")
        );
    }
}
