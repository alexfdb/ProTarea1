package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Crea un programa que pida al usuario su año de nacimiento, luego calcule su 
 * edad y la muestre en la consola.
 * Usa Scanner para pedir el año de nacimiento al usuario.
 * Calcula la edad restando el año actual (por ejemplo, 2024).
 * Muestra el resultado.
 */
import java.util.Scanner;
public class Ejercicio1 {
    static Scanner escaner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduzca su año de nacimiento");
        int anioNacimiento = escaner.nextInt();
        int anioActual = 2024;
        int edad = (anioActual - anioNacimiento);
        System.out.println("Tiene " + edad + " años.");
        escaner.close();
    }
}