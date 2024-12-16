package pers.siva.algorithms.substring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

class SubStringFinderTest {

    SubStringFinder subStringFinder;

    @BeforeEach
    void setUp() {
        subStringFinder = new SubStringFinder();
    }

    @Test
    void testMatching() {
        Map<String, Integer> match = subStringFinder.findSubStrings("alphabet", "a1phab3t");
        Assertions.assertEquals(1, match.get("phab"));
        Assertions.assertEquals(1, match.get("hab"));
        Assertions.assertEquals(1, match.get("ph"));
        Assertions.assertEquals(1, match.get("ha"));
        Assertions.assertEquals(1, match.get("ab"));
        Assertions.assertEquals(1, match.get("b"));
        Assertions.assertEquals(1, match.get("p"));
        Assertions.assertEquals(1, match.get("h"));
        Assertions.assertEquals(1, match.get("b"));
        Assertions.assertEquals(1, match.get("t"));
        Assertions.assertEquals(2, match.get("a"));
    }

    @Test
    void testNonMatching() {
        Map<String, Integer> match = subStringFinder.findSubStrings("siva", "gentle");
        Assertions.assertEquals(0, match.size());
    }
    
}