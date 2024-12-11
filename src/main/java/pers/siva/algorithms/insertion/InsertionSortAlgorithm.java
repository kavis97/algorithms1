package pers.siva.algorithms.insertion;

public class InsertionSortAlgorithm {

    public int[] sort(int[] array) {
       for (int i = 1; i < array.length; i++) {
           int key = array[i];
           int j = i - 1;
           while (j >= 0 && array[j] > key) {
               array[j + 1] = array[j];
               j = j - 1;
           }
       }
        return array;
    }
}
