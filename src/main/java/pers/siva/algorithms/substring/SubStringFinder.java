package pers.siva.algorithms.substring;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SubStringFinder {
    Map<String, Integer> findSubStrings(String str1, String str2) {
        Map<String, Integer> map =
                splitToStrings(str1)
                        .stream().collect(Collectors.toMap(k -> k, v -> 0, (f, s) -> f));
        for (String s : splitToStrings(str2)) {
            map.computeIfPresent(s, (k, v) -> v + 1);
        }
        return map.entrySet().stream()
                .filter(e -> e.getValue() > 0)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    List<String> splitToStrings(String str) {
        List<String> result = new ArrayList<>();
        split(str, 0, result);
        return result;
    }

    private void split(String str, int start, List<String> accumulator) {
        if (str.length() == start) {
            return;
        }
        split1(str.substring(start), accumulator);
        start = start + 1;
        split(str, start, accumulator);
    }

    void split1(String str, List<String> accumulator) {
        if (str.length() == 0) {
            return;
        }
        accumulator.add(str);
        split1(str.substring(0, str.length() - 1), accumulator);
    }
}
