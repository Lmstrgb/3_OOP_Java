package factory;

import calculatorEngineer.EngineerCalc;
import calculatorNormal.Calculable;
import calculatorNormal.NormalCalc;

public class FactoryCalculator implements  FactoryCalculable{
    @Override
    public Calculable createNormalCalculator() {
        return new NormalCalc();
    }

    @Override
    public Calculable createEngineerCalculator() {
        return new EngineerCalc();
    }
}
