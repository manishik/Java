package com.javaInterview.topQuestions;

public class Palindrome {

    public static void main(String[] args) {
        int array[] = new int[]{1, 2, 3, 2, 1};
        String[] strArray = new String[]{"Manish", "Indudhar", "Keshav", "Indudhar", "Manish"};
        char charArray[] = new char[]{'b', 'a', 'z', 'a', 'b'};
        if (isPalindrome(strArray)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

		String str = "ManishsinaM";
		if (isPalindrome(str))
			System.out.print("Palindrome");
		else
			System.out.print("Not Palindrome");
	}

     static boolean isPalindrome(String[] array) {
        boolean palindrome = false;
        int i = array.length - 1;
        for (int j = 0; j <= i; j++, i--) {
            /*System.out.println("j = " + array[j]);
            System.out.println("i = " + array[i]);*/
            if (array[j] == array[i]) {
                palindrome = true;
            } else {
                palindrome = false;
                break;
            }
        }
        return palindrome;
    }

    static boolean isPalindrome(String str) {
        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;

        // While there are characters toc compare
        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }

        // Given string is a palindrome
        return true;
    }

}
