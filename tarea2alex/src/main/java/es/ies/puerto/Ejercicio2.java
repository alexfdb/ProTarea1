package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Crea un programa que pida al usuario el radio de un círculo y calcule su área.
 * Fórmula del área: Área = π * radio^2.
 * Usa double para el radio y el área.
 */
import java.util.Scanner;
public class Ejercicio2 {
    static Scanner escaner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduzca el radio del círculo");
        double radio = escaner.nextDouble();
        double pi = 3.14159d;
        double area = (pi * (radio * radio));
        System.out.println("Un circulo con un radio de " + radio + " tiene un area de " + area + ".");
        escaner.close();
    }
}