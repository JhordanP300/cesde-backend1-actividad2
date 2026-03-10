package com.example;

public class Main {
    public static void main(String[] args) {
    
    System.out.println("--------------------------------------------------------------------");
    System.out.println("-------------Practica 1 (constructores y sobrecarga)----------------");

        Libro l1 = new Libro();
        l1.mostrarInformacion();
        Libro l2 = new Libro("Harry Potter", "J.K. Rowling");
        l2.mostrarInformacion();
        Libro l3 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1200);
        l3.mostrarInformacion();

    System.out.println("-------------Practica 2 (set y get)----------------");

        // creamos un objeto de la clase CuentaBancaria
        cuentaBancaria cuenta = new cuentaBancaria("Maria", 500); // asignamos el nombre del titular y el saldo inicial a la cuenta bancaria con el constructor
        System.out.println("Titular: " + cuenta.getTitular()); // obtenemos el nombre del titular con get
        cuenta.depositar(200); // depositamos dinero en la cuenta bancaria
        System.out.println("Saldo: " + cuenta.getSaldo()); // obtenemos el saldo de la cuenta bancaria con get
        cuenta.retirar(1000); // retiramos dinero de la cuenta bancaria, si el saldo es insuficiente se muestra un mensaje de error

        System.out.println("-------------Practica 3 (Lógica y Métodos)----------------");

        // creamos un objeto de la clase Estudiante
        Estudiante e = new Estudiante("Pedro", 21, 2.5);
        System.out.println("Nombre: " + e.getNombre());
        System.out.println("Edad: " + e.getEdad());
        System.out.println("Promedio: " + e.getPromedio());
        System.out.println("¿Aprobado?: " + e.haAprobado());

    }
}