package Strategy;
import java.util.function.Function;
/**
 * Клас, який моделює математичну функцію і дозволяє змінювати систему координат для її відображення.
 */
public class MathFunction {
    private Function<Double, Double> function;
    private CoordinateSystem coordinateSystem;
    /**
     * Конструктор для ініціалізації функції та початкової системи координат.
     */
    public MathFunction(Function<Double, Double> function, CoordinateSystem coordinateSystem) {
        this.function = function;
        this.coordinateSystem = coordinateSystem;
    }
    /**
     * Задає нову систему координат для відображення функції.
     */
    public void setCoordinateSystem(CoordinateSystem coordinateSystem) {
        this.coordinateSystem = coordinateSystem;
    }
    /**
     * Задає нову математичну функцію.
     */
    public void setFunction(Function<Double, Double> function) {
        this.function = function;
    }

    /**
     * Відображає графік функції в поточній системі координат.
     */
    public void displayGraph(double start, double end) {
        coordinateSystem.plot(function, start, end);
    }
}