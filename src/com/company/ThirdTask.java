package com.company;

public class ThirdTask {

    static int sumFact(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++)
            sum += factorial((int) number.charAt(i) - (int) '0');
        return sum;
    }

    static int factorial(int n) {
        int product = 1;
        for (int i = n; i >= 1; i--) product *= i;
        return product;
    }

    // We don’t need to and we can’t search infinite numbers. One upperbound we can use is 9999999 as 7*9! is less than 9999999.
    public static int thirdTask() {
        int sum = 0;
        for (int i = 3; i <= 9999999; i++) {
            String n = Integer.toString(i);
            if (i == sumFact(n)) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of all the curious numbers : " + thirdTask() + "\n1 and 2 are not included in the solution");
    }
}
