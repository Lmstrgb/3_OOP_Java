package decorator;

import calculatorNormal.Calculable;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DecNormalCalculator implements DecoratorCalculator {
    private Calculable calculator;

    public DecNormalCalculator(Calculable calculator) {
        this.calculator = calculator;
    }


    @Override
    public double sum(double arg1, double arg2) {
        double result = calculator.sum(arg1, arg2);
        //log("Сумма: ");
        log(String.format("Обычный калькулятор, вычисляется сумма чисел: %s и %s ", arg1, arg2));
        return result;
    }

    @Override
    public double multiply(double arg1, double arg2) {
        double result = calculator.multiply(arg1, arg2);
        log(String.format("Обычный калькулятор, вычисляется произведение чисел: %s и %s ", arg1, arg2));
        return result;
    }

    @Override
    public double divide(double arg1, double arg2) {
        double result = calculator.divide(arg1, arg2);
        log(String.format("Обычный калькулятор, вычисляется деление чисела %s на %s: ", arg1, arg2));
        return result;
    }

    @Override
    public double minus(double arg1, double arg2) {
        double result = calculator.minus(arg1, arg2);
        log(String.format("Обычный калькулятор, вычисляется разность чисела %s и %s: ", arg1, arg2));
        return result;
    }

    @Override
    public void log(String message) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        System.out.printf("%n%s : %s%n",now.format(formatter), message);
        //System.out.printf(message);
    }
}
