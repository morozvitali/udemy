package lesson43_Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class CarInfo {


    void testCar (ArrayList<Car> arrayList, Predicate<Car> carPredicate) {
        for (Car c : arrayList) {
            if (carPredicate.test(c)) {
                System.out.println(c);
            }
        }
    }




    public static void main(String[] args) {

        Car car1 = new Car("ford mustang", 110, 280);
        Car car2 = new Car("toyota supra", 90, 290);
        Car car3 = new Car("maserati m1", 120, 275);
        Car car4 = new Car("renault clio", 85, 260);
        Car car5 = new Car("seat ibiza", 105, 200);

        ArrayList<Car> arrayList = new ArrayList<>();

        arrayList.add(car1);
        arrayList.add(car2);
        arrayList.add(car3);
        arrayList.add(car4);
        arrayList.add(car5);

        CarInfo carInfo = new CarInfo();

        carInfo.testCar(arrayList, c -> c.maxSpeed>280);


    }
}





class Car {
    String model;
    int power;
    int maxSpeed;

    public Car(String model, int power, int maxSpeed) {
        this.model = model;
        this.power = power;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", power=" + power +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
