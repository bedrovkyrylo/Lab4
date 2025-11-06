package Strategy;
import java.util.function.Function;

/**
 * Клас, який реалізує метод відображення функції в полярній системі координат.
 */
public class PolarCoordinateSystem implements CoordinateSystem {
    /**
     * Відображає функцію в полярній системі координат.
     */
    @Override
    public void plot(Function<Double, Double> function, double start, double end) {
        System.out.println("Plotting on Polar Coordinates:");
        for (double theta = start; theta <= end; theta += 0.5) {
            double r = function.apply(theta);
            System.out.printf("r: %.2f, θ: %.2f%n", r, theta);
        }
    }
}