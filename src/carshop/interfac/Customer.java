package carshop.interfac;

/**
 * Створення інтерфейса Customer
 */
public interface Customer {
    double[] getCarsPrice();
    String[] getCarColors();

    double getCarPrice(int id);
    String getCarColor(int id);
    boolean purchaseCar(int id);
}
