package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Declara una variable de tipo char y asígnale un símbolo del teclado. Luego, 
 * muestra el código numérico ASCII de ese símbolo.
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        char simboloTeclado = 'A';
        int simboloTecladoAscii = simboloTeclado;
        System.out.println("El simbolo del teclado es " + simboloTeclado + " su numero en codigo ASCII es " + simboloTecladoAscii + ".");
    }
}