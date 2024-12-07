package software.ulpgc.architecture.model;

import java.time.LocalDate;
import java.util.Locale;

public record ExchangeRate(Currency from, Currency to, double rate, LocalDate date) {
}
