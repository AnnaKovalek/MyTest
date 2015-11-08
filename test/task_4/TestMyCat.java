package task_4;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Anna on 08.11.2015.
 */
public class TestMyCat {
    @Test
    public void test (){
      MyCat my=new MyCat();
       assertEquals(6,my.age);
        assertEquals("vasya",my.name);
        assertEquals("white",my.color);
        assertNotNull (my);
    }




}
