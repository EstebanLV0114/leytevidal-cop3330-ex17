package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

public class App
{
    public static void main( String[] args )
    {
        //Initialize Scanner
        Scanner scanner = new Scanner(System.in);

        //Declare Variables
        double ratio;
        int gender, alcohol, weight, time;

        System.out.print( "Enter a 1 if you are male or 2 if you are female: ");
        gender = scanner.nextInt();
        System.out.print("How many ounces of alcohol did you have? ");
        alcohol = scanner.nextInt();
        System.out.print("What is your weight, in pounds? ");
        weight = scanner.nextInt();
        System.out.print("How many hours has it been since your last drink? ");
        time = scanner.nextInt();

        System.out.println();

        //If Male
        if (gender == 1)
        {
            double BAC;
            ratio = 0.73;
            BAC = alcohol * 5.14 / weight * ratio;
            BAC = BAC - (.015 * time);
            System.out.println("Your BAC is " + BAC);

            if (BAC >= 0.08)
            {
                System.out.println("It is not legal for you to drive.");
            }
            else
            {
                System.out.println("It is legal for you to drive.");
            }
        }

        //If Female
        if (gender == 2)
        {
            double BAC;
            ratio = 0.66;
            BAC = (alcohol * 5.14) / (weight * ratio);
            BAC = BAC - (.015 * time);
            System.out.println("Your BAC is " + BAC);

            if (BAC >= 0.08)
            {
                System.out.println("It is not legal for you to drive.");
            }
            else
            {
                System.out.println("It is legal for you to drive.");
            }
        }
    }
}
