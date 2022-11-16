/**
 * Створення абстрактного класу Person
 * Має абстрактний метод printInfo
 */
public abstract class Person {
    private String surname;
    private String name;
    private int age;

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public abstract void printInfo();
}
