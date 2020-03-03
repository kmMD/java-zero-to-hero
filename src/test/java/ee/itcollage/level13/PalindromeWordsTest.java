package ee.itcollage.level13;

import ee.itcollage.level11.Word;
import ee.itcollage.level11.WordFilter;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class PalindromeWordsTest {
    private List<String> strings = Arrays.asList("radar", "other", "mom", "dad", "lol", "jou");

    @Test
    public void getCorrectPalindromes() {
        AnalysisResult result = PalindromeWords.analyzePalindromes(strings);
        assertEquals(4, result.getPalidromes().size());
        assertEquals(List.of("radar", "mom", "dad", "lol"), result.getPalidromes());
        assertEquals(2, result.getOthers().size());
        assertEquals(List.of("other", "jou"), result.getOthers());
    }
}