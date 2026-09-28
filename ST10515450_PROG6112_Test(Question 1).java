/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consolereport;

/**
 *
 * @author Arehone Makugo
 */
    

    //Questin 1

    public class ConsoleReport {
    public static void main(String[] args) {

     
        
        // This is the  Single-dimensional array for the cities 
        
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};

        // This is the two-dimensional array for the sales data 
        
        int[][] sales = {
            {1000, 2000, 3000}, // Row 0: Cape Town
            {2000, 3000, 4000}, // Row 1: Port Elizabeth
            {1500, 1100, 1200}  // Row 2: Pretoria
        };

        //  This is the Single-dimensional array to store the totals calculated later
        int[] cityTotals = new int[3];

        //the  variables that determines for the highest sales logic
        int highestSales = 0;
        String topCity = "";


        
        
        System.out.println("==================================================");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("==================================================");
        
        // Column headers, each column is 20 spaces wide so numbers line up straight
        System.out.printf("%-20s%-20s%-20s%-20s%n", "CITY", "PS5", "XBOX", "SWITCH");

        // Loop for  rows which represents the cities
        for (int row = 0; row < sales.length; row++) {
            
            // Print the city name, left-aligned in a 20-space column
            System.out.printf("%-20s", cities[row]);
        
            for (int col = 0; col < sales[row].length; col++) {
                // Print each number, right-aligned in a 20-space column
                System.out.printf("%-20d", sales[row][col]);
            }
            System.out.println();
        }


       
        //  A loop which  goes through each city 
        for (int row = 0; row < sales.length; row++) {
            
            // It  Resets the  sum for each new city
            int rowSum = 0; 

            for (int col = 0; col < sales[row].length; col++) {
                rowSum = rowSum + sales[row][col]; 
            }

            // IIt Stores  the calculated total in our 1D array
            cityTotals[row] = rowSum;

            if (rowSum > highestSales) {
                highestSales = rowSum;      
                topCity = cities[row];
            }
        }


       
        System.out.println("==================================================");
        System.out.println("Console Sales Totals For Each City");
        System.out.println("==================================================");

        // Print the totals in the same aligned columns
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s%-20d%n", cities[i], cityTotals[i]);
        }

        System.out.println("==================================================");
        
        System.out.println("City with the most sales: " + topCity);
        System.out.println("===================================================");
    }
}
