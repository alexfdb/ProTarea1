package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Si tu pokémon es de tipo Agua y el rival es de tipo Fuego, ganas. Si es Planta, 
 * pierdes. Si el rival es Agua, empatas.
 * Crea un programa que reciba los tipos de los pokémon y determine el resultado 
 * de la batalla.
 */
import java.util.Scanner;
public class Ejercicio14 {
    static Scanner escaner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduzca el tipo de tu pokémon.");
        String tipoPropio = escaner.nextLine();
        System.out.println("Introduzca el tipo del pokémon del rival.");
        String tipoRival = escaner.nextLine();
        switch (tipoPropio) {
            case "agua" :
                switch (tipoRival) {
                    case "agua" :
                        System.out.println("Empate");
                        break;
                    case "fuego" :
                        System.out.println("Ganas");
                        break;
                    case "planta" :
                        System.out.println("Pierdes");
                        break;
                    default:
                        System.out.println("El valor ingresado no es valido");
                        break;
                }
            case "fuego" :
                switch (tipoRival) {
                    case "agua" :
                        System.out.println("Pierdes");
                        break;
                    case "fuego" :
                        System.out.println("Empatas");
                        break;
                    case "planta" :
                        System.out.println("Ganas");
                        break;
                    default:
                        System.out.println("El valor ingresado no es valido");
                        break;
                }
            case "planta" :
                switch (tipoRival) {
                    case "agua" :
                        System.out.println("Ganas");
                        break;
                    case "fuego" :
                        System.out.println("Pierdes");
                        break;
                    case "planta" :
                        System.out.println("Empatas");
                        break;
                    default:
                        System.out.println("El valor ingresado no es valido");
                        break;
                }
        }
        escaner.close();
    }
}