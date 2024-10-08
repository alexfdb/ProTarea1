import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import es.ies.puerto.Ejercicio1;

public class Ejercicio1Test {
    
    @Test
    void testNivelAvanzado() {
        // Simulamos entrada con niveles que sumen más de 100
        String input = "70\n40\n"; // nivel1 = 70, nivel2 = 40 -> suma = 110
        String expectedOutput = "Introduce el primer nivel de concentración: " +
                                "Introduce el segundo nivel de concentración: " +
                                "El nivel de poder de la Fuerza es: 110\n" +
                                "Nivel avanzado\n";

        assertProgramOutput(input, expectedOutput);
    }

    @Test
    void testNivelAprendiz() {
        // Simulamos entrada con niveles que sumen 100 o menos
        String input = "50\n50\n"; // nivel1 = 50, nivel2 = 50 -> suma = 100
        String expectedOutput = "Introduce el primer nivel de concentración: " +
                                "Introduce el segundo nivel de concentración: " +
                                "El nivel de poder de la Fuerza es: 100\n" +
                                "Nivel de aprendiz\n";

        assertProgramOutput(input, expectedOutput);
    }

    @Test
    void testConcentracionesNegativas() {
        // Simulamos entrada con niveles negativos
        String input = "-10\n20\n"; // nivel1 = -10, nivel2 = 20 -> suma = 10
        String expectedOutput = "Introduce el primer nivel de concentración: " +
                                "Introduce el segundo nivel de concentración: " +
                                "El nivel de poder de la Fuerza es: 10\n" +
                                "Nivel de aprendiz\n";

        assertProgramOutput(input, expectedOutput);
    }


    private void assertProgramOutput(String input, String expectedOutput) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        Ejercicio1.main(null); // Ejecuta el programa

        assertEquals(expectedOutput, out.toString()); // Compara la salida
    }
}
