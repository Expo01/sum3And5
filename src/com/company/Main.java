package com.company;

public class Main {

    public static void main(String[] args) {
        isDivisible();
    }

    public static void isDivisible() {
        int counter = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " is divisible by 3 and 5");
                counter++;
                sum += i;
            }
            if (counter >= 5) {
                System.out.println("sum is " + sum);
                break;
            }
        }
    }
}
