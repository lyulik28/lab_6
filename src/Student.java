/**
 * Створення класу Student, що є нащадком абстрактного класу Person
 * Має перевизначення методу printInfo
 * Наявні нові приватні поля group, studentCardNumber
 */
public class Student extends Person {
    private int group;
    private String studentCardNumber;

    public void setGroup(int group) {
        this.group = group;
    }

    public int getGroup() {
        return group;
    }

    public void setStudentCardNumber(String studentCardNumber) {
        this.studentCardNumber = studentCardNumber;
    }

    public String getStudentCardNumber() {
        return studentCardNumber;
    }

    @Override
    public void printInfo() {
        System.out.println("Студент группы " + group + " " + getSurname() + " " + getName() + ", возраст: "
                + getAge() + ". Номер студенческого билета: " + studentCardNumber);
    }
}
