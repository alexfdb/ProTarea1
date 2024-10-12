package es.ies.puerto;
/**
 * @autor alexfdb
 * @version 1.0.0
 * Frodo está en una misión para destruir el Anillo. Si Frodo tiene una espada, 
 * puede luchar contra los Orcos, con el mensaje "Frodo luchará contra los Orcos.", 
 * de lo contrario, debe huir, mostrando el mensaje "Frodo huirá.". El programa 
 * debe preguntar si Frodo tiene una espada y mostrar el resultado correspondiente.
 */
import java.util.Scanner;
public class Ejercicio5 {
    static Scanner escaner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("¿Tiene Frodo una espada? (si o no)");
        String vaArmado = escaner.nextLine();
        boolean espadaSi = (vaArmado.equals("si"));
        if (espadaSi) {
            System.out.println("Frodo luchará contra los Orcos.");
        } else {
            System.out.println("Frodo huirá.");
        }
        escaner.close();
    }
}