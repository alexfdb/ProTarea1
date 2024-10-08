package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Crea un programa que solicite al usuario dos números enteros. El programa 
 * debe sumar y restar ambos números, y mostrar los resultados
 */
import java.util.Scanner;
public class Ejercicio4 {
    static Scanner escaner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduzca dos numeros enteros");
        int numero1 = escaner.nextInt();
        int numero2 = escaner.nextInt();
        int sumaNumeros = (numero1 + numero2);
        int restaNumeros = (numero1 - numero2);
        System.out.println("La suma de los numeros da como resultado " + sumaNumeros + ".");
        System.out.println("La resta de los numeros da como resultado " + restaNumeros + ".");
        escaner.close();
    }
}