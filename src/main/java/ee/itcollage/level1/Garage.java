package ee.itcollage.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Garage {

    private List<Ferrari> ferraries;

    public void setFerrari(Ferrari ferrari) {
        this.ferraries = new ArrayList<Ferrari>();
        this.ferraries.add(ferrari);
    }

    public void addFerrari(Ferrari ferrari) {
        this.ferraries.add(ferrari);
    }

    public void printFerraries() {
        for (Ferrari ferrari : this.ferraries) {
            System.out.println(ferrari);
        }
    }
}
