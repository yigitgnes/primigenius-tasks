package com.company;

import java.math.BigInteger;

public class SecondTask {

    public static int mid(long d) {
        BigInteger sum = new BigInteger("0");
        long num = d;
        int sum1 = sum.intValue();
        while (num > 0) {
            sum1 += num % 10;
            num /= 10;
        }
        return sum1;
    }

    public static double secondTask(long N) {
        double result = 0;
        BigInteger i = new BigInteger(String.valueOf(N));
        for (double j = i.doubleValue(); j > 0; j--) {
            result = result + (j / mid((long) j));
        }
        return result;
    }

    public static void main(String[] args) {

        BigInteger N = new BigInteger("123456789");
        System.out.println(secondTask(N.longValue()));
    }


}
