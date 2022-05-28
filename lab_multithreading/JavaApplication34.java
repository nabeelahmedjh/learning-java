package lab_multithreading;

public class JavaApplication34 extends Thread {
    public void run(){
        for(int i=0;i<5;i++){
            try{Thread.sleep(500);}
            catch(InterruptedException e){System.out.println(e);}
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        JavaApplication34 t1=new JavaApplication34();
        JavaApplication34 t2=new JavaApplication34();
        JavaApplication34 t3=new JavaApplication34();

        t1.start();
        t2.start();
        t3.start();
    }
}
