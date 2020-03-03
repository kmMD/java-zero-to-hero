package ee.itcollage.level5;

import java.util.ArrayList;
import java.util.List;

public class Positives {

    // fix tests

    /**
     * returns only positives. zero is not positive
     * For example:
     * 1, -2, -3 => 1
     */
    public static List<Integer> analyze(List<Integer> integers){
        List<Integer> result = new ArrayList<Integer>();
        for(Integer number : integers) {
            if (number > 0) {
                result.add(number);
            }
        }
        return result;
    }
}
