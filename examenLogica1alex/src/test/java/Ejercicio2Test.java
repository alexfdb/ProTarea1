import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import es.ies.puerto.Ejercicio2;

public class Ejercicio2Test {
    @Test
    public void testCombustibleInsuficiente() {
        // Simulamos una distancia mayor a 500 km
        String input = "600\n";
        String expectedOutput = "Introduce la distancia a recorrer (en km): " +
                                "¡Combustible insuficiente, alerta a Alfred!\n";

        assertProgramOutput(input, expectedOutput);
    }

    @Test
    public void testCombustibleSuficiente() {
        // Simulamos una distancia menor o igual a 500 km
        String input = "400\n";
        String expectedOutput = "Introduce la distancia a recorrer (en km): " +
                                "Combustible suficiente para la misión\n";

        assertProgramOutput(input, expectedOutput);
    }

    @Test
    public void testCombustibleExacto() {
        // Simulamos una distancia exactamente de 500 km
        String input = "500\n";
        String expectedOutput = "Introduce la distancia a recorrer (en km): " +
                                "Combustible suficiente para la misión\n";

        assertProgramOutput(input, expectedOutput);
    }

    // Método para redirigir la entrada y verificar la salida
    private void assertProgramOutput(String input, String expectedOutput) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        Ejercicio2.main(null); // Ejecuta el programa

        assertEquals(expectedOutput, out.toString()); // Compara la salida
    }
}
