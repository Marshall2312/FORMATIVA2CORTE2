package com.example.mainactivity;

public class Libro {

    private String codigo;
    private String nombre;
    private String autor;
    private String editorial;

    public Libro(String codigo, String nombre, String autor, String editorial) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getCodigo() {

        return codigo;
    }

    public void setCodigo(String codigo) {

        this.codigo = codigo;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getAutor() {

        return autor;
    }

    public void setAutor(String programa) {

        this.autor = autor;
    }

    public String  getEditorial(){

        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                '}';
    }
}
