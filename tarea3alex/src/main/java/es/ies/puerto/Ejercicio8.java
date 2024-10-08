package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Rick ha activado su pistola de portales. Si ingresa un número divisible por 3, 
 * el portal lleva a la dimensión A. Si es divisible por 5, lleva a la dimensión B. 
 * Si es divisible por ambos, lleva a la dimensión C.
 * Crea un programa que determine a qué dimensión llega el portal según el número ingresado.
 */
import java.util.Scanner;
public class Ejercicio8 {
    static Scanner escaner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduzca el numero que ha ingresado Rick");
        int numeroRick = escaner.nextInt();
        boolean dimensionA = ((numeroRick % 3) == 0);
        boolean dimensionB = ((numeroRick % 5) == 0);
        boolean dimensionC = (dimensionA && dimensionB);
        if (dimensionC) {
            System.out.println("El portal llevara a la dimensión C");
        }else if (dimensionB) {
            System.out.println("El portal llevara a la dimensión B");
        }else if (dimensionA) {
            System.out.println("El portal llevara a la dimensión A");
        } else {
            System.out.println("El numero no es valido");
        }
        escaner.close();
    }
}