package com.lab1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class Ligbmatches extends AppCompatActivity {

    ImageView image;
    Spinner spinner;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ligbmatches);
        image = findViewById(R.id.imageView1);
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
        games.add("week 35");
        games.add("week 36");
        games.add("week 37");
        games.add("week 38");

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
                    Intent intent = new Intent(Ligbmatches.this,LB1.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 2"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB2.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 3"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB3.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 4"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB4.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 5"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB5.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 6"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB6.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 7"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB7.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 8"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB8.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 9"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB9.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 10"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB10.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 11"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB11.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 12"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB12.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 13"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB13.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 14"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB14.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 15"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB15.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 16"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB16.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 17"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB17.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 18"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB18.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 19"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB19.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 20"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB20.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 21"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB21.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 22"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB22.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 23"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB23.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 24"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB24.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 25"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB25.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 26"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB26.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 27"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB27.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 28"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB28.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 29"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB29.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 30"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB30.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 31"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB31.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 32"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB32.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 33"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB33.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 34"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB34.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 35"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB35.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 36"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB36.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 37"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB37.class);
                    startActivity(intent);
                }
                if(adapterView.getItemAtPosition(i).equals("week 38"))
                {
                    Intent intent = new Intent(Ligbmatches.this,LB38.class);
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
