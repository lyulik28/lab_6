/**
 * Створення класу Student, що є нащадком класу Person
 * Має додаткові поля group, studentCardNumber та відповідні їм геттери та сеттери
 * Перевизначає метод printInfo()
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
    public String printInfo() {
        System.out.println("Студент группы " + group + " " + getSurname() + " " + getName() + ", возраст: "
                + getAge() + ". Номер студенческого билета: " + studentCardNumber);
        return "Студент группы " + group + " " + getSurname() + " " + getName() + ", возраст: "
                + getAge() + ". Номер студенческого билета: " + studentCardNumber;
    }
}
