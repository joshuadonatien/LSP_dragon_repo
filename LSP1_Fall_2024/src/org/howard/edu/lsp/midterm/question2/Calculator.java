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

// This is the driver class to test the Calculator class
public class CalculatorDriver {
    public static void main(String[] args) {
        // Test adding two integers
        System.out.println(Calculator.sum(5, 10));  // Output: 15
        
        // Test adding two double numbers
        System.out.println(Calculator.sum(3.5, 7.8));  // Output: 11.3
        
        // Test adding up an array of integers
        System.out.println(Calculator.sum(new int[]{1, 2, 3, 4, 5}));  // Output: 15
    }
}
