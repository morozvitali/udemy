package lesson44_Supplier;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Terst3 {
        public static ArrayList <Car> createThreeCars (Supplier<Car> carSupplier) {
            ArrayList<Car> arrayList = new ArrayList<>();
            for (int i=0; i<3; i++) {
                arrayList.add(carSupplier.get());
            }
            return arrayList;
        }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("Nissan", "metallic", 1.2));
        System.out.println("Our cars is " + ourCars);
    }

}


class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
