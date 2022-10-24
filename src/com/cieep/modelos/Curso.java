package com.cieep.modelos;

import java.io.Serializable;

public class Curso implements Serializable {

    private int id;
    private String nombre;
    private String descripcion;
    private char grupo;

    public Curso() {
    }

    public Curso(String nombre, String descripcion, char grupo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.grupo = grupo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public char getGrupo() {
        return grupo;
    }

    public void setGrupo(char grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", grupo=" + grupo +
                '}';
    }
}
