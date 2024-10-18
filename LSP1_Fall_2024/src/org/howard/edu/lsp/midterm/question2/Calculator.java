package org.howard.edu.lsp.midterm.question2;

public class Calculator {
    
    // This adds two integers
    public static int sum(int a, int b) {
        return a + b;  // Just add the numbers and return
    }
    
    // This adds two double numbers
    public static double sum(double a, double b) {
        return a + b;  // Add the doubles and return
    }

    // This adds up all the numbers in an array
    public static int sum(int[] numbers) {
        int total = 0;  // Start with 0
        for (int number : numbers) {  // Go through each number in the array
            total += number;  // Add each number to total
        }
        return total;  // Return the total sum
    }
}

