package calculatorEngineer;

import calculatorNormal.Calculable;

public class EngineerCalc implements Calculable {
    @Override
    public double sum(double arg1, double arg2) {
        System.out.println(":) А теперь считаем по инженерному: ");
        return arg1 + arg2;
    }

    @Override
    public double multiply(double arg1, double arg2) {
        System.out.println(" :) А теперь считаем по инженерному: ");
        return arg1 * arg2;
    }

    @Override
    public double divide(double arg1, double arg2) {
        System.out.println(" :) А теперь считаем по инженерному: ");
        if (arg2 == 0) {
            throw new ArithmeticException("Деление на ноль даже в инженерном режиме запрещено");
        }
        return arg1 / arg2;
    }

    @Override
    public double minus(double arg1, double arg2) {
        System.out.println(":) А теперь считаем по инженерному:");
        return arg1-arg2;
    }
}
