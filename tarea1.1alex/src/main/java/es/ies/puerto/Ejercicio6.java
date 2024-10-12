package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Declara tres variables enteras, asigna valores a cada una y calcula su promedio.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        int valor1 = 154867;
        int valor2 = 245987;
        int valor3 = 549132;
        int sumaValores = (valor1 + valor2 + valor3);
        int promedioValores = (sumaValores / 3);
        System.out.println("Los valores son " + valor1 + ", " + valor2 + ", " + valor3 + ".");
        System.out.println("El promedio de estos valores es " + promedioValores + ".");
    }
}