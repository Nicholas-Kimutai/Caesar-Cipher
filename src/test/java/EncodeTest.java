
import org.junit.Test;
import static org.junit.Assert.*;
public class EncodeTest {
    @Test
    public  void encode_onlyString_exception() throws Exception {
        //arrange
        Encode encode = new Encode();

        //act
        String actual = encode.encoding("1",1);

        //assert
        assertTrue(actual instanceof String);

    }

    @Test
    public void  encode_keyBoundaryLength_exception(){
        try {
            Encode encode = new Encode();
            String actual = encode.encoding("STEVE JOBS WAS ONE OF THE MOST VISIONARY TECH LEADERS",27);

        }catch (Exception ex){
            assertEquals("The key must be between 1 and 25",ex.getMessage());
        }

    }


}
