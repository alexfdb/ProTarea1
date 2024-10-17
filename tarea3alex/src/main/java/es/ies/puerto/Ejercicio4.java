package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Si eres un Sith o un Jedi, puedes usar la Fuerza. Si no, eres un simple mortal.
 * Crea un programa que pregunte al usuario si es Sith o Jedi y le diga si puede 
 * usar la Fuerza o no.
 */
import java.util.Scanner;
public class Ejercicio4 {
    static Scanner escaner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("¿Eres un Jedi, un Sith o ninguno?");
        String respuesta = escaner.nextLine();
        switch (respuesta) {
            case "Jedi" :
            case "Sith" :
                System.out.println("Puedes usar la fuerza");
                break;
            default :
                System.out.println("No puedes usar la fuerza");
                break;
        }
        escaner.close();
    }
}