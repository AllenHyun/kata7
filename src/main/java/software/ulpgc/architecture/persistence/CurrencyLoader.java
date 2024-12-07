package software.ulpgc.architecture.persistence;


import software.ulpgc.architecture.model.Currency;

import java.util.List;

public interface CurrencyLoader {
    List<Currency> load();
}
