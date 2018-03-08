package com.example.desk.a2_2_3laboratorio;

/**
 * Created by desk on 7/03/18.
 */

public class Usr {
    private String Clave,nombre,sueldo;

    public Usr(String clave, String nombre, String sueldo) {
        Clave = clave;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String clave) {
        Clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

}
