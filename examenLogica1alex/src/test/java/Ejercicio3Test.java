import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import es.ies.puerto.Ejercicio3;

public class Ejercicio3Test {
    @Test
    public void testPocionesInsuficientes() {
        // Simulamos que tiene menos de 5 pociones
        String input = "3\n";
        String expectedOutput = "Introduce el número de pociones de mana: " +
                                "Pocas pociones, recarga antes del duelo\n";

        assertProgramOutput(input, expectedOutput);
    }

    @Test
    public void testPocionesSuficientes() {
        // Simulamos que tiene 5 o más pociones
        String input = "5\n";
        String expectedOutput = "Introduce el número de pociones de mana: " +
                                "Suficiente mana para el duelo\n";

        assertProgramOutput(input, expectedOutput);
    }

    @Test
    public void testPocionesExactas() {
        // Simulamos que tiene exactamente 5 pociones
        String input = "5\n";
        String expectedOutput = "Introduce el número de pociones de mana: " +
                                "Suficiente mana para el duelo\n";

        assertProgramOutput(input, expectedOutput);
    }

    // Método para redirigir la entrada y verificar la salida
    private void assertProgramOutput(String input, String expectedOutput) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        Ejercicio3.main(null); // Ejecuta el programa

        assertEquals(expectedOutput, out.toString()); // Compara la salida
    }
}
