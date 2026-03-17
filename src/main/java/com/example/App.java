package com.example;

/**
 * Simple Java Application entry point.
 */
public class App {

    public static void main(String[] args) {
        System.out.println(getGreeting());

        Calculator calc = new Calculator();
        System.out.println("Calculator Demo:");
        System.out.println("  3 + 4 = " + calc.add(3, 4));
        System.out.println("  9 - 5 = " + calc.subtract(9, 5));
        System.out.println("  6 * 7 = " + calc.multiply(6, 7));
        System.out.println("  7 / 2 = " + calc.divide(7, 2));
    }

    public static String getGreeting() {
        return "Hello, World!";
    }
}
