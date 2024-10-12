package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Escribe un programa que pida al usuario tres números de tipo float y calcule 
 * el promedio de los tres.
 */
import java.util.Scanner;
public class Ejercicio5 {
    static Scanner escaner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduzca tres numeros con decimales");
        float numero1 = escaner.nextFloat();
        float numero2 = escaner.nextFloat();
        float numero3 = escaner.nextFloat();
        float sumaNumeros = (numero1 + numero2 + numero3);
        float promedioNumeros = (sumaNumeros / 3f);
        System.out.println("La suma de los numeros introducidos es " + sumaNumeros + " el promedio de los numeros introducidos es " + promedioNumeros + ".");
        escaner.close();
    }
}