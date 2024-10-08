package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Goku está en una batalla. Si su nivel de poder es mayor de 9000, está en 
 * "Modo Super Saiyan". Si no, está en "Modo normal".
 * Escribe un programa que reciba el nivel de poder de Goku y determine en qué 
 * modo está.
 */
import java.util.Random;
public class Ejercicio5 {
    static Random aleatorio = new Random();
    public static void main(String[] args) {
        int poderGoku = aleatorio.nextInt(20000) + 1;
        boolean modoSayan = (poderGoku > 9000);
        if (modoSayan) {
            System.out.println("El poder de Goku es " + poderGoku + " esta en modo super Sayan.");
        } else {
            System.out.println("El poder de Goku es " + poderGoku + " esta en modo normal");
        }
    }
}