
public class Main {
    public static void main(String[] args) {
        // Create an instance of ClassA and call the chain of methods
        ClassA classA = new ClassA();
        ClassB classB = classA.methodA(); // Calls methodA from ClassA and gets ClassB object
        ClassC classC = classB.methodB(); // Calls methodB from ClassB and gets ClassC object
        classC.methodC();                 // Calls methodC from ClassC

        new ClassA().methodA().methodB().methodC();

    }
}