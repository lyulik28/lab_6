package carshop.cars;

/**
 * Створення класу Ford - нащадку Car
 * Перевизначає метод getSalePrice()
 * Має конструктор
 */
public class Ford extends Car{
    int year;
    int manufacturerDiscount;

    public Ford(int speed, boolean isSellOut, double regularPrice, String color, int year) {
        super(speed, isSellOut, regularPrice, color);
        this.year=year;    }

    @Override
    public double getSalePrice(){
        return regularPrice-manufacturerDiscount;
    }
}
