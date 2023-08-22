package calculatorNormal;

public class NormalCalc implements Calculable {
    @Override
    public double sum(double a, double b) {
        return a + b;
    }
    @Override
    public double multiply(double a, double b) {
        return a * b;
    }
    @Override
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        return a / b;
    }
    @Override
    public double minus(double a, double b) {
        return a - b;
    }
}
