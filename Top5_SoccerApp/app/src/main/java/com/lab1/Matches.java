package com.lab1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class Matches extends AppCompatActivity {

    ImageView image;
    Spinner spinner;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner);
        image = findViewById(R.id.imageView1);
        Picasso.get().load("https://sortitoutsi.net/uploads/trophy/22.png").resize(500,500).into(image);
        spinner = findViewById(R.id.spinner);
        List<String> games = new ArrayList<>();
        games.add(0,"Select week");
        games.add("week 1");
        games.add("week 2");
        games.add("week 3");
        games.add("week 4");
        games.add("week 5");
        games.add("week 6");
        games.add("week 7");
        games.add("week 8");
        games.add("week 9");
        games.add("week 10");
        games.add("week 11");
        games.add("week 12");
        games.add("week 13");
        games.add("week 14");
        games.add("week 15");
        games.add("week 16");
        games.add("week 17");
        games.add("week 18");
        games.add("week 19");
        games.add("week 20");
        games.add("week 21");
        games.add("week 22");
        games.add("week 23");
        games.add("week 24");
        games.add("week 25");
        games.add("week 26");
        games.add("week 27");
        games.add("week 28");
        games.add("week 29");
        games.add("week 30");
        games.add("week 31");
        games.add("week 32");
        games.add("week 33");
        games.add("week 34");
        ArrayAdapter<String> dataAdapter;
        dataAdapter= new ArrayAdapter(this,android.R.layout.simple_spinner_item,games);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(dataAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if(adapterView.getItemAtPosition(i).equals("Select week"))
                {

                }
                else {
                    String item = adapterView.getItemAtPosition(i).toString();

                    Toast.makeText(adapterView.getContext(), "Selected: " + item, Toast.LENGTH_SHORT).show();
                }

                if(adapterView.getItemAtPosition(i).equals("week 1"))
                {
                    Intent intent = new Intent(Matches.this,BG1.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 2"))
                {
                    Intent intent = new Intent(Matches.this,BG2.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 3"))
                {
                    Intent intent = new Intent(Matches.this,BG3.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 4"))
                {
                    Intent intent = new Intent(Matches.this,BG4.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 5"))
                {
                    Intent intent = new Intent(Matches.this,BG5.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 6"))
                {
                    Intent intent = new Intent(Matches.this,BG6.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 7"))
                {
                    Intent intent = new Intent(Matches.this,BG7.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 8"))
                {
                    Intent intent = new Intent(Matches.this,BG8.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 9"))
                {
                    Intent intent = new Intent(Matches.this,BG9.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 10"))
                {
                    Intent intent = new Intent(Matches.this,BG10.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 11"))
                {
                    Intent intent = new Intent(Matches.this,BG11.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 12"))
                {
                    Intent intent = new Intent(Matches.this,BG12.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 13"))
                {
                    Intent intent = new Intent(Matches.this,BG13.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 14"))
                {
                    Intent intent = new Intent(Matches.this,BG14.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 15"))
                {
                    Intent intent = new Intent(Matches.this,BG15.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 16"))
                {
                    Intent intent = new Intent(Matches.this,BG16.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 17"))
                {
                    Intent intent = new Intent(Matches.this,BG17.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 18"))
                {
                    Intent intent = new Intent(Matches.this,BG18.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 19"))
                {
                    Intent intent = new Intent(Matches.this,BG19.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 20"))
                {
                    Intent intent = new Intent(Matches.this,BG20.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 21"))
                {
                    Intent intent = new Intent(Matches.this,BG21.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 22"))
                {
                    Intent intent = new Intent(Matches.this,BG22.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 23"))
                {
                    Intent intent = new Intent(Matches.this,BG23.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 24"))
                {
                    Intent intent = new Intent(Matches.this,BG24.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 25"))
                {
                    Intent intent = new Intent(Matches.this,BG25.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 26"))
                {
                    Intent intent = new Intent(Matches.this,BG26.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 27"))
                {
                    Intent intent = new Intent(Matches.this,BG27.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 28"))
                {
                    Intent intent = new Intent(Matches.this,BG28.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 29"))
                {
                    Intent intent = new Intent(Matches.this,BG29.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 30"))
                {
                    Intent intent = new Intent(Matches.this,BG30.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 31"))
                {
                    Intent intent = new Intent(Matches.this,BG31.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 32"))
                {
                    Intent intent = new Intent(Matches.this,BG32.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 33"))
                {
                    Intent intent = new Intent(Matches.this,BG34.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 34"))
                {
                    Intent intent = new Intent(Matches.this,BG34.class);
                    startActivity(intent);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

                //TODO Auto-generated method stub

            }
        });

    }

    public void game1(View view)
    {
        startActivity(new Intent(this,BG1.class));
    }
}
