package lab_multithreading;

public class Demo1 extends Thread{
    public void run(){
        System.out.println("thread is running...");
    }
    public static void main(String args[]){
        Demo1 t1=new Demo1();
        t1.start();
    }
}
