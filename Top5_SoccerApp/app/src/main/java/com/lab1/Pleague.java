package com.lab1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Pleague extends AppCompatActivity {

    ImageView image;
    String logo;
    String team;
    Connection con;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pleague);
        image = findViewById(R.id.imageViewX);
        ConnectionClass con = new ConnectionClass();
        this.con = con.CONN();
        Statement st = null;
        try {
            st = this.con.createStatement();
            ResultSet rs = st.executeQuery("select * from premiere_league");
            ImageView image1 = findViewById(R.id.imageView_1);
            ImageView image2 = findViewById(R.id.imageView_2);
            ImageView image3 = findViewById(R.id.imageView_3);
            ImageView image4 = findViewById(R.id.imageView_4);
            ImageView image5 = findViewById(R.id.imageView_5);
            ImageView image6 = findViewById(R.id.imageView_6);
            ImageView image7 = findViewById(R.id.imageView_7);
            ImageView image8= findViewById(R.id.imageView_8);
            ImageView image9 = findViewById(R.id.imageView_9);
            ImageView image10 = findViewById(R.id.imageView_10);
            ImageView image11 = findViewById(R.id.imageView_11);
            ImageView image12 = findViewById(R.id.imageView_12);
            ImageView image13 = findViewById(R.id.imageView_13);
            ImageView image14 = findViewById(R.id.imageView_14);
            ImageView image15 = findViewById(R.id.imageView_15);
            ImageView image16 = findViewById(R.id.imageView_16);
            ImageView image17 = findViewById(R.id.imageView_17);
            ImageView image18 = findViewById(R.id.imageView_18);
            ImageView image19 = findViewById(R.id.imageView_19);
            ImageView image20 = findViewById(R.id.imageView_20);
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
            TextView text14 = findViewById(R.id.textView16);
            TextView text15 = findViewById(R.id.textView15);
            TextView text16 = findViewById(R.id.textView19);
            TextView text17 = findViewById(R.id.textView17);
            TextView text18 = findViewById(R.id.textView18);
            TextView text20 = findViewById(R.id.textView20);
            TextView text21 = findViewById(R.id.textView21);
            rs.next();
            logo = rs.getNString("logos");
            team= rs.getNString("team_name");
            text1.setText(team);
            Picasso.get().load(logo).resize(30,30).into(image1);
            rs.next();
            logo = rs.getNString("logos");
            team= rs.getNString("team_name");
            text2.setText(team);
            Picasso.get().load(logo).resize(70,50).into(image2);
            rs.next();
            logo = rs.getNString("logos");
            team= rs.getNString("team_name");
            text3.setText(team);
            Picasso.get().load(logo).resize(70,50).into(image3);
            rs.next();
            logo = rs.getNString("logos");
            team= rs.getNString("team_name");
            text4.setText(team);
            Picasso.get().load(logo).resize(70,50).into(image4);
            rs.next();
            logo = rs.getNString("logos");
            team= rs.getNString("team_name");
            text5.setText(team);
            Picasso.get().load(logo).resize(70,50).into(image5);
            rs.next();
            logo = rs.getNString("logos");
            team= rs.getNString("team_name");
            text6.setText(team);
            Picasso.get().load(logo).resize(70,50).into(image6);
            rs.next();
            logo = rs.getNString("logos");
            team= rs.getNString("team_name");
            text7.setText(team);
            Picasso.get().load(logo).resize(70,50).into(image7);
            rs.next();
            logo = rs.getNString("logos");
            team= rs.getNString("team_name");
            text8.setText(team);
            Picasso.get().load(logo).resize(70,50).into(image8);
            rs.next();
            logo = rs.getNString("logos");
            team= rs.getNString("team_name");
            text9.setText(team);
            Picasso.get().load(logo).resize(70,50).into(image9);
            rs.next();
            logo = rs.getNString("logos");
            team= rs.getNString("team_name");
            text10.setText(team);
            Picasso.get().load(logo).resize(70,50).into(image10);
            rs.next();
            logo = rs.getNString("logos");
            team= rs.getNString("team_name");
            text11.setText(team);
            Picasso.get().load(logo).resize(70,50).into(image11);
            rs.next();
            logo = rs.getNString("logos");
            team= rs.getNString("team_name");
            text12.setText(team);
            Picasso.get().load(logo).resize(70,50).into(image12);
            rs.next();
            logo = rs.getNString("logos");
            team= rs.getNString("team_name");
            text13.setText(team);
            Picasso.get().load(logo).resize(70,50).into(image13);
            rs.next();
            logo = rs.getNString("logos");
            team= rs.getNString("team_name");
            text14.setText(team);
            Picasso.get().load(logo).resize(70,50).into(image14);
            rs.next();
            logo = rs.getNString("logos");
            team= rs.getNString("team_name");
            text15.setText(team);
            Picasso.get().load(logo).resize(70,50).into(image15);
            rs.next();
            logo = rs.getNString("logos");
            team= rs.getNString("team_name");
            text16.setText(team);
            Picasso.get().load(logo).resize(70,50).into(image16);
            rs.next();
            logo = rs.getNString("logos");
            team= rs.getNString("team_name");
            text17.setText(team);
            Picasso.get().load(logo).resize(70,55).into(image17);
            rs.next();
            logo = rs.getNString("logos");
            team= rs.getNString("team_name");
            text18.setText(team);
            Picasso.get().load(logo).resize(70,50).into(image18);
            rs.next();
            logo = rs.getNString("logos");
            team= rs.getNString("team_name");
            text20.setText(team);
            Picasso.get().load(logo).resize(70,50).into(image19);
            rs.next();
            logo = rs.getNString("logos");
            team= rs.getNString("team_name");
            text21.setText(team);
            Picasso.get().load(logo).resize(70,50).into(image20);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }



    }

    public void ligbScorers(View v)
    {
        startActivity(new Intent(this,LigbScorers.class));
    }
    public void ligbAssistants(View v)
    {
        startActivity(new Intent(this,LigbAssistants.class));
    }
    public void ligbMatches(View v)
    {
        startActivity(new Intent(this,Ligbmatches.class));
    }


}

