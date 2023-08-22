package calculatorNormal;

import decorator.DecEngineerCalculator;
import decorator.DecNormalCalculator;
import decorator.DecoratorCalculator;
import factory.FactoryCalculable;
import factory.FactoryCalculator;

public class Main {
    public static void main(String[] args) {
        FactoryCalculable calculatorFactory = new FactoryCalculator();

        Calculable normalCalculator = calculatorFactory.createNormalCalculator();
        DecoratorCalculator normalDecCalc = new DecNormalCalculator(normalCalculator);

        Calculable engineerCalculator = calculatorFactory.createEngineerCalculator();
        DecoratorCalculator engineerDecCalculator = new DecEngineerCalculator(engineerCalculator);
        //NormalCalc calculator = new NormalCalc(); //было изначально


        ViewCalc view = new ViewCalc(normalDecCalc);
        ViewCalc viewEng = new ViewCalc(engineerDecCalculator);
        //view.run();  //режим обычный
        viewEng.run(); //режим инженерный

    }
}
