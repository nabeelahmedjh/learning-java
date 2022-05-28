package multithreading;


class MultiThreadingDemo extends Thread {
    private int threadNumber;
    public MultiThreadingDemo(int number) {
        this.threadNumber = number;
    }
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println(i + " From thread no: " + threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Multi_1 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            MultiThreadingDemo obj = new MultiThreadingDemo(i);
            obj.start();
        }

    }
}
