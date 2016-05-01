package com.example.nando.artesanusbeer;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Nando on 01/05/2016.
 */
public class DBHelper extends SQLiteOpenHelper
{

    private static final String DATABASE_NAME = "sqliteDB.db";

    private static final int DATABASE_VERSION = 1;
    private static final String TAG = DBHelper.class.getSimpleName().toString();

    public DBHelper( )
    {
        super(App.getContext(), DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Method is called during creation of the database
    @Override
    public void onCreate(SQLiteDatabase db) {
        //All necessary tables you like to create will create here
        db.execSQL(AnalogDAO.createTable());
    }

    // Method is called during an upgrade of the database,
    @Override
    public void onUpgrade(SQLiteDatabase database,int oldVersion,int newVersion){
        Log.w(DBHelper.class.getName(),
                "Upgrading database from version " + oldVersion + " to "
                        + newVersion + ", which will destroy all old data");
        database.execSQL("DROP TABLE IF EXISTS " + Analog.TABLE);
                onCreate(database);
    }
}

