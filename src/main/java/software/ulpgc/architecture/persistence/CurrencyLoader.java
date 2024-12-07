package software.ulpgc.architecture.persistence;

import java.util.Currency;
import java.util.List;

public interface CurrencyLoader {
    List<Currency> load();
}
