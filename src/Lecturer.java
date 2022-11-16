/**
 * Створення класу Lecturer, що є нащадком класу Person
 * Має додаткові поля department, salary та відповідні їм геттери та сеттери
 * Перевизначає метод printInfo()
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
    public String printInfo() {
        System.out.println("Преподаватель кафедры " + department + " " + getSurname() + " " + getName() + ", возраст: "
                + getAge() + ". Зарплата:" + salary);
        return "Преподаватель кафедры " + department + " " + getSurname() + " " + getName() + ", возраст: "
                + getAge() + ". Зарплата:" + salary;
    }
}
