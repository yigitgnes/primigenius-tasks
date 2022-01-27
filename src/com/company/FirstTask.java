package com.company;

public class FirstTask {

    public static double firstTask(double num) {

        double squares = 0, sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
            squares += Math.pow(i, 2);
        }
        num = Math.pow(sum, 2) - squares;
        return num;
    }
    public static void main(String[] args) {

         System.out.println("First Task Answer is : "+ firstTask(10));
    }
}
