package lesson37_Static;

class Test {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(222);
        Car car = new Car("gr", 3, engine);
        // для статичного внутрішнього коасу не можна
        //створбвати двигун від обьєкту, ьіотки від класу
        //буде помилка
        //Car.Engine engine2 = new car.Engine;

    }
}


public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car (String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine {
        int hp;

        public Engine(int hp) {
            this.hp = hp;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "hp=" + hp +
                    '}';
        }
    }
}

