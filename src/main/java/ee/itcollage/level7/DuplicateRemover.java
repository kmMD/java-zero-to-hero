package ee.itcollage.level7;

import java.util.ArrayList;
import java.util.List;

public class DuplicateRemover {

    //todo fix tests
    public static List<Integer> removeDuplicates(List<Integer> numbers){
        List<Integer> result = new ArrayList<Integer>();
        for(Integer integer : numbers) {
            if (!result.contains(integer)) {
                result.add(integer);
            }
        }

        return result;
    }
}
