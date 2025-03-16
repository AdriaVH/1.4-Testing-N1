package ex3;

import org.ex3.classes.ThrowsIndexOutBounds;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ThrowsIndexOutBoundsTest {

    @Test
    void testArrayIndexOutOfBoundsException() {
        ThrowsIndexOutBounds throwsIndexOutBounds = new ThrowsIndexOutBounds();
        int[] array = {0, 2, 4};

        assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> throwsIndexOutBounds.accesElement(array, 7));
    }
}
