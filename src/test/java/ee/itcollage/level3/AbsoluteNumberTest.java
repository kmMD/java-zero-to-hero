package ee.itcollage.level3;

import org.junit.Test;

import static org.junit.Assert.*;

public class AbsoluteNumberTest {
    @Test
    public void positive_number_remains_positive() {
        assertEquals(3, AbsoluteNumber.makeAbsolute(3));
    }

    @Test
    public void negative_number_returns_positive() {
        assertEquals(3, AbsoluteNumber.makeAbsolute(-3));
    }

}
