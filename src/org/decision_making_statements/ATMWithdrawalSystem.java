/*
 * Problem: ATM Withdrawal System
 *
 * Write a Java program to simulate a simple ATM withdrawal system.
 *
 * The program should take the following inputs:
 * - Account holder name
 * - Account balance
 * - Withdrawal amount
 * - PIN
 *
 * Rules:
 *
 * 1. The user must enter the correct PIN.
 *    - Correct PIN  -> Continue with the withdrawal process.
 *    - Incorrect PIN -> Display "Invalid PIN".
 *
 * 2. The withdrawal amount must be greater than 0.
 *    - If the amount is 0 or negative, display "Invalid Withdrawal Amount".
 *
 * 3. The withdrawal amount must be a multiple of 100.
 *    - Otherwise, display "Enter Amount multiple of 100".
 *
 * 4. The withdrawal amount must not exceed the available account balance.
 *    - Otherwise, display "Insufficient balance".
 *
 * 5. The maximum withdrawal allowed per transaction is ₹25,000.
 *    - If the amount exceeds ₹25,000, display "Daily Withdrawal Limit 25000".
 *
 * 6. If all conditions are satisfied:
 *    - Deduct the withdrawal amount from the account balance.
 *    - Display "Withdrawal Successful".
 *    - Display the remaining balance.
 *
 * Example:
 *
 * Input:
 * Account Balance: ₹50,000
 * Withdrawal Amount: ₹15,000
 * PIN: 1234
 *
 * Output:
 * Withdrawal Successful
 * Remaining Balance: ₹35,000
 */

package org.decision_making_statements;

import java.util.Scanner;

public class ATMWithdrawalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int password = 1234;

        System.out.print("Enter Account Holder Name: ");
        String name = sc.next();

        System.out.print("Enter Account Balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter Withdrawal Amount: ");
        int withdrawal = sc.nextInt();

        System.out.print("Enter Pin: ");
        int pin = sc.nextInt();

        if(pin == password) {
            if(withdrawal > 0) {
                if(withdrawal % 100 == 0) {
                    if(balance >= withdrawal) {
                        if(withdrawal <= 25000) {
                            balance -= withdrawal;
                            System.out.println("Withdrawal Successful...");
                            System.out.println("Remaning Balance: " + balance);
                        }
                        else {
                            System.out.println("Daily Withdrawal Limit 25000");
                        }
                    }
                    else {
                        System.out.println("Insufficient balance");
                    }
                }
                else {
                    System.out.println("Enter Amount multiple of 100");
                }
            }
            else {
                System.out.println("Invalid Withdrawal Amount");
            }
        }
        else {
            System.out.println("Invalid Pin");
        }
    }
}
