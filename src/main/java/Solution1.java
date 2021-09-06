import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Patrick Brookshire
 */

public class Solution1{

    public static void main(String[] agrs) {

        String studentName;

        System.out.println("What is your name?");

        Scanner input = new Scanner (System.in);
        studentName = input.next();

        System.out.print("Hello, ");
        System.out.print(studentName);
        System.out.print(", nice to meet you!");
    }
}