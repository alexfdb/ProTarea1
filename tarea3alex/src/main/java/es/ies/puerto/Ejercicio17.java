package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * En una batalla de rol, si el atacante tiene más fuerza que el defensor, le 
 * inflige un daño igual a la diferencia de fuerza. Si no, el defensor bloquea el ataque.
 * Crea un programa que reciba las fuerzas de ambos personajes y determine el daño infligido.
 */
import java.util.Scanner;
public class Ejercicio17 {
    static Scanner escaner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduzca la fuerza del atacante");
        int atacante = escaner.nextInt();
        System.out.println("Introduzca la fuerza del defensor");
        int defensor = escaner.nextInt();
        int daño = (atacante - defensor);
        boolean bloqueo = (atacante < defensor);
        if (bloqueo) {
            System.out.println("El defensor bloquea el ataque");
        } else {
            System.out.println("El atacante le hace " + daño + " puntos de daño al defensor.");
        }
        escaner.close();
    }
}