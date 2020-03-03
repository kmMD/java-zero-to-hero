package ee.itcollage.level13;

import java.util.ArrayList;
import java.util.List;

public class AnalysisResult {

    private List<String> palidromes = new ArrayList<String>();
    private List<String> others = new ArrayList<String>();

    public void addPalindrome(String palindrome) {
        this.palidromes.add(palindrome);
    }

    public void addOther(String other) {
        this.others.add(other);
    }

    public List<String> getOthers() {
        return others;
    }

    public List<String> getPalidromes() {
        return palidromes;
    }
}