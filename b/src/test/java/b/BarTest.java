package b;


import a.Util;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BarTest {
	
    @Test
    public void testingStuff(){
        new Util().doNothing();
        assertTrue("Because", true);
    }

}