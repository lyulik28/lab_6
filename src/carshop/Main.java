package carshop;

import carshop.impl.MyOwnAutoShop;

import java.util.Arrays;

public class Main {
    /**
     * "Точка входу" програми
     * Створює об'єкт auto класу MyOwnAutoShop
     * auto використовує створені раніше методи
     * @param args
     */
    public static void main(String[] args) {
        MyOwnAutoShop auto = new MyOwnAutoShop();
        System.out.println(auto.getIncome());
        System.out.println(Arrays.toString(auto.getCarsPrice()));
        System.out.println(Arrays.toString(auto.getCarColors()));
        System.out.println(auto.getCarPrice(3));
        System.out.println(auto.getCarColor(2));
        System.out.println(auto.purchaseCar(1));
    }
}