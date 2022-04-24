import org.junit.Test;
import static org.junit.Assert.*;

public class DecodeTest {
    @Test
    public  void  decode_notNull_Exception(){
        Decode decode = new Decode();
        assertNotNull(decode);
    }
}
