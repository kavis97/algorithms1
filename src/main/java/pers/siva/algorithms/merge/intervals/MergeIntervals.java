package pers.siva.algorithms.merge.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

    public List<Interval> merge(Interval[] intervals) {
        if (intervals == null || intervals.length == 0) {
            return List.of();
        }
        // sort intervals by start
        Arrays.sort(intervals, Comparator.comparingInt(Interval::start));
        List<Interval> mergedIntervals = new ArrayList<>();
        // merge intervals.

        for (int i = 1; i < intervals.length; i++) {
            Interval prev = intervals[i - 1];
            Interval curr = intervals[i];
            if (prev.end() >= curr.start()) {
                mergedIntervals.add(new Interval(prev.start(), curr.end()));
            } else {
                mergedIntervals.add(curr);
            }

        }

        return mergedIntervals;
    }


}
