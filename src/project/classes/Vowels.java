package project.classes;

import project.inteface.Analyse;

/**
 * Створення класу Vowels, що імплентує Analyse
 * метод int analyse(String str) змінено,
 * так тепер цей метод повертає кількість голосних літер рядка
 */
public class Vowels implements Analyse {
    @Override
    public int analyse(String str) {
        int counter=0;
        char [] vowels = {'a', 'e', 'i', 'o', 'u'};
        for(int i=0; i<str.length(); i++){
            for(char symbol:vowels){
                if(str.charAt(i)==symbol){
                    counter++;
                }
            }
        }
        return counter;
    }
}
