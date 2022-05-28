package lab_multithreading;

public class JavaApplication54 extends Thread{
    public void run()
    {
        try
        {
            System.out.println ("Thread " +
                    Thread.currentThread().getId() +
                    " is running");

        }
        catch (Exception e)
        {

            System.out.println ("Exception is caught");
        }
    }
    public static void main(String[] args) {

        for (int i=0; i<8; i++)
        {
            JavaApplication54 object = new JavaApplication54();
            object.start();
        }
    }
}
