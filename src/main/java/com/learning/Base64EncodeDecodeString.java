package com.learning;

import java.util.Base64;

public class Base64EncodeDecodeString {

    public static void main(String[] args) {

        String originalStringInput = "Manish K I";
        String encodedString = Base64.getEncoder().encodeToString(originalStringInput.getBytes());

        String encodedStringWithoutPadding = Base64.getEncoder().withoutPadding().encodeToString(originalStringInput.getBytes());

        System.out.println("Original String: " + originalStringInput);
        System.out.println("Encoded String: " + encodedString);
        System.out.println("Encoded String Without Padding: " + encodedStringWithoutPadding);

        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);

        System.out.println("Decoded String: " + decodedString);

    }
}
