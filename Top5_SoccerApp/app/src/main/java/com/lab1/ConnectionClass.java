package com.lab1;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {

    @SuppressLint("NewApi")
    public static Connection CONN(){
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

        StrictMode.setThreadPolicy(policy);
        Connection conn = null;
        String ConnURL = null;

        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://35.184.31.79:3306/soccerapp", "alonso", "gzz10107");
            conn = DriverManager.getConnection(ConnURL);
        } catch (SQLException se) {
            Log.e("ERRO", se.getMessage());
        }catch(ClassNotFoundException e){
            Log.e("ERRO2",e.getMessage());
        }
        return conn;
    }
}
