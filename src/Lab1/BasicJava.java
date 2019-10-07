/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import java.util.Scanner;

/**
 * BasicJava
 Calculates next month interest after taking input from the user
 Author: Thanh Tran
 Date: September 19, 2018
 */

public class BasicJava {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // declare variables
        double bal; // variable declared for balance
        double iRate;   // variable declared for iRate
        double nxtMonthIRate;   // variable declared for the computation of next month's interest
    
        Scanner input = new Scanner(System.in);     // scanner input
        System.out.println ("Enter balance");       // ask the balance from the user
        bal = input.nextDouble();           //takes input and stores the value into bal
        
        System.out.println ("Enter interest rate");     // asks the user to enter an interest rate
        iRate = input.nextDouble();     //takes input and stores the value into iRate
        
        nxtMonthIRate = bal * (iRate / 1200);       // computes the next month interest rate and stores it into variable nxtMonthIRate
        
        // outputs the results to the user and ends the program
        System.out.println ("Next month interest is " + nxtMonthIRate);  
        System.out.println ("Thank you for using the program");

    }
    
}
