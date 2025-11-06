package Iterator;
/**
 * Інтерфейс для визначення методу створення ітератора.
 */
public interface Aggregate {
    /**
     * Створює ітератор для колекції.
     */
    Iterator createIterator();
}