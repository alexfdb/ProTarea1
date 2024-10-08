package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Estás cazando pokémon. Si el pokémon es de tipo Agua, Fuego o Planta, 
 * puedes usar la pokébola. Si es de cualquier otro tipo, no.
 * Crea un programa que te diga si puedes atrapar al pokémon o no según su tipo.
 */
import java.util.Scanner;
public class Ejercicio6 {
    static Scanner escaner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduzca el tipo de pokemon que quiere capturar");
        String tipoPokemon = escaner.nextLine();
        switch (tipoPokemon) {
            case "Agua" :
            case "Fuego" :
            case "Planta" :
                System.out.println("Puedes usar las pokebolas");
                break;
            default :
                System.out.println("No puedes usar las pokebolas");
                break;
        }
        escaner.close();
    }
}