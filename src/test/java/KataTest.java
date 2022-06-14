import gravityFlip.Kata;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class KataTest {
    @Test
    public void Sample() {
        assertArrayEquals(new int[]{ 1,2,2,3 }, Kata.flip('R', new int[]{ 3,2,1,2 }));
        assertArrayEquals(new int[]{ 5,5,4,3,1 }, Kata.flip('L', new int[]{ 1,4,5,3,5 }));
    }
}