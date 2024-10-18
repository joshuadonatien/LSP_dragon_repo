package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

//This is the driver class to test the MapUtilities class
public class MapUtilitiesDriver {
 public static void main(String[] args) {
     // Make the first map and add some key-value pairs
     HashMap<String, String> map1 = new HashMap<>();
     map1.put("Alice", "Healthy");
     map1.put("Mary", "Ecstatic");
     map1.put("Bob", "Happy");
     map1.put("Chuck", "Fine");
     map1.put("Felix", "Sick");

     // Make the second map and add some key-value pairs
     HashMap<String, String> map2 = new HashMap<>();
     map2.put("Mary", "Ecstatic");
     map2.put("Felix", "Healthy");
     map2.put("Ricardo", "Superb");
     map2.put("Tam", "Fine");
     map2.put("Bob", "Happy");

     // Call the method to find common key-value pairs and print the result
     int commonPairs = MapUtilities.commonKeyValuePairs(map1, map2);
     System.out.println("Number of common key-value pairs: " + commonPairs);  // Output: 2
 }
}
