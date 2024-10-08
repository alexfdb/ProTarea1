package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Un alquimista ha creado varias pociones y desea organizar su almacén. Las pociones 
 * curativas contienen la palabra "Curación". Escribe un programa que separe las pociones 
 * curativas de las otras.
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        String[] pociones = {"Poción de Curación", "Poción de Veneno", "Curación Mayor", "Poción de Invisibilidad"};
        for (int i = 0; i < pociones.length - 1; i++) {
            for (int j = i + 1; j < pociones.length; j++) {
                if (!pociones[i].contains("Curación")) {
                    String intercambio = pociones[i];
                    pociones[i] = pociones[j];
                    pociones[j] = intercambio;
                }
            }
        }
        for (int i = 0; i < pociones.length; i++) {
            System.out.println(pociones[i]);
        }
    }
}