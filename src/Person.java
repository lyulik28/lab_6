/**
 * Створення класу Person, що імплементує Print, SetAndGet
 * Клас має приватні поля surname , name, age
 */
public class Person implements Print, SetAndGet {
    private String surname;
    private String name;
    private int age;

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String printInfo() {
        System.out.println("Человек " + surname + " " + name + ", возраст: " + age);
        return "Человек " + surname + " " + name + ", возраст: " + age;
    }
}
