package software.ulpgc.apps.mock;

import software.ulpgc.architecture.model.Currency;
import software.ulpgc.architecture.model.ExchangeRate;
import software.ulpgc.architecture.persistence.ExchangeRateLoader;

import java.time.LocalDate;

public class MockExchangeRateLoader implements ExchangeRateLoader {
    @Override
    public ExchangeRate load(Currency from, Currency to, LocalDate date) {
        return new ExchangeRate(from,to, 1.2, LocalDate.now());
    }
}

