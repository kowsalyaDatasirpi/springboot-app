import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sampleTestTest {

    @Test
    void addtwonum(){

        sampleTest sumofnum = new sampleTest();
        assertEquals(12, sumofnum.add(4, 3));
    }

}
