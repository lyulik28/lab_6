package carshop.impl;

import carshop.interfac.Admin;
import carshop.interfac.Customer;
import carshop.cars.*;

import java.sql.Array;

/**
 * Створення класу MyOwnAutoShop, що реалізує інтерфейси Admin, Customer
 * Містить масив, в якому об'єкти класів Sedan, Ford, Truck
 */
public class MyOwnAutoShop implements Admin, Customer {
    Car[] arrayCar = {new Sedan(280, false, 60000, "black", 4000),
            new Ford(378, true, 3000000, "white", 2015),
            new Ford(354, false, 170000, "yellow", 2017),
            new Truck(110, false, 5000000, "white", 4650),
            new Truck(200, true, 700000, "white", 5000)};

    @Override
    public double getIncome() {
        double income = 0;
        for (Car oneCar : arrayCar) {
            income += oneCar.getSalePrice();
        }
        return income;
    }

    @Override
    public double[] getCarsPrice() {
        double[] array = new double[arrayCar.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = arrayCar[i].getSalePrice();
        }
        return array;
    }

    @Override
    public String[] getCarColors() {
        String[] array = new String[arrayCar.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = arrayCar[i].color;
        }
        return array;
    }

    @Override
    public double getCarPrice(int id) {
        return arrayCar[id].getSalePrice();
    }

    @Override
    public String getCarColor(int id) {
        return arrayCar[id].color;
    }

    @Override
    public boolean purchaseCar(int id) {
        return arrayCar[id].isSellOut;
    }
}
