import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Adv_HW_91Test {

    @org.testng.annotations.Test
    public void testAbbriv() {
        assertEquals(Adv_HW_91.abbriv("Kukushka", 3), "Kuk.");
    }
    @Test
    public void testAbbriv2(){
        assertEquals(Adv_HW_91.abbriv("Sergey", 4), "Serg.");
    }
}