package Strategy;

import java.util.function.Function;
/**
 * Головний клас для демонстрації використання стратегій відображення графіка функції
 * у різних системах координат.
 */
public class Main {
    public static void main(String[] args) {

        Function<Double, Double> sinFunction = Math::sin;

        MathFunction mathFunction = new MathFunction(sinFunction, new CartesianCoordinateSystem());

        mathFunction.displayGraph(0, Math.PI);

        mathFunction.setCoordinateSystem(new PolarCoordinateSystem());
        mathFunction.displayGraph(0, Math.PI);
    }
}