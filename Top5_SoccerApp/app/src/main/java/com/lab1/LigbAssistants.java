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

public class LigbAssistants extends AppCompatActivity {

    ImageView image;
    Connection con;
    String team, player, logo;
    int assists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lbassistants);
        image = findViewById(R.id.imageViewA);
        ConnectionClass con = new ConnectionClass();
        this.con = con.CONN();
        Statement st = null;
        try {
            st = this.con.createStatement();
            ResultSet rs = st.executeQuery("select * from ligabbva_assists");
            ImageView image1 = findViewById(R.id.imageView1);
            ImageView image2 = findViewById(R.id.imageView2);
            ImageView image3 = findViewById(R.id.imageView3);
            ImageView image4 = findViewById(R.id.imageView4);
            ImageView image5 = findViewById(R.id.imageView5);
            ImageView image6 = findViewById(R.id.imageView6);
            ImageView image7 = findViewById(R.id.imageView7);
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
            rs.next();
            player = rs.getNString("player");
            System.out.println(player);
            team = rs.getNString("team");
            logo= rs.getNString("picture");
            assists = rs.getInt("assists");
            text1.setText(player);
            text2.setText(team);
            text15.setText(Integer.toString(assists));
            Picasso.get().load(logo).resize(70, 70).into(image1);
            rs.next();
            player = rs.getNString("player");
            team = rs.getNString("team");
            logo= rs.getNString("picture");
            assists = rs.getInt("assists");
            text3.setText(player);
            text4.setText(team);
            text16.setText(Integer.toString(assists));
            Picasso.get().load(logo).resize(70, 70).into(image2);
            rs.next();
            player = rs.getNString("player");
            team = rs.getNString("team");
            logo= rs.getNString("picture");
            assists = rs.getInt("assists");
            text5.setText(player);
            text6.setText(team);
            text17.setText(Integer.toString(assists));
            Picasso.get().load(logo).resize(70, 70).into(image3);
            rs.next();
            player = rs.getNString("player");
            team = rs.getNString("team");
            logo= rs.getNString("picture");
            assists = rs.getInt("assists");
            text7.setText(player);
            text8.setText(team);
            text18.setText(Integer.toString(assists));
            Picasso.get().load(logo).resize(70, 70).into(image4);
            rs.next();
            player = rs.getNString("player");
            team = rs.getNString("team");
            logo= rs.getNString("picture");
            assists = rs.getInt("assists");
            text9.setText(player);
            text10.setText(team);
            text19.setText(Integer.toString(assists));
            Picasso.get().load(logo).resize(70, 70).into(image5);
            rs.next();
            player = rs.getNString("player");
            team = rs.getNString("team");
            logo= rs.getNString("picture");
            assists = rs.getInt("assists");
            text11.setText(player);
            text12.setText(team);
            text20.setText(Integer.toString(assists));
            Picasso.get().load(logo).resize(70, 70).into(image6);
            rs.next();
            player = rs.getNString("player");
            team = rs.getNString("team");
            logo= rs.getNString("picture");
            assists = rs.getInt("assists");
            text13.setText(player);
            text14.setText(team);
            text21.setText(Integer.toString(assists));
            Picasso.get().load(logo).resize(70, 70).into(image7);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
