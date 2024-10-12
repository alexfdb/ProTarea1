package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Un equipo de aventureros ha derrotado a un dragón y ahora deben eliminarlo del 
 * registro de criaturas vivas. Escribe un programa que elimine a esta criatura 
 * específica del array.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        String[] criaturas = {"Goblin", "Dragón", "Orco", "Troll"};
        String criaturaAEliminar = "Dragón";
        for (int i = 0; i < criaturas.length; i++) {
            boolean eliminarDragon = (criaturas[i].equals(criaturaAEliminar));
            if (!eliminarDragon) {
                System.out.print(criaturas[i] + " ");
            }
        }
    }
}