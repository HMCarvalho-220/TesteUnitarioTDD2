package Test;

import Main.Calculadora;
import org.junit.Test;
import static org.junit.Assert.*;
public class CalculadoraTest {

    @Test
    public void testSoma() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.adicionar(2, 3),0.0001 );
        }


    @Test
    public void testSubtra() {
        Calculadora calculadora = new Calculadora();
        assertEquals(1, calculadora.subtrair(3, 2),0.0001 );
    }
    @Test
    public void testDiv() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.dividir(10, 2),0.0001 );
    }
    @Test
    public void testMulti() {
        Calculadora calculadora = new Calculadora();
        assertEquals(15, calculadora.multiplicar(5, 3),0.0001 );
    }
}


