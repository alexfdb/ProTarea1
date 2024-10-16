package es.ies.puerto;

/**
 * @author alexfdb
 * @version 1.0.0
 * Ejercicio 7 Crea una clase Banco con un atributo privado saldo. Implementa métodos 
 * para depositar y retirar dinero, y un método getter para consultar el saldo.
 * Crea un objeto de la clase Banco con un saldo inicial de 1000. Deposita 500, 
 * retira 200 y muestra el saldo actual.
 */

public class Banco {
    
    private float saldo;

    //Constructores
    public Banco() {
        this.saldo = 0;
    }

    /**
     * Constructor de la clase Banco
     * 
     * @param saldo Cantidad de saldo en el banco.
     */
    public Banco(float saldo) {
        setSaldo(saldo);
    }

    //Getters
    public float getSaldo() {
        return saldo;
    }

    //Setters
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    //Métodos para manejar depósitos y retiros
    public void depositar(float cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
        } else {
            throw new IllegalArgumentException("La cantidad a depositar debe ser positiva");
        } 
    }

    public void retirar(float cantidad) {
        if (cantidad > 0) {
            if (this.saldo >= cantidad) {
                this.saldo -= cantidad;
            } else {
                throw new IllegalArgumentException("Saldo insuficiente para retirar.");
            }
        } else {
            throw new IllegalArgumentException("La cantidad a retirar debe ser positiva.");
        }
    }

    //toString
    public String toString() {
        return "Banco{" + 
                "Saldo: " + saldo + 
                '}';
    }
}