package exam_sv2_part1.cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {


    private String name;
    private int maxPrice;
    private List<Car> carsForSell = new ArrayList<>();

    public CarShop(String name, int maxPrice) {
        this.name = name;
        this.maxPrice = maxPrice;
    }

    public String getName() {
        return name;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public List<Car> getCarsForSell() {
        return new ArrayList<>(carsForSell);
    }

    public boolean addCar(Car car) {
        if (car.getPrice() > maxPrice) {
            return false;
        }
        carsForSell.add(car);
        return true;
    }

    public int sumCarPrice() {
        int sum = 0;
        for (Car car : carsForSell) {
            sum += car.getPrice();
        }
        return sum;
    }

    public int numberOfCarsCheaperThan(int price) {
        int count = 0;
        for (Car car : carsForSell) {
            if (car.getPrice()<price){
                count++;
            }
        }
        return count;
    }

    public List<Car> carsWithBrand(String brand) {
        List<Car> cars = new ArrayList<>();
        for (Car car : carsForSell) {
            if (car.getBrand().equalsIgnoreCase(brand)){
                cars.add(car)  ;          }
        }
        return cars;
    }


}
