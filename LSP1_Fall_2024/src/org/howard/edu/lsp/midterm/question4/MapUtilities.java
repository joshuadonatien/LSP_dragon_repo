package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

public class MapUtilities {
    
    /**
     * This method checks how many key-value pairs are the same in two HashMaps.
     * @param map1 The first map
     * @param map2 The second map
     * @return The number of key-value pairs that are the same in both maps
     */
    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
        // If either map is empty, return 0
        if (map1.isEmpty() || map2.isEmpty()) {
            return 0;  // No common pairs if a map is empty
        }

        int count = 0;  // Start with no common pairs

        // Go through all the keys in the first map
        for (String key : map1.keySet()) {
            // Check if the second map has the same key and value
            if (map2.containsKey(key) && map1.get(key).equals(map2.get(key))) {
                count++;  // If both the key and value are the same, increase the count
            }
        }

        return count;  // Return how many key-value pairs are the same
    }
}



