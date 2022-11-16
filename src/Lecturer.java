/**
 * Створення класу Lecturer, що є нащадком абстрактного класу Person
 * Має перевизначення методу printInfo
 * Наявні нові приватні поля department, salary
 */
public class Lecturer extends Person {

    private String department;
    private double salary;

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setSalary(double group) {
        this.salary = group;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void printInfo() {
        System.out.println("Преподаватель кафедры " + department + " " + getSurname() + " " + getName() + ", возраст: "
                + getAge() + ". Зарплата:" + salary);
    }
}
