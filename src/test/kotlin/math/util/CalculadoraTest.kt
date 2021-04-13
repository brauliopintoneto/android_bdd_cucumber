package math.util

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class CalculadoraTest {

        lateinit var calculadora: Calculadora

        @Before
        fun init() {
            calculadora = Calculadora()
        }

        @Test
        fun SomaTest1() {
                // Given
                val valorA = 10.0
                val valorB = 20.0

                // When
                val resultado = calculadora.soma(valorA, valorB)

                // Then
                Assert.assertEquals(30.0, resultado,0.0)
        }

        @Test
        fun SomaTest2() {
                // Given
                val valorA = -10.0
                val valorB = 20.0

                // When
                val resultado = calculadora.soma(valorA, valorB)

                // Then
                Assert.assertEquals(-30.0, resultado,0.0)
        }

        @Test
        fun subtracao() {

        }

}