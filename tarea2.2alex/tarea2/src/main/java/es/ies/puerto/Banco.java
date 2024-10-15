package es.ies.puerto;

/**
 * @author alexfdb
 * @version 1.0.0
 * Ejercicio 7 Crea una clase Banco con un atributo privado saldo. Implementa métodos 
 * para depositar y retirar dinero, y un método getter para consultar el saldo.
 */

public class Banco {
    
    static float saldo;

    //Constructores
    public Banco() {}

    public Banco(float banco) {

    }

    //Getters
    public float getSaldo() {
        return saldo;
    }

    //Setters
    public void setSaldo() {
        this.saldo = saldo;
    }

}
