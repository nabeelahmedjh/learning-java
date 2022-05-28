package lab_multithreading;

public class ThreadExcercise extends Thread{

    public void run() {
        try {

            System.out.println("Thread id: " + Thread.currentThread().getId());
        } catch(IllegalThreadStateException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ThreadExcercise t = new ThreadExcercise();
        for (int i = 0; i < 5; i++) {

            try {
                t.start();
                State aNew = State.NEW;
                State blocked = State.BLOCKED;
                State terminated = State.TERMINATED;
                State timedWaiting = State.TIMED_WAITING;
                t.start();
            } catch(IllegalThreadStateException e) {
                System.out.println(e);
            }

        }
    }
}
