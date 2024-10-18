package org.howard.edu.lsp.midterm.question2;

//This is the driver class to test the Calculator class
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

