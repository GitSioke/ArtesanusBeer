package com.example.nando.artesanusbeer;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Nando on 01/05/2016.
 */
public class AnalogDAO {

    private Analog analog;

    public AnalogDAO()
    {
        analog = new Analog();
    }


    public static String createTable()
    {
        return "CREATE TABLE " + Analog.TABLE  + "("
                + Analog.KEY_AnalogId  + "   PRIMARY KEY    ,"
                + Analog.KEY_Name + " TEXT "
                + Analog.KEY_High + " INTEGER "
                + Analog.KEY_Low + " INTEGER "
                + Analog.KEY_Type + " TEXT )";
    }


    public int insert(Analog analog) {
        int analogId;
        SQLiteDatabase db = DBManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(Analog.KEY_AnalogId, analog.getAnalogId());
        values.put(Analog.KEY_Name, analog.getName());
        values.put(Analog.KEY_High, analog.getHigh());
        values.put(Analog.KEY_Low, analog.getLow());
        values.put(Analog.KEY_Type, analog.getType());
        // Inserting Row
        analogId=(int)db.insert(Analog.TABLE, null, values);
        DBManager.getInstance().closeDatabase();

        return analogId;
    }



    public void delete( ) {
        SQLiteDatabase db = DBManager.getInstance().openDatabase();
        db.delete(Analog.TABLE,null,null);
        DBManager.getInstance().closeDatabase();
    }
}
