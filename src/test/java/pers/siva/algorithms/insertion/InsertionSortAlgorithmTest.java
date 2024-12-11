
package pers.siva.algorithms.insertion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InsertionSortAlgorithmTest {

    InsertionSortAlgorithm algorithm;

    @BeforeEach
    void setUp() {
        algorithm = new InsertionSortAlgorithm();
    }

    @Test
    void sortedArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] actual = algorithm.sort(array);
        Assertions.assertEquals(array.length, actual.length);
        Assertions.assertArrayEquals(array, actual);
    }

    @Test
    void unsortedArray() {
        int[] actual = algorithm.sort(new int[]{8, 5, 3, 6, 9, 2, 7, 4, 1});
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assertions.assertEquals(expected.length, actual.length);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void unsortedArray1() {
        int[] actual = algorithm.sort(new int[]{9, 2, 3, 4, 5, 6, 7, 8, 1});
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assertions.assertEquals(expected.length, actual.length);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void unsortedArrayContainsDuplicates() {
        int[] actual = algorithm.sort(new int[]{9, 2, 3, 3, 5, 6, 7, 7, 1});
        int[] expected = {1, 2, 3, 3, 5, 6, 7, 7, 9};
        Assertions.assertEquals(expected.length, actual.length);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void charsInArray() {
        int[] actual = algorithm.sort(new int[]{'A', 'B', 'F', 3, 5, 6, 7, 7, 1});
        int[] expected = {1, 3, 5, 6, 7, 7, 'A', 'B', 'F'};
        Assertions.assertEquals(expected.length, actual.length);
        Assertions.assertArrayEquals(expected, actual);
    }

}