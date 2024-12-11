package pers.siva.algorithms.merge.intervals;

import java.util.ArrayList;
import java.util.List;

public class SmartMergeIntervals {


    public List<int[]> mergeShifts(List<int[]> shifts, int maxTime) {
        if (shifts == null || shifts.isEmpty()) {
            return new ArrayList<>();
        }

        // Step 1: Create a timeline array
        int[] timeline = new int[maxTime + 1]; // Assuming time range is bounded

        // Mark start and end of each shift in the timeline
        for (int[] shift : shifts) {
            timeline[shift[0]]++;  // Increment at the start of the shift
            timeline[shift[1]]--; // Decrement at the end of the shift
        }

        // Step 2: Traverse the timeline to merge intervals
        List<int[]> mergedShifts = new ArrayList<>();
        int activeShifts = 0;
        int start = -1;

        for (int time = 0; time <= maxTime; time++) {
            activeShifts += timeline[time]; // Update the active shift count

            if (activeShifts > 0 && start == -1) {
                // Start of a new merged interval
                start = time;
            } else if (activeShifts == 0 && start != -1) {
                // End of the current merged interval
                mergedShifts.add(new int[]{start, time});
                start = -1;
            }
        }

        return mergedShifts;
    }

}