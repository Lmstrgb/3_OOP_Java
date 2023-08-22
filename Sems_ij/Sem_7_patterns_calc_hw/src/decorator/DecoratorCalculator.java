package decorator;

import calculatorNormal.Calculable;

public interface DecoratorCalculator extends Calculable {
    public void log(String message);
}
