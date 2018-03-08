package com.example.desk.a2_2_3laboratorio;

/**
 * Created by desk on 5/03/18.
 */

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.desk.a2_2_3laboratorio.Entidades.Usuario;
import com.example.desk.a2_2_3laboratorio.Utilidades.Utilidades;

import java.util.ArrayList;


public class ConexionSQLiteHelper extends SQLiteOpenHelper {

    public SQLiteDatabase myDB;


    public ConexionSQLiteHelper(Context context) {
        super(context, Utilidades.DBNAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)  {
        sqLiteDatabase.execSQL(Utilidades.CREAR_TABLA);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        //sqLiteDatabase.execSQL("DROP TABLE IF EXISTS usuarios");
        //onCreate(sqLiteDatabase);

    }

    public void openDB(){
        myDB=getWritableDatabase();

    }

    public void closeDB() {
        if (myDB != null && myDB.isOpen()) {
            myDB.close();

        }
    }

    public Cursor getAll(){

        String query="SELECT * FROM "+ Utilidades.TABLA;

        return myDB.rawQuery(query,null);

    }

    public long insert(String clave, String nombre, String sueldo){

        ContentValues cv = new ContentValues();
        cv.put(Utilidades.CLAVE,clave);
        cv.put(Utilidades.NOMBRE,nombre);
        cv.put(Utilidades.SUELDO,sueldo);

        return myDB.insert(Utilidades.TABLA,null,cv);
    }

    public ArrayList<Usr> consulta() {
        ArrayList<Usr> lista = new ArrayList<>();
        Cursor c = myDB.rawQuery("SELECT * FROM "+Utilidades.TABLA, null);
        while (c.moveToNext()) {
            lista.add(new Usr(c.getString(1), c.getString(2), c.getString(3)));
        }
        c.close();
        return lista;
    }
}

