package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {        //main method
        System.out.printf("Enter your first mark: ");
        Scanner keyboard = new Scanner(System.in);
        double mark1 = keyboard.nextDouble();
        String mark1letter = markLetter(mark1);
        mark1 = checker(mark1);

        System.out.printf("Enter your second mark: ");
        double mark2 = keyboard.nextDouble();
        String mark2letter = markLetter(mark2);
        mark2 = checker(mark2);

        System.out.printf("Enter your third mark: ");
        double mark3 = keyboard.nextDouble();
        String mark3letter = markLetter(mark3);
        mark3 = checker(mark3);

        System.out.printf("Enter your fourth mark: ");
        double mark4 = keyboard.nextDouble();
        String mark4letter = markLetter(mark4);
        mark4 = checker(mark4);

        System.out.printf("Enter your fifth mark: ");
        double mark5 = keyboard.nextDouble();
        String mark5letter = markLetter(mark5);
        mark5 = checker(mark5);

        System.out.printf("Enter your sixth mark: ");
        double mark6 = keyboard.nextDouble();
        String mark6letter = markLetter(mark6);
        mark6 = checker(mark6);

        double averageMark = ((mark1 + mark2 + mark3 + mark4 + mark5 + mark6) / 6);
        String averageletter = markLetter(averageMark);
        System.out.printf("Your Average mark is %.1f%% which is a %s%n", averageMark, averageletter);
        System.out.printf("Your first mark is %.1f%% which is a %s%n", mark1, mark1letter);
        System.out.printf("Your second mark is %.1f%% which is a %s%n", mark2, mark2letter);
        System.out.printf("Your third mark is %.1f%% which is a %s%n", mark3, mark3letter);
        System.out.printf("Your fourth mark is %.1f%% which is a %s%n", mark4, mark4letter);
        System.out.printf("Your fifth mark is %.1f%% which is a %s%n", mark5, mark5letter);
        System.out.printf("Your sixth mark is %.1f%% which is a %s%n", mark6, mark6letter);
    }

    public static String markLetter(double mark) {      //making the marks into letters using a method
        if (mark <= 49) {
            return "E";
        } else if (mark <= 54) {
            return "D";
        } else if (mark <= 59) {
            return "D+";
        } else if (mark <= 64) {
            return "C";
        } else if (mark <= 69) {
            return "C+";
        } else if (mark <= 74) {
            return "B";
        } else if (mark <= 79) {
            return "B+";
        } else if (mark <= 89) {
            return "A";
        } else {
            return "A+";
        }
    }

    public static double checker(double mark) {     //making the checker method to see if it is between 0 and 100
        Scanner keyboard = new Scanner(System.in);
        for(int x = 1; x > 0;){
            if (mark > 100 || mark < 0) {
                System.out.printf("%n %f is not between 0 and 100, please re-enter: ", mark);
                mark = keyboard.nextDouble();
                x = 1;
            }
            else {
                x = 0;
            }
        }
            return mark;
        }
    }

