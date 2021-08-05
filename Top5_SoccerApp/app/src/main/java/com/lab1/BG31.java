package com.lab1;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BG31 extends AppCompatActivity {

    String h1,h2,h3,h4,h5,h6,h7,h8,h9;
    String a1,a2,a3,a4,a5,a6,a7,a8,a9;
    int htg1,atg1,htg2,atg2,htg3,atg3,htg4,atg4,htg5,atg5,htg6,atg6,htg7,atg7,htg8,atg8,htg9,atg9;
    int key = 31;
    Connection con;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bungame31);

        ConnectionClass con = new ConnectionClass();
        this.con = con.CONN();
        Statement st = null;
        try {
            st = this.con.createStatement();
            ResultSet rs = st.executeQuery("select * from bun_games");


            ImageView image1 = findViewById(R.id.imageView1);
            ImageView image2 = findViewById(R.id.imageView2);
            ImageView image3 = findViewById(R.id.imageView3);
            Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/FC_Bayern_M%C3%BCnchen_logo_%282017%29.svg/180px-FC_Bayern_M%C3%BCnchen_logo_%282017%29.svg.png").resize(70, 70).into(image1);
            Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/6/67/Borussia_Dortmund_logo.svg/180px-Borussia_Dortmund_logo.svg.png").resize(70, 70).into(image2);
            Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6d/FC_Schalke_04_Logo.svg/1200px-FC_Schalke_04_Logo.svg.png").resize(70, 70).into(image3);

            TextView text1 = findViewById(R.id.textView1);
            TextView text2 = findViewById(R.id.textView2);
            TextView text3 = findViewById(R.id.textView3);
            TextView text4 = findViewById(R.id.textView4);
            TextView text5 = findViewById(R.id.textView5);
            TextView text6 = findViewById(R.id.textView6);
            TextView text7 = findViewById(R.id.textView7);
            TextView text8 = findViewById(R.id.textView8);
            TextView text9 = findViewById(R.id.textView9);
            TextView text10 = findViewById(R.id.textView10);
            TextView text11 = findViewById(R.id.textView11);
            TextView text12 = findViewById(R.id.textView12);
            TextView text13 = findViewById(R.id.textView13);
            TextView text14 = findViewById(R.id.textView14);
            TextView text15 = findViewById(R.id.textView15);
            TextView text16 = findViewById(R.id.textView16);
            TextView text17 = findViewById(R.id.textView17);
            TextView text18 = findViewById(R.id.textView18);
            TextView text19 = findViewById(R.id.textView19);
            TextView text20 = findViewById(R.id.textView20);
            TextView text21 = findViewById(R.id.textView21);
            TextView text22 = findViewById(R.id.textView22);
            TextView text23 = findViewById(R.id.textView23);
            TextView text24 = findViewById(R.id.textView24);
            TextView text25 = findViewById(R.id.textView25);
            TextView text26 = findViewById(R.id.textView26);
            TextView text27 = findViewById(R.id.textView27);
            TextView text28 = findViewById(R.id.textView28);
            TextView text29 = findViewById(R.id.textView29);
            TextView text30 = findViewById(R.id.textView30);
            TextView text31 = findViewById(R.id.textView31);
            TextView text32 = findViewById(R.id.textView32);
            TextView text33 = findViewById(R.id.textView33);
            TextView text34 = findViewById(R.id.textView34);
            TextView text35 = findViewById(R.id.textView35);
            TextView text36 = findViewById(R.id.textView36);

            for(int i = 0;i<key;++i) {
                rs.next();
                h1 = rs.getNString("home1");
                a1 = rs.getNString("away1");
                htg1 = rs.getInt("HTG1");
                atg1 = rs.getInt("ATG1");
                h2 = rs.getNString("home2");
                a2 = rs.getNString("away2");
                htg2 = rs.getInt("HTG2");
                atg2 = rs.getInt("ATG2");
                h3 = rs.getNString("home3");
                a3 = rs.getNString("away3");
                htg3 = rs.getInt("HTG3");
                atg3 = rs.getInt("ATG3");
                h4 = rs.getNString("home4");
                a4 = rs.getNString("away4");
                htg4 = rs.getInt("HTG4");
                atg4 = rs.getInt("ATG4");
                h5 = rs.getNString("home5");
                a5 = rs.getNString("away5");
                htg5 = rs.getInt("HTG5");
                atg5 = rs.getInt("ATG5");
                h6 = rs.getNString("home6");
                a6 = rs.getNString("away6");
                htg6 = rs.getInt("HTG6");
                atg6 = rs.getInt("ATG6");
                h7 = rs.getNString("home7");
                a7 = rs.getNString("away7");
                htg7 = rs.getInt("HTG7");
                atg7 = rs.getInt("ATG7");
                h8 = rs.getNString("home8");
                a8 = rs.getNString("away8");
                htg8 = rs.getInt("HTG8");
                atg8 = rs.getInt("ATG8");
                h9 = rs.getNString("home9");
                a9 = rs.getNString("away9");
                htg9 = rs.getInt("HTG9");
                atg9 = rs.getInt("ATG9");
            }
            text1.setText(h1);
            text2.setText(a1);
            text3.setText(Integer.toString(htg1));
            text4.setText(Integer.toString(atg1));
            text5.setText(h2);
            text6.setText(a2);
            text7.setText(Integer.toString(htg2));
            text8.setText(Integer.toString(atg2));
            text9.setText(h3);
            text10.setText(a3);
            text11.setText(Integer.toString(htg3));
            text12.setText(Integer.toString(atg3));
            text13.setText(h4);
            text14.setText(a4);
            text15.setText(Integer.toString(htg4));
            text16.setText(Integer.toString(atg4));
            text17.setText(h5);
            text18.setText(a5);
            text19.setText(Integer.toString(htg5));
            text20.setText(Integer.toString(atg5));
            text21.setText(h6);
            text22.setText(a6);
            text23.setText(Integer.toString(htg6));
            text24.setText(Integer.toString(atg6));
            text25.setText(h7);
            text26.setText(a7);
            text27.setText(Integer.toString(htg7));
            text28.setText(Integer.toString(atg7));
            text29.setText(h8);
            text30.setText(a8);
            text31.setText(Integer.toString(htg8));
            text32.setText(Integer.toString(atg8));
            text33.setText(h9);
            text34.setText(a9);
            text35.setText(Integer.toString(htg9));
            text36.setText(Integer.toString(atg9));


        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}
