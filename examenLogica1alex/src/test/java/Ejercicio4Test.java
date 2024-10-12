import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import es.ies.puerto.Ejercicio4;

public class Ejercicio4Test {
    @Test
    public void testDonanteTipo1() {
        // Simulamos donante tipo 1 (10%)
        String input = "1000\n1\n";
        String expectedOutput = "Introduce la cantidad de dinero a donar: " +
                                "Introduce el tipo de donante (1, 2 o 3): " +
                                "El donante dará 100.0 créditos al Imperio.\n";

        assertProgramOutput(input, expectedOutput);
    }

    @Test
    public void testDonanteTipo2() {
        // Simulamos donante tipo 2 (20%)
        String input = "1000\n2\n";
        String expectedOutput = "Introduce la cantidad de dinero a donar: " +
                                "Introduce el tipo de donante (1, 2 o 3): " +
                                "El donante dará 200.0 créditos al Imperio.\n";

        assertProgramOutput(input, expectedOutput);
    }

    @Test
    public void testDonanteTipo3() {
        // Simulamos donante tipo 3 (50%)
        String input = "1000\n3\n";
        String expectedOutput = "Introduce la cantidad de dinero a donar: " +
                                "Introduce el tipo de donante (1, 2 o 3): " +
                                "El donante dará 500.0 créditos al Imperio.\n";

        assertProgramOutput(input, expectedOutput);
    }

    @Test
    public void testDonanteTipoInvalido() {
        // Simulamos un tipo de donante no válido
        String input = "1000\n4\n";
        String expectedOutput = "Introduce la cantidad de dinero a donar: " +
                                "Introduce el tipo de donante (1, 2 o 3): " +
                                "El donante dará 0.0 créditos al Imperio.\n";

        assertProgramOutput(input, expectedOutput);
    }

    // Método para redirigir la entrada y verificar la salida
    private void assertProgramOutput(String input, String expectedOutput) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        Ejercicio4.main(null); // Ejecuta el programa

        assertEquals(expectedOutput, out.toString()); // Compara la salida
    }
}
