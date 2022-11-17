package carshop.cars;

/**
 * Створення класу Sedan - нащадку Car
 * Перевизначає метод getSalePrice()
 * Має конструктор
 */
public class Sedan extends Car{
    int length;

    public Sedan(int speed, boolean isSellOut, double regularPrice, String color, int length) {
        super(speed, isSellOut, regularPrice, color);
        this.length=length;
    }

    @Override
    public double getSalePrice(){
         if(length>20){
             return regularPrice-regularPrice/20;
         }
         return regularPrice;
     }
}
