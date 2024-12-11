package pers.siva.algorithms.merge.intervals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeIntervalsTest {
    MergeIntervals mergeIntervals;

    @BeforeEach
    void setUp() {
        mergeIntervals = new MergeIntervals();
    }

    @Test
    void nullIntervals() {
        assertEquals(0, mergeIntervals.merge(null).size());
    }

    @Test
    void emptyIntervals() {
        assertEquals(0, mergeIntervals.merge(new Interval[]{}).size());
    }

    @Test
    void validIntervals() {

        Interval[] intervals = new Interval[]{
                new Interval(10, 12),
                new Interval(8, 10),
                new Interval(14, 18)
        };
        Interval interval1 = new Interval(8, 12);
        Interval interval2 = new Interval(14, 18);


        List<Interval> merged = mergeIntervals.merge(intervals);
        assertEquals(2, merged.size());
        assertEquals(interval1, merged.get(0));
        assertEquals(interval2, merged.get(1));


    }
}
