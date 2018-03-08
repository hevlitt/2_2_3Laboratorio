package com.example.desk.a2_2_3laboratorio.Utilidades;

/**
 * Created by desk on 5/03/18.
 */

public class Utilidades {
    public static String TABLA="usuario";
    public static String CLAVE="clave";
    public static String NOMBRE="nombre";
    public static String SUELDO="sueldo";
    public static String ID="_id";

    public static final String DBNAME="usuarios";


    public static String CREAR_TABLA="CREATE TABLE "+TABLA+"("+
            ID +" INTEGER PRIMARY KEY AUTOINCREMENT, "+
            CLAVE+" TEXT NOT NULL, "+
            NOMBRE+" TEXT, " +
            SUELDO+" TEXT)";


}
