package pers.siva.algorithms.shuffle;

import java.util.Random;

public class ShuffleArray1 {
    public static void main(String args[]) {
        for (int j = 0; j < 1; j++) {
            int[] solutionArray = {1,2,3,4,5,6,7,8,9,10};

            shuffleArray(solutionArray);
            for (int i = 0; i < solutionArray.length; i++) {
                System.out.print(solutionArray[i] + " ");
            }
            System.out.println();
        }
    }

    // Implementing Fisher–Yates shuffle
    static void shuffleArray(int[] ar) {
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            System.out.print(index + ": " +(i+1));
            System.out.print(",");
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
}
