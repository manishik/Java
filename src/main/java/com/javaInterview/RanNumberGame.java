package com.javaInterview;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RanNumberGame {

    public static void main(String[] args) throws InterruptedException, IOException {
        startGame(1);
    }

    static void startGame(int digitCount) throws InterruptedException {
        BigInteger randomNumber = generateRandomNumber(BigInteger.valueOf(digitCount));
        System.out.println(digitCount + " Random Number generated = " + randomNumber);
        //Thread.sleep(3000);
        //System.out.println(System.lineSeparator().repeat(100));
        System.out.println("Enter the same random number generated");
        Scanner scanner = new Scanner(System.in);
        BigInteger inputNumber = scanner.nextBigInteger();
        System.out.println("Number entered = " + inputNumber);
        game(inputNumber, randomNumber, digitCount);
    }

    static void game(BigInteger inputNumber, BigInteger randomNumber, int digitCount) throws InterruptedException {
        if (inputNumber.equals(randomNumber)) {
            System.out.println("That's Correct");
            digitCount++;
            startGame(digitCount);
        } else {
            System.out.println("Wrong!");
            digitCount--;
            while (digitCount != 0) {
                startGame(digitCount);
            }
        }
    }

    static BigInteger generateRandomNumber(BigInteger digitCount) {
        BigInteger digits = BigInteger.valueOf(10);
        if (digitCount.equals(0) || digitCount.equals(1)) {
            digits = BigInteger.valueOf(10);
        } else {
            digits = BigDecimal.valueOf(Math.pow(digits.doubleValue(), digitCount.doubleValue())).toBigInteger();
        }
        return BigInteger.valueOf(ThreadLocalRandom.current().nextLong(digits.longValue()));
    }

}
