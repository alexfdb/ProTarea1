package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Si la energía del traje de Iron Man es mayor al 70%, puede volar. Si es mayor 
 * al 30% pero menor o igual al 70%, puede caminar. Si es menor o igual al 30%, 
 * está en modo crítico.
 * Crea un programa que determine el estado de Iron Man según su nivel de energía.
 */
import java.util.Random;
public class Ejercicio13 {
    static Random aleatorio = new Random();
    public static void main(String[] args) {
        int energiaArmadura = aleatorio.nextInt(100) + 1;
        boolean puedeVolar = (energiaArmadura > 70);
        boolean estadoCritico = (energiaArmadura < 29);
        if (puedeVolar) {
            System.out.println("La armadura puede volar, su energía esta al " + energiaArmadura + " %.");
        } else if (estadoCritico) {
            System.out.println("La armadura se encuentra en estado critico, su energía esta al " + energiaArmadura + " %.");
        } else {
            System.out.println("La armadura puede caminar, su energía esta al " + energiaArmadura + " %.");
        }
    }
}