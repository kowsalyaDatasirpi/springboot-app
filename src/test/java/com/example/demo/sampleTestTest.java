import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sampleTestTest {

    @Test
    void addtwonum(){

        sampleTest sumofnum = new sampleTest();
        assertEquals(4, sumofnum.add(2, 2));
    }

}
