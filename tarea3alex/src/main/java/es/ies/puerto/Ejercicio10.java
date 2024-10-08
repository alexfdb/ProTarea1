package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Según tus respuestas en el sombrero seleccionador, te pueden asignar a Gryffindor, 
 * Slytherin, Ravenclaw o Hufflepuff. Elige entre valiente, astuto, sabio o leal y 
 * el programa te asignará una casa.
 * Crea un programa que te asigne una casa según tu elección.
 */
import java.util.Scanner;
public class Ejercicio10 {
    static Scanner escaner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Elige entre valiente, astuto, sabio o leal.");
        String eleccion = escaner.nextLine();
        switch (eleccion) {
            case "valiente" :
                System.out.println("¡Gryffindor!");
                break;
            case "astuto" :
                System.out.println("¡Slytherin!");
                break;
            case "sabio" :
                System.out.println("¡Ravenclaw!");
                break;
            case "leal" :
                System.out.println("¡Hufflepuff!");
                break;
            default :
                System.out.println("Eres un muggle");
        }
        escaner.close();
    }
}