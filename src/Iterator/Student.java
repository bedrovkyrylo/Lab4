package Iterator;
/**
 * Клас для представлення студента з іменем та оцінкою.
 */
public class Student {
    private String name;
    private int grade;

    /**
     * Конструктор для ініціалізації студента з ім'ям та оцінкою.
     */
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
    /**
     * Отримує ім'я студента.
     */
    public String getName() {
        return name;
    }
    /**
     * Отримує оцінку студента.
     */
    public int getGrade() {
        return grade;
    }
    /**
     * Переопреділений метод toString для відображення студента у вигляді: ім'я (оцінка).
     */
    @Override
    public String toString() {
        return name + " (" + grade + ")";
    }
}
