package software.ulpgc.apps.mock;

import software.ulpgc.architecture.model.Money;
import software.ulpgc.architecture.view.MoneyDisplay;

public class MockMoneyDisplay implements MoneyDisplay {
    @Override
    public void show(Money money) {
        System.out.println("El cambio es de " + money);
    }
}
