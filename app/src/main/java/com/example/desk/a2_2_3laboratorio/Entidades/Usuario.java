package com.example.desk.a2_2_3laboratorio.Entidades;

/**
 * Created by desk on 5/03/18.
 */

public class Usuario {
    private int Clave;
    private String nombre;
    private double sueldo;

    public Usuario(int clave, String nombre, double sueldo) {
        Clave = clave;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getClave() {
        return Clave;
    }

    public void setClave(int clave) {
        Clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

}

