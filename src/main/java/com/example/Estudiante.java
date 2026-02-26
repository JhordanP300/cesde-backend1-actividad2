package com;

public class Estudiante {

    // Atributos
    private String nombre;
    private int edad;
    private double promedio;

    // Constructor por defecto
    public Estudiante() {
        nombre = "Desconocido";
        edad = 0;
        promedio = 0.0;
    }
    // Constructor con parametros
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }


    // metodos get y set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }


    public void setEdad(int edad) {
        if (edad>0) {
            this.edad = edad;
        }
    }
    public int getEdad() {
        return edad;
    }
    


    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    public double getPromedio() {
        return promedio;
    }


    // metodo para mostrar la aprobación del estudiante
    boolean aprobado;
    public boolean haAprobado() {
        if (promedio >= 3.0) {
            aprobado = true;
        } else {
            aprobado = false;
        }
        return aprobado;
    }


    // metodo para mostrar la información del estudiante con toString
    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", promedio=" + promedio +
                ", aprobado=" + haAprobado() +
                '}';
    }

}
