package Iterator;

import java.text.Collator;
import java.util.Locale;
import java.util.*;
/**
 * Конкретна реалізація ітератора, який дозволяє здійснювати обхід та сортування колекції студентів.
 */
class ConcreteIterator implements Iterator {
    private final List<Student> students;
    private int index = 0;
    /**
     * Конструктор для ініціалізації ітератора з колекцією студентів.
     */
    public ConcreteIterator(List<Student> students) {
        this.students = students;
    }

    /**
     * Перевіряє чи є наступний елемент у колекції.
     */
    @Override
    public boolean hasNext() {
        return index < students.size();
    }
    /**
     * Отримує наступний елемент з колекції.
     */
    @Override
    public Object getNext() {
        if (hasNext()) {
            return students.get(index++);
        }
        return null;
    }
    /**
     * Скидає індекс ітерації до початкового.
     */
    public void reset() {
        index = 0;
    }
    /**
     * Сортує студентів за алфавітним порядком за іменем.
     */
    public void sortByName() {
        students.sort(Comparator.comparing(Student::getName, Collator.getInstance(new Locale("uk", "UA"))));
    }
    /**
     * Сортує студентів за оцінками в порядку зростання.
     */
    public void sortByGradeAscending() {
        students.sort(Comparator.comparingInt(Student::getGrade));
    }
    /**
     * Сортує студентів за оцінками в порядку спадання.
     */
    public void sortByGradeDescending() {
        students.sort((s1, s2) -> Integer.compare(s2.getGrade(), s1.getGrade()));
    }
}