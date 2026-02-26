package com.example;

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;
    

// constructor por defecto
    public Libro() {
        titulo = "Desconocido";
        autor = "Anonimo";
        paginas = 0;
    }

// constructor con titulo y autor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        paginas = 0;
    }

// constructor con titulo, autor y paginas
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // toString para mostrar la informacion del libro
@Override
    public String toString() {
        return "Libro: " + titulo + "\n" +
               "Autor: " + autor + "\n" +
               "Páginas: " + paginas;
    }

    //  metodo para mostrar la informacion del libro
    public void mostrarInformacion() {
        System.out.println(this.toString());
    }
}


