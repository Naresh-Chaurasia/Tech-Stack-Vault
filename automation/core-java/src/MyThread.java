import java.lang.Thread;

public class MyThread {
    public static void main(String[] args) {

        Thread t1 = Thread.currentThread();
        String name1 = t1.getName();
        System.out.println(name1);


        System.out.println("My Main Thread");


        CustomThread c = new CustomThread();
        c.run();
    }
}
