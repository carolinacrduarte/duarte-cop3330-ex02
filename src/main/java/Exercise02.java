/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carolina Duarte
 */

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String original = input.next();
        int stringLength = original.length();
        System.out.println();
        System.out.println(original+ " has " +stringLength+ " characters.");
    }

}
