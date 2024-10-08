package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * En una carrera de Starfighters, los pilotos han registrado sus tiempos en segundos. 
 * Escribe un programa que ordene los tiempos de menor a mayor para mostrar quién ha 
 * sido el más rápido.
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        int[] tiempos = {350, 280, 420, 310};
        for (int i = 0; i < tiempos.length - 1; i++) {
            for (int j = i + 1; j < tiempos.length; j++) {
                if (tiempos[i] < tiempos[j]){
                    int intercambio = tiempos[i];
                    tiempos[i] = tiempos[j];
                    tiempos[j] = intercambio;
                }
            }
        }
        for (int i = 0; i < tiempos.length; i++) {
            System.out.println(tiempos[i]);
        }
    }
}