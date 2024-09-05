

public class CustomThread extends Thread{
    public void run(){
        Thread t1 = Thread.currentThread();
        String name2 = t1.getName();
        
        System.out.println("name2="+name2);

        System.out.println("I am inside run...");
    }
}
