package carshop.cars;

/**
 * Створення класу Truck - нащадку Car
 * Перевизначає метод getSalePrice()
 * Має конструктор
 */
public class Truck extends Car{
    int weight;

    public Truck(int speed, boolean isSellOut, double regularPrice, String color, int weight) {
        super(speed, isSellOut, regularPrice, color);
        this.weight=weight;
    }

    @Override
    public double getSalePrice(){
        if(weight>2000){
            return regularPrice-regularPrice/10;
        }
        return regularPrice;
    }
}
