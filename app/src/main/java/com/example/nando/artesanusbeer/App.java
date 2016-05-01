package com.example.nando.artesanusbeer;

import android.app.Application;
import android.content.Context;

/**
 * Created by Nando on 01/05/2016.
 */
public class App extends Application{
        private static Context context;
        private static DBHelper dbHelper;

        @Override
        public void onCreate()
        {
            super.onCreate();
            context = this.getApplicationContext();
            dbHelper = new DBHelper();
            DBManager.initializeInstance(dbHelper);
        }

        public static Context getContext(){
            return context;
        }
}
