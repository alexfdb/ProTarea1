package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * En la arena de gladiadores, se ha realizado una evaluación de las habilidades 
 * de combate. Escribe un programa que ordene las puntuaciones de los gladiadores 
 * de menor a mayor para ver quién es el mejor combatiente.
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        int[] rankings = {300, 500, 200, 400, 100};
        for (int i = 0; i < rankings.length - 1; i++) {
            for (int j = i + 1; j < rankings.length; j++) {
                boolean mayorQue = (rankings[i] > rankings[j]);
                if (mayorQue) {
                    int intercambio = rankings[i];
                    rankings[i] = rankings[j];
                    rankings[j] = intercambio;
                }
            }
        }
        for (int i = 0; i < rankings.length; i++) {
            System.out.println(rankings[i]);
        }
    }
}