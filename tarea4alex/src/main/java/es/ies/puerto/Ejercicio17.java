package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * En un RPG, los personajes pueden subir de nivel incrementando su experiencia. Escribe un 
 * programa que multiplique la experiencia de cada personaje por 1.5 para simular su mejora 
 * tras una batalla.
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        int[] experiencia = {100, 200, 150, 120};
        double multiplicador = 1.5;
        double[] subidaExperiencia = new double [experiencia.length];
        for (int i = 0; i < experiencia.length; i++) {
            subidaExperiencia[i] = (experiencia[i] * multiplicador);
            System.out.println(subidaExperiencia[i]);
        }
    }
}