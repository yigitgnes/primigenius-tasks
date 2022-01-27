package com.company;

import java.math.BigInteger;

public class FifthTask {

    public static BigInteger ackermann(BigInteger a, BigInteger b) {
        BigInteger ans;
        if (a.equals(BigInteger.ZERO)) ans = b.add(BigInteger.ONE);
        else if (b.equals(BigInteger.ZERO)) ans = ackermann(a.subtract(BigInteger.ONE), BigInteger.valueOf(1));
        else ans = ackermann(a.subtract(BigInteger.ONE), ackermann(a, b.subtract(BigInteger.ONE)));
        return (ans);
    }

    public static void main(String[] args) {

        System.out.println(ackermann(BigInteger.valueOf(6), BigInteger.valueOf(6)));

    }
}