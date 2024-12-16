package pers.siva.algorithms;

public class DivideAndConquerTwoWay {

    public int findMax(int[] elements) {
        return findMax(0, elements.length - 1, elements);
    }

    private int findMax(int i, int j, int[] elements) {
        if (i == j) {
            return elements[i];
        }
        int mid = (i + j) / 2;

        return Integer.max(
                findMax(i, mid, elements),
                findMax(mid + 1, j, elements)
        );
    }
}
