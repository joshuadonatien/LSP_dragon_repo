package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.List;

/**
 * IntegerSet represents a set of unique integers using an ArrayList to store elements.
 */
public class IntegerSet {
    private List<Integer> set = new ArrayList<Integer>();

    /**
     * Default constructor for an empty IntegerSet.
     */
    public IntegerSet() {
    }

    /**
     * Constructor that accepts an already initialized list.
     * @param set ArrayList of integers to initialize the set.
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    /**
     * Clears all elements from the set.
     */
    public void clear() {
        set.clear();
    }

    /**
     * Returns the number of elements in the set.
     * @return int - the size of the set.
     */
    public int length() {
        return set.size();
    }

    /**
     * Checks if the provided object is equal to this set.
     * @param o Object to compare with.
     * @return boolean - true if sets are equal, otherwise false.
     */
    public boolean equals(Object o) {
        if (o instanceof IntegerSet) {
            IntegerSet otherSet = (IntegerSet) o;
            return set.containsAll(otherSet.set) && otherSet.set.containsAll(set);
        }
        return false;
    }

    /**
     * Checks if the set contains a specific value.
     * @param value integer to check.
     * @return boolean - true if value is in the set, otherwise false.
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Returns the largest element in the set.
     * @return int - the largest integer in the set.
     */
    public int largest() {
        int max = set.get(0);
        for (int i : set) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    /**
     * Returns the smallest element in the set.
     * @return int - the smallest integer in the set.
     */
    public int smallest() {
        int min = set.get(0);
        for (int i : set) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    /**
     * Adds an integer to the set if it is not already present.
     * @param item integer to add.
     */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    /**
     * Removes an integer from the set if it is present.
     * @param item integer to remove.
     */
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    /**
     * Combines the elements of this set with another set (union).
     * @param intSetb IntegerSet to union with.
     */
    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            if (!set.contains(item)) {
                set.add(item);
            }
        }
    }

    /**
     * Retains only the elements that are present in both sets (intersection).
     * @param intSetb IntegerSet to intersect with.
     */
    public void intersect(IntegerSet intSetb) {
        set.removeIf(item -> !intSetb.set.contains(item));
    }

    /**
     * Removes elements that are present in the given set (difference).
     * @param intSetb IntegerSet to subtract from this set.
     */
    public void diff(IntegerSet intSetb) {
        set.removeIf(intSetb.set::contains);
    }

    /**
     * Checks if the set is empty.
     * @return boolean - true if the set is empty, otherwise false.
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Returns a string representation of the set.
     * @return String - the elements of the set in a string format.
     */
    public String toString() {
        return set.toString();
    }
}
