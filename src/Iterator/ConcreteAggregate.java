package Iterator;

import java.util.*;
/**
 * Конкретна реалізація колекції студентів. Реалізує інтерфейс Aggregate.
 */
public class ConcreteAggregate implements Aggregate {
    private final List<Student> students;
    /**
     * Конструктор для ініціалізації порожньої колекції студентів.
     */
    public ConcreteAggregate() {
        this.students = new ArrayList<>();
    }
    /**
     * Додає студента до колекції.
     */
    public void addStudent(Student student) {
        students.add(student);
    }
    /**
     * Створює ітератор для обходу колекції студентів.
     */
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this.students);
    }

    /**
     * Отримує список студентів.
     */
    public List<Student> getStudents() {
        return students;
    }
}
