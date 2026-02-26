package com.example;

public class cuentaBancaria {

    private String titular;
    private double saldo;

    // CONSTRUCTOR
    public cuentaBancaria() {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Metodos GETTER y SETTER
    // GET sirve para obtener el valor de un atributo
    public String getTitular(String titular) {
        return titular;
    }
    // SET sirve para asignar un valor a un atributo
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // GET para obtener el saldo, si el saldo es negativo se asigna 0
    public double getSaldo(double saldo) {
        if (saldo < 0) {
            saldo = 0;
        }
        return saldo;
    }


    // metodo para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    // metodo para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad > saldo || cantidad <= 0) {
            System.out.println("Saldo insuficiente para retirar, su saldo actual es: "+ saldo);
        }else {
            saldo -= cantidad;
            System.out.println("Retiro exitoso, su saldo actual es: " + saldo);
        }

    }

}
