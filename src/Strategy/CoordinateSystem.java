package Strategy;
import java.util.function.Function;

/**
 * Інтерфейс для визначення методу відображення функції в різних системах координат.
 */
public interface CoordinateSystem {
    /**
     * Метод для відображення функції в поточній системі координат.
     */
    void plot(Function<Double, Double> function, double start, double end);
}