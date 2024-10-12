package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Si la velocidad de la Millennium Falcon es mayor de 1000, se activan los motores 
 * hiperespaciales. Si es mayor de 500 pero menor o igual a 1000, la nave está a 
 * máxima velocidad. Si es menor o igual a 500, la nave está en velocidad normal.
 * Escribe un programa que reciba la velocidad de la Millennium Falcon y determine 
 * el estado de los motores.
 */
import java.util.Random;
public class Ejercicio11 {
    static Random aleatorio = new Random();
    public static void main(String[] args) {
        int velocidadFalcon = aleatorio.nextInt(1500) + 1;
        boolean velocidadHiper = (velocidadFalcon > 1000);
        boolean velocidadNormal = (velocidadFalcon <= 500);
        if (velocidadHiper) {
            System.out.println("Se activan los motores hiperespaciales.");
        } else if (velocidadNormal) {
            System.out.println("La nave está en velocidad normal.");
        } else {
            System.out.println("La nave está a velocidad máxima.");
        }
    }
}