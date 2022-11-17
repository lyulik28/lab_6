package project;

import project.classes.Consonants;
import project.classes.Vowels;

import java.util.Scanner;

/**
 * "Точка входу" додатку
 * Реалізує введення рядку
 * Створює два об'єкти vowels, consonants класів Vowels Consonants відповідно
 * Викликає методи у створених об'єктів
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String string = input.nextLine();

        Vowels vowels = new Vowels();
        Consonants consonants = new Consonants();

        System.out.println("Vowels number: "+vowels.analyse(string));
        System.out.println("Consonants number: "+consonants.analyse(string));


    }
}