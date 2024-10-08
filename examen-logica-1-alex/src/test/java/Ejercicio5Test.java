import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import es.ies.puerto.Ejercicio5;

public class Ejercicio5Test {
    @Test
    public void testFrodoConEspada() {
        // Simulamos que Frodo tiene una espada
        String input = "sí\n";
        String expectedOutput = "¿Frodo tiene una espada? (sí/no): " +
                                "Frodo luchará contra los Orcos.\n";

        assertProgramOutput(input, expectedOutput);
    }

    @Test
    public void testFrodoSinEspada() {
        // Simulamos que Frodo no tiene una espada
        String input = "no\n";
        String expectedOutput = "¿Frodo tiene una espada? (sí/no): " +
                                "Frodo huirá.\n";

        assertProgramOutput(input, expectedOutput);
    }

    // Método para redirigir la entrada y verificar la salida
    private void assertProgramOutput(String input, String expectedOutput) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        Ejercicio5.main(null); // Ejecuta el programa

        assertEquals(expectedOutput, out.toString()); // Compara la salida
    }
}
