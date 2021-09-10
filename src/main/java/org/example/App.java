/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Uzair
 */

package org.example;
import java.text.DecimalFormat;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");

        System.out.print("What is the length of the room in feet? ");
        int length = checkNumber(scanner.nextLine());

        System.out.print("What is the width of the room in feet? ");
        int width = checkNumber(scanner.nextLine());

        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet. ");

        //calculations
        int areaFeet = length * width;
        double areaMetres = length * width * 0.09290304;
        System.out.println("The area is:\n" +
                areaFeet + " square feet\n" +
                df.format(areaMetres) + " square meters");


    }

    //only take numerical values
    private static boolean isNum(String input) {
        boolean isNum = true;
        try {
            Integer.parseInt(input);
        }
        catch(NumberFormatException e) {
            isNum = false;
        }
        return isNum;
    }

    private static int checkNumber(String inputStr)
    {
        Scanner scanner = new Scanner(System.in);
        String inputToCheck = inputStr;
        int input = 0;
        boolean completed = false;
        while(!completed) {
            if (isNum(inputToCheck)) {
                input = Integer.parseInt(inputToCheck);
                completed = true;
            }
            else {
                System.out.print("Error! Please insert digits only: ");
                inputToCheck = scanner.nextLine();
            }
        }
        return input;


    }
}
