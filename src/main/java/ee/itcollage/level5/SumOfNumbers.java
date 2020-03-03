package ee.itcollage.level5;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

public class SumOfNumbers {

    // make tests work
    public static Integer sum(List<Integer> integerList) {
        if (CollectionUtils.isNotEmpty(integerList)) {
            // add gradle dependency for apache collectionutils and rewrite this condition with isNotEmpty
            Integer sum = 0;
            for(Integer integer : integerList) {
                sum += integer;
            }
            return sum;
        }
        else {
            return null;
        }
    }

}
