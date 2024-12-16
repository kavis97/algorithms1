package pers.siva.algorithms.shuffle;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ShuffleArray {

    void randomInts(int end) {
        Random random = new Random();

        for (int i = end - 1; i > 0; i--) {
            int val = random.nextInt(i + 1);
            System.out.print(val + ":"+(i+1));
            System.out.print(",");
        }

    }

    static Integer[] usingStream() {
        return Stream.generate(() -> new Random().ints(0, 10))
                .flatMap(IntStream::boxed)
                .distinct()
                .limit(10) // whatever limit you might need
                .toArray(Integer[]::new);
    }

    public static void main(String[] args) {
        new ShuffleArray().randomInts(10);
//        for (int i : ints) {
//            System.out.print(i);
//        }

//        for (int i : usingStream()) {
//            System.out.print(i);
//        }
    }
}
