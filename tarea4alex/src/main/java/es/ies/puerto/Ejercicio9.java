package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * En una batalla épica, dos ejércitos se han unido. Escribe un programa que sume 
 * los puntos de fuerza de los guerreros de dos ejércitos y muestre un nuevo array 
 * con las fuerzas combinadas de ambos.
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        int[] ejercito1 = {50, 60, 70};
        int[] ejercito2 = {40, 80, 60};
        int[] ejercito1y2 = new int[ejercito1.length];
        for (int i = 0; i < ejercito1.length; i++) {
                ejercito1y2[i] = ejercito1[i];
            }
        for (int i = 0; i < ejercito2.length; i++) {
            ejercito1y2[i] += ejercito2[i];
        }
        for (int i = 0; i < ejercito1y2.length; i++) {
            System.out.println(ejercito1y2[i]);
        }
    }
}