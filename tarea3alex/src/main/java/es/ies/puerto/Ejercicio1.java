package es.ies.puerto;
/*
 * @author alexfdb
 * @version 1.0.0
 * Eres un héroe en una mazmorra con dos puertas. Si eliges la puerta correcta, 
 * obtienes una espada mágica. Si eliges la incorrecta, caerás en una trampa.
 * Crea un programa que pregunte al usuario qué puerta elige (1 o 2) y le diga 
 * si ha obtenido la espada o ha caído en la trampa.
 */
import java.util.Scanner;
import java.util.Random;
public class Ejercicio1 {
    static Scanner escaner = new Scanner(System.in);
    static Random aleatorio = new Random();
    public static void main(String[] args) {
        System.out.println("Eliga la puerta 1 o la puerta 2");
        int puertaCorrecta = aleatorio.nextInt(2) + 1;
        int puertaSeleccionada = escaner.nextInt();
        boolean espada = (puertaCorrecta == puertaSeleccionada);
        boolean trampa = (puertaCorrecta != puertaSeleccionada);
        if (espada) {
            System.out.println("¡Obtienes una espada mágica!");
        } else if (trampa) {
            System.out.println("¡Caerás en una trampa!");
        } else {
            System.out.println("Opción no valida. Elige 1 o 2");
        } 
        escaner.close();
    }
}