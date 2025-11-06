package Iterator;
/**
 * Клас, який демонструє використання ітератора для обходу та сортування колекції студентів.
 */
public class Client {
    public static void main(String[] args) {

        ConcreteAggregate studentCollection = new ConcreteAggregate();
        studentCollection.addStudent(new Student("Олена", 92));
        studentCollection.addStudent(new Student("Андрій", 75));
        studentCollection.addStudent(new Student("Марія", 88));
        studentCollection.addStudent(new Student("Богдан", 75));
        studentCollection.addStudent(new Student("Ірина", 100));

        ConcreteIterator iterator = (ConcreteIterator) studentCollection.createIterator();

        System.out.println("— Звичайний обхід (порядок додавання):");
        while (iterator.hasNext()) {
            System.out.println(iterator.getNext());
        }

        iterator.reset();

        System.out.println("\n— Обхід за алфавітом:");
        iterator.sortByName();
        iterator = (ConcreteIterator) studentCollection.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.getNext());
        }

        iterator.reset();

        System.out.println("\n— Обхід за оцінками (зростання):");
        iterator.sortByGradeAscending();
        iterator = (ConcreteIterator) studentCollection.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.getNext());
        }

        iterator.reset();

        System.out.println("\n— Обхід за оцінками (спадання):");
        iterator.sortByGradeDescending();
        iterator = (ConcreteIterator) studentCollection.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.getNext());
        }
    }
}