/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Gabrielle Jackson
 */

//this program computes the value of an investment compounded over time
import java.util.Scanner;
public class ex13{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        //asks the user for amounts
        System.out.print("What is the principal amount? ");
            int P = input.nextInt();

         System.out.print("What is the rate? ");
            double r = input.nextDouble();

           System.out.print("What is the number of years? ");
            int t = input.nextInt();

         System.out.print("What is the number of times the interest is compounded per year? ");
            int n = input.nextInt();

        //calculates the compound interest
        double A = P*Math.pow(1+((r*0.01)/n),n*t);
        
        // Print the user entered data and calculated data
        System.out.printf("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.\n",P, r, t, n, A);

    }//end of main
}//end of class