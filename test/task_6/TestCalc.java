package task_6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Anna on 08.11.2015.
 */
public class TestCalc {
    @Test
    public void testAdd() {
        Calc c = new Calc();
        int res = c.add(2, 5);
        assertTrue(res == 7);
        assertEquals(7, res);

    }
}
