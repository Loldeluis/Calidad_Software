import org.junit.jupiter.api.Test;
import  static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
 Calculadora calc = new Calculadora();

 @Test
    void testSuma() { // Tester de la function suma
     assertEquals(5, calc.sumar(2,3));
     assertEquals(12, calc.sumar(6,6));
     assertEquals(28, calc.sumar(15,13));
     assertEquals(1234, calc.sumar(1233,1));

 }

    @Test
    void testDivision() { // Tester de la function division
        assertEquals(2, calc.dividir(10,5));
        assertEquals(5, calc.dividir(50,10));
        assertEquals(18, calc.dividir(36,2));
        assertEquals(19, calc.dividir(76,4));

    }

    @Test
    void testDivisionPorCero() { // Tester de la validacion que no se pueda dividir entre 0
        Exception ex = assertThrows(IllegalArgumentException.class, () -> calc.dividir(10,0));
        assertEquals("No se puede dividir entre 0", ex.getMessage());
    }



}
