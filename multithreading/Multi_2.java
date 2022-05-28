package multithreading;

class MultiThreadingDemo2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Current Thread ID: " + Thread.currentThread().getId());
    }
}
public class Multi_2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread obj2 = new Thread(new MultiThreadingDemo2());
            obj2.start();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Current THread id: " + Thread.currentThread().getId());
        }
    }
}
