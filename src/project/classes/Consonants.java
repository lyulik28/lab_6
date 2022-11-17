package project.classes;

import project.inteface.Analyse;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Створення класу Consonants, що імплентує Analyse
 * метод int analyse(String str) змінено,
 * так тепер цей метод повертає кількість приголосних літер рядка
 */
public class Consonants implements Analyse {
    @Override
    public int analyse(String str) {
        Pattern p = Pattern.compile("[A-Za-z]");
        int counter=str.length();
        char [] vowels = {'a', 'e', 'i', 'o', 'u',
                'A', 'E', 'I', 'O', 'U'};
        for(int i=0; i<str.length(); i++){
            String s="";
            s+=str.charAt(i);
            Matcher matcher = p.matcher(s);
            if(!matcher.matches()){
                counter--;
            }
            for(char symbol:vowels){
                if(str.charAt(i)==symbol){
                    counter--;
                }
            }
        }
        return counter;
    }
}
