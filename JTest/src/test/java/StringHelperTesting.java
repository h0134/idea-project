
import org.junit.Test;
import static org.junit.Assert.*;

public class StringHelperTesting {

    @Test
    public void test(){
        StringHelper helper = new StringHelper();
        String actual=helper.truncateAInFirst2Positions("AZ" );
        String expected ="Z";
        assertEquals(expected,actual);

        //       assertEquals("ABC","ABC");
//        assertEquals("ABCD","ABC");
    }
}

