package test_5;



import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class TestCut {


    @Test
    public void testCutFalse() {
        Cut cut=new Cut(false);
        assertEquals(cut.isFull(),false);
    }
    @Test
    public void testCutTrue (){
       Cut cut=new Cut(true);
        assertTrue(cut.isFull());
    }

}
