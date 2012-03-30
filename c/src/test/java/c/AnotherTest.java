package c;

import a.Util;
import b.UtilsFromB;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AnotherTest {

    @Test
    public void testTheStuff(){
        new UtilsFromB().doMoreThenNothing();
        new Util().doNothing();
        assertTrue(true);
    }
}
