package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Batman y Superman están peleando. Si la fuerza de Superman es mayor a la de Batman, 
 * Superman gana. Si es menor, Batman gana. Si tienen la misma fuerza, es un empate.
 * Escribe un programa que reciba las fuerzas de ambos héroes y determine quién gana.
 */
import java.util.Random;
public class Ejercicio12 {
    static Random aleatorio = new Random();
    public static void main(String[] args) {
        int fuerzaSuper = aleatorio.nextInt(100);
        int fuerzaBat = aleatorio.nextInt(100);
        boolean ganaSuper = (fuerzaSuper>fuerzaBat);
        boolean ganaBat = (fuerzaSuper<fuerzaBat);
        if (ganaSuper) {
            System.out.println("Gana Superman");
        } else if (ganaBat) {
            System.out.println("Gana Batman");
        } else {
            System.out.println("Empatan");
        }
    }
}