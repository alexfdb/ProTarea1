package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Escribe un programa que convierta una temperatura en grados Celsius a Fahrenheit.
 * Fórmula: Fahrenheit = Celsius * 9/5 + 32.
 * Pide al usuario que introduzca la temperatura en grados Celsius.
 */
import java.util.Scanner;
public class Ejercicio3 {
    static Scanner escaner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduzca la temperatura en grados Celsius");
        float gradosCelsius = escaner.nextFloat();
        float celsiusFahrenheit = (gradosCelsius * 9f / 5f) + 32f;
        System.out.println(gradosCelsius + " grados Celsius son " + celsiusFahrenheit + " grados Fahrenheit.");
        escaner.close();
    }
}