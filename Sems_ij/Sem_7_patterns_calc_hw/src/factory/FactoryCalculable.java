package factory;

import calculatorNormal.Calculable;

public interface FactoryCalculable {
    Calculable createNormalCalculator();
    Calculable createEngineerCalculator();
}
