package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Para hacer la fusión, los guerreros deben tener la misma cantidad de ki. Si 
 * los valores de ki no coinciden, la fusión falla.
 * Escribe un programa que reciba los valores de ki de dos guerreros y determine 
 * si la fusión es exitosa o falla.
 */
import java.util.Random;
public class Ejercicio9 {
    static Random aleatorio = new Random();
    public static void main(String[] args) {
        int ki1 = aleatorio.nextInt(3);
        int ki2 = aleatorio.nextInt(3);
        boolean kiIgual = (ki1 == ki2);
        if (kiIgual) {
            System.out.println("La fusión será exitosa");
        } else {
            System.out.println("La fusión no será exitosa");
        }
    }
}