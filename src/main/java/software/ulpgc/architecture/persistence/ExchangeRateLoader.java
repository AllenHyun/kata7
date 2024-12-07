package software.ulpgc.architecture.persistence;

import software.ulpgc.architecture.model.Currency;
import software.ulpgc.architecture.model.ExchangeRate;

import java.time.LocalDate;

public interface ExchangeRateLoader {
    ExchangeRate load(Currency from, Currency to, LocalDate date);
}
