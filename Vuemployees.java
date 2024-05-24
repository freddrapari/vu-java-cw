/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vu.vuemployees;

/**
 *
 * @author hp
 */
public class Vuemployees {
    public class VU {
    public static void calculatePay(double basePay, int hoursWorked) {
        if (basePay < 40000) {
            System.out.println("Error: Base pay must be at least UGX40,000 per hour.");
            return;
        }
        if (hoursWorked > 60) {
            System.out.println("Error: An employee cannot work more than 60 hours in a week.");
            return;
        }
        
        double totalPay;
        if (hoursWorked <= 40) {
            totalPay = basePay * hoursWorked;
        } else {
            totalPay = (40 * basePay) + ((hoursWorked - 40) * basePay * 1.5);
        }
        
        System.out.printf("Total pay for %.2f base pay and %d hours worked: UGX%.2f\n", basePay, hoursWorked, totalPay);
    }
    
    public static void main(String[] args) {
        calculatePay(28000.00, 35); // Employee A
        calculatePay(35000.00, 45); // Employee B
        calculatePay(38000.00, 75); // Employee C
    }
}

}
    

   
