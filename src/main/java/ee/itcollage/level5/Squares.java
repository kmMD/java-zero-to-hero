package ee.itcollage.level5;

import java.util.ArrayList;
import java.util.List;

public class Squares {

    // fix tests

    /**
     * squares all numbers in a list, for example:
     * 1, 2, 3 => 1, 4, 9
     */
    public static List<Integer> square(List<Integer> integers){
        List<Integer> result = new ArrayList<Integer>();
        for (Integer integer : integers) {
            result.add(integer * integer);
        }
        return result;
    }
}
