package es.ies.puerto;
/**
 * @autor alexfdb
 * @version 1.0.0
 * El Imperio Galáctico necesita donaciones para construir la Estrella de la Muerte. 
 * Dependiendo del tipo de donante, la cantidad que donará será diferente:
 *  Tipo 1: dona el 10% del dinero
 *  Tipo 2: dona el 20%
 *  Tipo 3: dona el 50%
 * Si el tipo de donante no es válido, dona 0.
 * La salida del programa según el tipo será la siguiente. "El donante dará 10 
 * créditos al Imperio, del total 100, porque es del tipo 1";
 */
import java.util.Scanner;
public class Ejercicio4 {
    static Scanner escaner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduzca la cantidad de dinero");
        float dinero = escaner.nextFloat();
        System.out.println("Introduzca el tipo de donante que es (1, 2 o 3)");
        int tipoDonante = escaner.nextInt();
        float donacion = 0;
        switch (tipoDonante) {
            case 1 :
                donacion = (dinero * 0.1f);
                break;
            case 2 :
                donacion = (dinero * 0.2f);
                break;
            case 3 : 
                donacion = (dinero * 0.5f);
                break;
            default :
                donacion = 0;
                break;
        }
        System.out.println("El donante dará " + donacion + " créditos al Imperio, del total " + dinero + ", porque es del tipo " + tipoDonante);
        escaner.close();
    }
}