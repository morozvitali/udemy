package lesson73_Wait_Notify;

public class WaitNotifyExample {
    public static void main(String[] args) {
        Market market =  new Market();
        Producer producer = new Producer(market);
        Customer customer = new Customer(market);
        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(customer);
        thread1.start();
        thread2.start();

    }
}

class Market {
    private int breadCount = 0;

    public synchronized void getBread() {
        while (breadCount <1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount--;
        System.out.println("Користувач купив 1 хліб");
        System.out.println("Кількість здіба що щалишився в магазині" + breadCount);
        notify();
    }

    public synchronized void putBread () {
        while (breadCount >=5) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount++;
        System.out.println("Виготавлювач додав на вітрину ще 1 хліб");
        System.out.println("Кількість здіба що щалишився в магазині" + breadCount);
        notify();
    }
}

    class Producer implements Runnable {
        Market market;
        Producer(Market market) {
            this.market = market;
        }
        public void run () {
            for (int i = 0; i<=10; i++) {
                market.putBread();
            }
        }
    }

class Customer implements Runnable {
    Market market;
    Customer(Market market) {
        this.market = market;
    }
    public void run () {
        for (int i = 0; i<=10; i++) {
            market.getBread();
        }
    }
}