public class Main {

    /**
     * "Точка входу" додатку
     * Створює об'єкти за принципом всхідного перетворення
     * Створює масив екземплярів класу Person, Student, Lecturer
     * Student та Lecturer у масиві також створені за висхідним перетворенням
     * @param args
     */
    public static void main(String[] args) {
        Person student1 = new Student();
        student1.setName("Mary");
        student1.setSurname("Polovenko");
        student1.setAge(19);
        student1.printInfo();

        Person student2 = new Student();
        student2.setName("Mary");
        student2.setSurname("Gromova");
        student2.setAge(18);
        student2.printInfo();

        Person lecturer1 = new Lecturer();
        lecturer1.setName("Marina");
        lecturer1.setSurname("Kalina");
        lecturer1.setAge(25);
        lecturer1.printInfo();

        Person lecturer2 = new Lecturer();
        lecturer2.setName("Elizabeth");
        lecturer2.setSurname("Miropolska");
        lecturer2.setAge(29);
        lecturer2.printInfo();

        Person[] array = new Person[4];
        array[0] = new Student();
        array[0].setSurname("Student");
        array[0].setName("One");
        array[0].setAge(17);
        array[1] = new Student();
        array[1].setSurname("Student");
        array[1].setName("Two");
        array[1].setAge(18);
        array[2] = new Lecturer();
        array[2].setSurname("Lecturer");
        array[2].setName("Lecturer");
        array[2].setAge(30);
        array[3] = new Person();
        array[3].setSurname("Just a");
        array[3].setName("Person");
        array[3].setAge(5);

        for (Person person : array) {
            person.printInfo();
        }
    }
}