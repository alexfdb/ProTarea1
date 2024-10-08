package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Un droide está buscando un cristal Kyber en una lista de recursos recolectados 
 * por el equipo rebelde. Escribe un programa que busque un valor específico en 
 * el array y verifique si el cristal Kyber está presente.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        String[] recursos = {"Bláster", "Cristal Kyber", "Sable de luz", "Pistola"};
        String recursoBuscado = "Cristal Kyber";
        for (int i = 0; i < recursos.length; i++) {
            boolean calculaRecurso = (recursos[i].equals(recursoBuscado));
            if (calculaRecurso) {
                System.out.println("Cristal Kyber se encuentra en el inventario.");
            }
        }
    }
}