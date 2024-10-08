package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Escribe un programa que pida dos números enteros al usuario y determine cuál 
 * de ellos es mayor, o si son iguales.
 */
import java.util.Scanner;
public class Ejercicio9 {
    static Scanner escaner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduzca dos numeros enteros");
        int numero1 = escaner.nextInt();
        int numero2 = escaner.nextInt();
        if (numero1 < numero2){
            System.out.println(numero1 + " es menor que " +numero2 + ".");
        }else if(numero1 > numero2){
            System.out.println(numero1 + " es mayor que " + numero2 + ".");
        }else{
            System.out.println(numero1 + " es igual que " + numero2 + ".");
        }
        escaner.close();
    }
}