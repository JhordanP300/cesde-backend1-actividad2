package com.example;

public class cuentaBancaria {

    private String titular;
    private double Saldo;

    // CONSTRUCTOR
    public cuentaBancaria(String titular, double Saldo) {
        this.titular=titular;
        this.Saldo = Saldo;
        
        if (Saldo < 0) {
            this.Saldo = 0;
        }
    }

    // Metodos GETTER y SETTER
    // GET sirve para obtener el valor de un atributo
    public String getTitular() {
        return this.titular;
    }
    // SET sirve para asignar un valor a un atributo
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // GET para obtener el saldo.
    public double getSaldo() {
        return this.Saldo;
    }


    // metodo para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.Saldo += cantidad;
        }
    }

    // metodo para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad > Saldo || cantidad <= 0) {
            System.out.println("Saldo insuficiente para retirar, su saldo actual es: "+ Saldo);
        }else {
            Saldo -= cantidad;
            System.out.println("Retiro exitoso, su saldo actual es: " + Saldo);
        }

    }

}
