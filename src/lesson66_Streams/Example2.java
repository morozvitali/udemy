package lesson66_Streams;

public class Example2 {
    public static void main(String[] args) {
        Thread myThread3 = new Thread(new MyThread3());
        Thread myThread4 = new Thread(new MyThread4());
        myThread4.start();
        myThread3.start();
    }
}


class MyThread3 implements Runnable {
    public void run () {
        for (int i = 0; i<1000; i++) {
            System.out.println("перший потік вивів цифру " + i);
        }
    }
}

class MyThread4 implements Runnable {
    public void run () {
        for (int i = 1000; i>0; i--) {
            System.out.println("другий потік вивів цифру " + i);
        }
    }
}
