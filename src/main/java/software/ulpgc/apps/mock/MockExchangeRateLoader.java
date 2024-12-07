package software.ulpgc.apps.mock;

import software.ulpgc.architecture.model.Currency;
import software.ulpgc.architecture.model.ExchangeRate;
import software.ulpgc.architecture.persistence.ExchangeRateLoader;

import java.time.LocalDate;

public class MockExchangeRateLoader implements ExchangeRateLoader {
    @Override
    public ExchangeRate load(Currency from, Currency to, LocalDate date) {
        if (from.code().equals("YEN") && to.code().equals("EUR")) {
            return new ExchangeRate(from, to, 0.0063, LocalDate.now());
        } else if (from.code().equals("USD") && to.code().equals("EUR")) {
            return new ExchangeRate(from, to, 1.2, LocalDate.now());
        } else if (from.code().equals("EUR") && to.code().equals("YEN")) {
            return new ExchangeRate(from, to, 158.59, LocalDate.now());
        } else if (from.code().equals("YEN") && to.code().equals("USD")) {
            return new ExchangeRate(from, to, 0.0067, LocalDate.now());
        } else if (from.code().equals("USD") && to.code().equals("YEN")) {
            return new ExchangeRate(from, to, 149.97, LocalDate.now());
        }
        return new ExchangeRate(from, to, 1.06, LocalDate.now());
    }
}

