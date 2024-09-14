// ClassB.java
public class ClassB {
    public ClassC methodB() {
        System.out.println("Method B in ClassB is called.");
        // Returning an instance of ClassC
        return new ClassC();
    }
}