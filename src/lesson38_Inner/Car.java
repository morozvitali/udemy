package lesson38_Inner;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
        //this.engine = engine;
    }

    public void setEngine (Engine engine) {
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

    class Engine {
        private int hp;

        public Engine (int hp) {
            System.out.println(doorCount);
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

