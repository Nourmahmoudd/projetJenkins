package tn.example.projetjenkins;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Jenkins!");
        Calculator calc = new Calculator();
        System.out.println("2 + 3 = " + calc.add(2, 3));
    }
}

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}
