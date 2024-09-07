package uk1.debug;

public class DebugExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int result = add(a, b);
        System.out.println("Result: " + result);
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }
}
