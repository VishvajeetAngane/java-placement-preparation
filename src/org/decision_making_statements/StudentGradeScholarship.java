/*
 * Problem: Student Grade + Scholarship
 *
 * Write a Java program that reads the marks of a student in 5 subjects
 * and their attendance percentage.
 *
 * Calculate the student's percentage and assign a grade based on the
 * following criteria:
 *
 * Percentage     Grade
 * 90 - 100       A+
 * 80 - 89        A
 * 70 - 79        B
 * 60 - 69        C
 * 50 - 59        D
 * Below 50       F
 *
 * Scholarship Rules:
 *
 * 1. Grade A+ and attendance >= 90  -> 100% Scholarship
 * 2. Grade A  and attendance >= 85  -> 75% Scholarship
 * 3. Grade B  and attendance >= 80  -> 50% Scholarship
 * 4. Otherwise                       -> No Scholarship
 *
 * Important Rule:
 * If attendance is below 75%, the student is not eligible for a
 * scholarship regardless of their marks or grade.
 *
 * Input:
 * - Student name
 * - Marks in 5 subjects
 * - Attendance percentage
 *
 * Output:
 * - Student percentage
 * - Grade
 * - Scholarship status
 */


package org.decision_making_statements;

import java.util.Scanner;

public class StudentGradeScholarship {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========== WELCOME TO GRADE AND SCHOLARSHIP SYSTEM ==========");

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Java Marks: ");
        int java = sc.nextInt();

        System.out.print("Enter OS Marks: ");
        int os = sc.nextInt();

        System.out.print("Enter DBMS Marks: ");
        int dbms = sc.nextInt();

        System.out.print("Enter DSA Marks: ");
        int dsa = sc.nextInt();

        System.out.print("Enter CN Marks: ");
        int cn = sc.nextInt();

        System.out.print("Enter Your Attendance: ");
        int attendance = sc.nextInt();

        double percentage = (java + os + dbms + dsa + cn) / 5.0;

        String grade;
        String scholarship;

        System.out.println("\n================ SCORE CARD ================");

        // Check attendance eligibility first
        if (attendance < 75) {

            // Grade calculation
            if (percentage >= 90) {
                grade = "A+";
            }
            else if (percentage >= 80) {
                grade = "A";
            }
            else if (percentage >= 70) {
                grade = "B";
            }
            else if (percentage >= 60) {
                grade = "C";
            }
            else if (percentage >= 50) {
                grade = "D";
            }
            else {
                grade = "F";
            }

            scholarship = "Not Eligible - Attendance below 75%";

        }
        else {

            // Grade calculation
            if (percentage >= 90) {
                grade = "A+";

                if (attendance >= 90) {
                    scholarship = "100% Scholarship";
                }
                else {
                    scholarship = "No Scholarship";
                }

            }
            else if (percentage >= 80) {
                grade = "A";

                if (attendance >= 85) {
                    scholarship = "75% Scholarship";
                }
                else {
                    scholarship = "No Scholarship";
                }

            }
            else if (percentage >= 70) {
                grade = "B";

                if (attendance >= 80) {
                    scholarship = "50% Scholarship";
                }
                else {
                    scholarship = "No Scholarship";
                }

            }
            else if (percentage >= 60) {
                grade = "C";
                scholarship = "No Scholarship";

            }
            else if (percentage >= 50) {
                grade = "D";
                scholarship = "No Scholarship";

            }
            else {
                grade = "F";
                scholarship = "No Scholarship";
            }
        }

        System.out.println("Student Name  : " + name);
        System.out.printf("Percentage    : %.2f%%%n", percentage);
        System.out.println("Grade         : " + grade);
        System.out.println("Attendance    : " + attendance + "%");
        System.out.println("Scholarship   : " + scholarship);

        System.out.println("============================================");

        sc.close();
    }
}
