import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sampletestTest {

    @Test
    void addtwonum(){

        sampletest sumofnum = new sampletest();
        assertEquals(4, sumofnum.add(2, 2));
    }

}
