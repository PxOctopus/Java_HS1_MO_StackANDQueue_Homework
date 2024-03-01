package com.cagri.Q1;

import java.util.Scanner;
import java.util.Stack;

public class TestQ1 {
    public static void main(String[] args) {

        Stack<String> wordStack = new Stack<>();

        System.out.println("Please type a word to add in!");
        String word = new Scanner(System.in).nextLine();

        for (int i = 0; i < word.length(); i++) {
            wordStack.push(String.valueOf(word.charAt(i)));
        }
        System.out.println(wordStack);
        StringBuilder reverseWordThroughStack = new StringBuilder();

        while (!wordStack.isEmpty()) {
            reverseWordThroughStack.append(wordStack.pop());
        }
        System.out.println(reverseWordThroughStack);

        if (reverseWordThroughStack.toString().equals(word)) {
            System.out.println("The word you entered is a palindrome.");
        } else {
            System.err.println("The word you entered is not a palindrome.");
        }
    }
}
