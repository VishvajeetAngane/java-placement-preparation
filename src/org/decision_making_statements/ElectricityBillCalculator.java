/*
 * Problem: Electricity Bill Calculator
 *
 * Write a Java program to calculate the electricity bill based on units consumed.
 *
 * Units        Rate
 * 0-100        ₹2/unit
 * 101-200      ₹3/unit
 * 201-300      ₹5/unit
 * Above 300    ₹7/unit
 *
 * Additional Rules:
 * 1. If the total bill exceeds ₹2000, add a 10% surcharge.
 * 2. If the total bill exceeds ₹5000, add an additional 5% surcharge.
 * 3. If the number of units is negative, display "Invalid Input".
 *
 * Input:
 * - Owner name
 * - Units consumed
 *
 * Output:
 * - Owner name
 * - Units consumed
 * - Bill amount
 * - Surcharge
 * - Final bill
 *
 * Concepts Used:
 * - Scanner
 * - if-else-if ladder
 * - Nested if
 * - Logical operators
 * - Arithmetic operators
 */

package org.decision_making_statements;

import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER OWNER NAME: ");
        String name = sc.nextLine();

        System.out.print("ENTER CONSUMED UNITS: ");
        int units = sc.nextInt();

        double bill = 0;
        double surcharge = 0;

        if(units >= 0 && units <= 100) {
            bill = units * 2;
        }
        else if(units >= 101 && units <= 200) {
            bill = units * 3;
        }
        else if(units >= 201 && units <= 300) {
            bill = units * 5;
        }
        else if(units >= 301) {
            bill = units * 7;
        }
        else {
            System.out.println("Invalid Input");
            sc.close();
            return;
        }
        if(bill > 2000) {
            surcharge = bill*0.10;

            if(bill > 5000) {
                surcharge += bill * 0.05;
            }
        }

        double finalBill = bill + surcharge;

        System.out.println("============================Electricity Bill=========================");
        System.out.println("Holder Name: " + name);
        System.out.println("Units consumed: " + units);
        System.out.println("Bill Amount: " + bill);
        System.out.println("Surcharge: " + surcharge);
        System.out.println("=====================================================================");
        System.out.println("Final Bill: " + finalBill);

        sc.close();
    }
}
