import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/** 
 * JUnit tests cases for the Morse Code assignment.
 * 
 * @author Vitaly Ford
 */ 
public class MorseTests {
    @Test
    public void dashDotDash() {
        ArrayList<String> decoded = Morse.decodeMorse("-.-");
        assertArrayEquals(new String[]{"k", "ta", "nt", "tet"}, decoded.toArray());
    }

    @Test
    public void dotDotDot() {
        ArrayList<String> decoded = Morse.decodeMorse("...");
        assertArrayEquals(new String[]{"eee", "ei", "ie", "s"}, decoded.toArray());
    }

    @Test
    public void dashDotDashDotDash() {
        ArrayList<String> decoded = Morse.decodeMorse("-.-.-");
        assertArrayEquals(new String[]{"tetet", "teta", "tent", "tek", "taet", "taa", "trt", "ntet", "nta", "nnt", "nk", "ket", "ka", "ct"}, decoded.toArray());
    }
}
