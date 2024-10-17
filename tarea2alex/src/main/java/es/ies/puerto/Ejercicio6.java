package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Escribe un programa que reciba un número entero y determine si es par o impar.
 */
import java.util.Scanner;
public class Ejercicio6 {
    static Scanner escaner = new Scanner(System.in); 
    public static void main(String[] args) {
        System.out.println("Introduzca un numero entero");
        int numero = escaner.nextInt();
        if (numero % 2 == 0){
            System.out.println("El numero introducido es par.");
        }else{
            System.out.println("El numero introducido es impar.");
        }
        escaner.close();
    }
}