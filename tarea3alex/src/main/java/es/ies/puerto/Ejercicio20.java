package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Dos luchadores están en el combate final de Mortal Kombat. Si la salud de un 
 * luchador es 0, pierde. Si ambos tienen salud, se evalúa quién tiene más ataque. 
 * Si ambos tienen el mismo ataque, el combate es un empate.
 * Escribe un programa que reciba la salud y ataque de ambos luchadores y determine 
 * el resultado del combate.
 */
import java.util.Scanner;
public class Ejercicio20 {
    static Scanner escaner = new Scanner(System.in);
    public static void main(String[] args) {
        byte vidaLuchador1 = 100;
        byte vidaLuchador2 = 100;
        System.out.println("Introduzca el ataque del primer luchador");
        int ataqueLuchador1 = escaner.nextInt();
        System.out.println("Introduzca el ataque del segundo luchador");
        int ataqueLuchador2 = escaner.nextInt();
        int restoVidaLuchador1 = (vidaLuchador1 - ataqueLuchador2);
        int restoVidaLuchador2 = (vidaLuchador2 - ataqueLuchador1);
        boolean ganaLuchador1 = (restoVidaLuchador1 > restoVidaLuchador2);
        boolean ganaLuchador2 = (restoVidaLuchador1 < restoVidaLuchador2);
        boolean empate = (restoVidaLuchador1 == restoVidaLuchador2);
        boolean muereLuchador1 = (restoVidaLuchador1 == 0);
        boolean muereLuchador2 = (restoVidaLuchador2 == 0);
        boolean muerenAmbos = (muereLuchador1 && muereLuchador2);
        if (muerenAmbos){ 
            System.out.println("Ambos luchadores mueren");
        }else if (ganaLuchador1) {
            System.out.println("Gana el primer luchador");
        } else if (ganaLuchador2) {
            System.out.println("Gana el segundo luchador");
        } else if (empate) {
            System.out.println("Los luchadores empatan");
        }
        escaner.close();
    }
}