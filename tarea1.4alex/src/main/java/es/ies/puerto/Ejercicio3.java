package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Un grupo de guerreros ha sido evaluado por su nivel de poder de ataque. Escribe 
 * un programa que determine quién es el héroe más fuerte y el más débil.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        int[] nivelesDeAtaque = {300, 150, 500, 200, 250};
        int max = nivelesDeAtaque[0];
        int min = nivelesDeAtaque[0];
        for (int i = 0; i < nivelesDeAtaque.length; i++) {
            boolean calculaMax = (nivelesDeAtaque[i] > max);
            boolean calculaMin = (nivelesDeAtaque[i] < min);
            if (calculaMax) {
                max = nivelesDeAtaque[i];
            }
            if (calculaMin) {
                min = nivelesDeAtaque[i];
            }
        }
        System.out.println("Máximo = " + max + ", Mínimo = " + min);
    }
}