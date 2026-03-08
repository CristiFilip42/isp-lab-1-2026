package utcluj.aut;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumaParaTest {
    @Test
    public void testSuma() {
        assertEquals(2, SumaPara.Suma(1));
        assertEquals(6, SumaPara.Suma(2));
        assertEquals(12, SumaPara.Suma(3));
    }
}
