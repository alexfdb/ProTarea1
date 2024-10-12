package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Crea un programa que convierta una distancia en millas a kilómetros.
 * Fórmula: 1 milla = 1.60934 km.
 * Pide al usuario que introduzca la distancia en millas.
 */
import java.util.Scanner;
public class Ejercicio8 {
    static Scanner escaner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduzca la distancia en millas");
        float millas = escaner.nextFloat();
        float kilometros = (millas * 1.60934f);
        System.out.println(millas + " millas son " + kilometros + " kilometros.");
        escaner.close();
    }
}