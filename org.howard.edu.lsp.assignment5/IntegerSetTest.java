package org.howard.edu.assignment5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class IntegerSetTest {

    @Test
    @DisplayName("Test case for clear method")
    public void testClear() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        set.clear();
        assertTrue(set.isEmpty(), "Set should be empty after clear");
    }

    @Test
    @DisplayName("Test case for length method")
    public void testLength() {
        IntegerSet set = new IntegerSet();
        assertEquals(0, set.length(), "Empty set should have length 0");
        set.add(1);
        assertEquals(1, set.length(), "Set with one item should have length 1");
    }

    @Test
    @DisplayName("Test case for equals method")
    public void testEquals() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set2.add(1);
        assertTrue(set1.equals(set2), "Sets with the same elements should be equal");
        set2.add(2);
        assertFalse(set1.equals(set2), "Sets with different elements should not be equal");
    }

    @Test
    @DisplayName("Test case for contains method")
    public void testContains() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        assertTrue(set.contains(1), "Set should contain the added element");
        assertFalse(set.contains(2), "Set should not contain an element that wasn't added");
    }

    @Test
    @DisplayName("Test case for largest method with exception handling")
    public void testLargest() {
        IntegerSet set = new IntegerSet();
        Exception exception = assertThrows(IntegerSetException.class, () -> set.largest());
        assertEquals("Set is empty", exception.getMessage(), "Exception message should be 'Set is empty'");
        
        set.add(3);
        set.add(5);
        set.add(1);
        assertEquals(5, set.largest(), "Largest element should be the maximum value in the set");
    }

    @Test
    @DisplayName("Test case for smallest method with exception handling")
    public void testSmallest() {
        IntegerSet set = new IntegerSet();
        Exception exception = assertThrows(IntegerSetException.class, () -> set.smallest());
        assertEquals("Set is empty", exception.getMessage(), "Exception message should be 'Set is empty'");
        
        set.add(3);
        set.add(5);
        set.add(1);
        assertEquals(1, set.smallest(), "Smallest element should be the minimum value in the set");
    }

    @Test
    @DisplayName("Test case for add method")
    public void testAdd() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        assertTrue(set.contains(1), "Set should contain the added element");
        set.add(1); // Try adding duplicate
        assertEquals(1, set.length(), "Set should not contain duplicates");
    }

    @Test
    @DisplayName("Test case for remove method")
    public void testRemove() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.remove(1);
        assertFalse(set.contains(1), "Set should not contain an element after it's removed");
    }

    @Test
    @DisplayName("Test case for union method")
    public void testUnion() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set1.union(set2);
        assertTrue(set1.contains(1) && set1.contains(2) && set1.contains(3), "Union should combine unique elements from both sets");
    }

    @Test
    @DisplayName("Test case for intersect method")
    public void testIntersect() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set1.intersect(set2);
        assertTrue(set1.contains(2) && set1.length() == 1, "Intersect should retain only common elements");
    }

    @Test
    @DisplayName("Test case for diff method")
    public void testDiff() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set1.diff(set2);
        assertTrue(set1.contains(1) && !set1.contains(2) && !set1.contains(3), "Diff should remove elements found in both sets");
    }

    @Test
    @DisplayName("Test case for isEmpty method")
    public void testIsEmpty() {
        IntegerSet set = new IntegerSet();
        assertTrue(set.isEmpty(), "Newly created set should be empty");
        set.add(1);
        assertFalse(set.isEmpty(), "Set with elements should not be empty");
    }

    @Test
    @DisplayName("Test case for toString method")
    public void testToString() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        assertEquals("[1, 2]", set.toString(), "toString should return elements in the correct format");
    }
}
