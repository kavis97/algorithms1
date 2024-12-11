package pers.siva.algorithms.merge.intervals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SmartMergeIntervalsTest {
    SmartMergeIntervals smartMergeIntervals;

    @BeforeEach
    void setUp() {
        smartMergeIntervals = new SmartMergeIntervals();
    }

    @Test
    void merge() {
        List<int[]> shifts = new ArrayList<>();
        shifts.add(new int[]{0, 12}); // Bakery
        shifts.add(new int[]{12, 14}); // Checkout
        shifts.add(new int[]{15, 19}); // Dairy

        // Assuming the maximum time in the day is 24 (or dynamic max)
        int maxTime = 24;

        // Merge the shifts
        List<int[]> mergedShifts = smartMergeIntervals.mergeShifts(shifts, maxTime);
        Interval interval1 = new Interval(00, 14);
        Interval interval2 = new Interval(15, 19);

        assertEquals(2, mergedShifts.size());
        assertEquals(interval1, new Interval(mergedShifts.get(0)[0], mergedShifts.get(0)[1]));
        assertEquals(interval2, new Interval(mergedShifts.get(1)[0], mergedShifts.get(1)[1]));

    }
}