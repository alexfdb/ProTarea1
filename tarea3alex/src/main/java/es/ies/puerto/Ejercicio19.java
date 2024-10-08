package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Si tienes más de 500 minerales y más de 300 gas, puedes construir un coloso. 
 * Si no tienes suficientes recursos, construyes un marine.
 * Crea un programa que determine qué unidad puedes construir en StarCraft según 
 * los recursos.
 */
import java.util.Scanner;
public class Ejercicio19 {
    static Scanner escaner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduzca la cantidad de mineralesque tiene");
        int minerales = escaner.nextInt();
        System.out.println("Introduzca la cantidad de gas que tiene");
        int gas = escaner.nextInt();
        boolean coloso = ((minerales > 500) && (gas > 300));
        if (coloso) {
            System.out.println("Puedes construir un coloso");
        } else {
            System.out.println("Puedes reclutar marines");
        }
        escaner.close();
    }
}