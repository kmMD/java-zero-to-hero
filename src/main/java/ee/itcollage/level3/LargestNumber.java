package ee.itcollage.level3;

import java.util.Collections;
import java.util.List;

public class LargestNumber {

    // make tests work

    public static int pickLargest(int x1, int x2){
        if (x1 >= x2) {
            return x1;
        }
        else {
            return x2;
        }
    }

    public static int pickLargest(int x1, int x2, int x3){
        List<Integer> numbers = List.of(x1, x2, x3);
        return Collections.max(numbers);
    }
}
