package pers.siva.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DivideAndConquerTwoWayTest {

    DivideAndConquerTwoWay divideAndConquerTwoWay;

    @BeforeEach
    void setUp() {
        divideAndConquerTwoWay = new DivideAndConquerTwoWay();
    }

    @Test
    void search() {
        int elements[] = {5, 1, 9, 3, 4, 5, 6};
        Assertions.assertEquals(9, divideAndConquerTwoWay.findMax(elements));
    }
}