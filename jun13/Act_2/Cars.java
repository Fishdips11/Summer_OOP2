package jun13.Act_2;

import java.util.ArrayList;

public class Cars implements whateverYouLike{
    private ArrayList<String> cars = new ArrayList<>();
    private String car;
    @Override
    public void addCar(String car) {
        cars.add(car);
    }

    @Override
    public void setCarAt(int index, String car) {
        cars.set(index, car);
    }

    @Override
    public void deleteCar(String car) {
        cars.remove(car);
    }

    @Override
    public void display() {
        System.out.println(cars);
    }

    @Override
    public String getCar() {
        return car;
    }

    @Override
    public void setCar() {
        this.car = car;
    }


}
