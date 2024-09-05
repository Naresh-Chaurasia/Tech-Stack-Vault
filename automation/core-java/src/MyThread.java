import java.lang.Thread;

public class MyThread {
    public static void main(String[] args) {

        Thread t1 = Thread.currentThread();
        String name = t1.getName();

        System.out.println(name);
        System.out.println("My Thread");


        CustomThread c = new CustomThread();
        c.display();
    }
}
