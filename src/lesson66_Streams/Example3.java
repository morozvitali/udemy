package lesson66_Streams;

public class Example3 extends Thread {
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println("перший потік вивів цифру " + i);
        }
    }


    public static void main(String[] args) {
        Example3 thread3 = new Example3();
        thread3.start();

        for (int i = 1000; i>0; i--) {
            System.out.println("другий потік вивів цифру " + i);
        }

    }
}
