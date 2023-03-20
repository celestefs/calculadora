package org.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void testMultiplicar() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.multiplicar(80, 3);
        assertEquals(240, resultado, 0);
    }

    @Test
    public void testSumarYDividir() {
        Calculadora calculadora = new Calculadora();
        double resultadoSuma = calculadora.sumar(150, 180);
        double resultadoDivision = calculadora.dividir(resultadoSuma, 3);
        assertEquals(110, resultadoDivision, 0);
    }

    @Test
    public void testRestarYMultiplicar() {
        Calculadora calculadora = new Calculadora();
        double resultadoResta = calculadora.restar(90, 50);
        double resultadoMultiplicacion = calculadora.multiplicar(resultadoResta, 15);
        assertEquals(605, resultadoMultiplicacion, 0);
    }

    @Test
    public void testSumarYMultiplicar() {
        Calculadora calculadora = new Calculadora();
        double resultadoSuma = calculadora.sumar(70, 40);
        double resultadoMultiplicacion = calculadora.multiplicar(resultadoSuma, 25);
        assertEquals(2700, resultadoMultiplicacion, 0);
    }

}
