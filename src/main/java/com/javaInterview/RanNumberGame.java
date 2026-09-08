package com.javaInterview;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RanNumberGame {

    public static void main(String[] args) throws InterruptedException {
        try (Scanner scanner = new Scanner(System.in)) {
            startGame(scanner);
        }
    }

    static void startGame(Scanner scanner) throws InterruptedException {
        int digitCount = 1;

        while (true) {
            BigInteger randomNumber = generateRandomNumber(digitCount);
            String displayedNumber = digitCount + " digit random number : " + randomNumber;

            System.out.print("Remember this " + displayedNumber);
            System.out.flush();
            Thread.sleep(digitCount > 5 ? 6000 : 3000);

            // Clear the displayed number and move the cursor back to the start.
            System.out.println("\r" + " ".repeat(displayedNumber.length()) + "\r");
            System.out.print("Enter the same random number : ");

            while (!scanner.hasNextBigInteger()) {
                if (!scanner.hasNext()) {
                    System.out.println("Game ended.");
                    return;
                }
                System.out.println("Please enter a whole number:");
                scanner.next();
            }

            BigInteger inputNumber = scanner.nextBigInteger();
            if (inputNumber.equals(randomNumber)) {
                System.out.println("That's Correct!");
                digitCount++;
            } else {
                System.out.println("Wrong! The number was " + randomNumber + ".");
                digitCount = Math.max(1, digitCount - 1);
            }
        }
    }

    static BigInteger generateRandomNumber(int digitCount) {
        StringBuilder number = new StringBuilder(digitCount);
        number.append(ThreadLocalRandom.current().nextInt(1, 10));

        for (int i = 1; i < digitCount; i++) {
            number.append(ThreadLocalRandom.current().nextInt(10));
        }

        return new BigInteger(number.toString());
    }

}
