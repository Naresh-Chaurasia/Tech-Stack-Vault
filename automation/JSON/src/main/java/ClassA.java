// ClassA.java
public class ClassA {
    public ClassB methodA() {
        System.out.println("Method A in ClassA is called.");
        // Returning an instance of ClassB

        ClassB b = new ClassB();

        return b;
    }
}