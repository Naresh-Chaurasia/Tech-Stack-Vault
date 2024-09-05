

public class CustomThread {

    public void run(){


        Thread t1 = Thread.currentThread();
        String name1 = t1.getName();
        System.out.println(name1);

        System.out.println("I am inside run...");
    }

    
}
