package Test;

import org.junit.Test;
import static org.junit.Assert.*;
public class CalculadoraTest {

    @Test
    public void testSoma() {Calculadora calc = new Calculadora();
        assertEquals(5, calc.soma(2, 3));
        }
    }


