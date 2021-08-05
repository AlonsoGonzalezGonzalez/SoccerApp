package com.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Bundesliga(View v)
    {
        startActivity(new Intent(this,MainActivity2.class));
    }

    public void Ligabbva(View v)
    {
        startActivity(new Intent(this,LigaBBVA.class));
    }

    public void serieA(View v)
    {
        startActivity(new Intent(this,seriaA.class));
    }

    public void premiereLeague(View v)

    {
        startActivity(new Intent(this,Pleague.class));
    }
    public void ligue1(View v)

    {
        startActivity(new Intent(this,ligue1.class));
    }


}