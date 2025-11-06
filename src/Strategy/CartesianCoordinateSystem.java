package Strategy;
import java.util.function.Function;
/**
 * Клас, який реалізує метод відображення функції в Декартовій системі координат.
 */
public class CartesianCoordinateSystem implements CoordinateSystem {
    /**
     * Відображає функцію в Декартовій системі координат.
     */
    @Override
    public void plot(Function<Double, Double> function, double start, double end) {
        System.out.println("Plotting on Cartesian Coordinates:");
        for (double x = start; x <= end; x += 0.5) {
            System.out.println("x: " + x + ", y: " + function.apply(x));
        }
    }
}