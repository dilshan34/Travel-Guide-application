package com.example.splash;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class france extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_france);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final TextView det = findViewById(R.id.details);

        Button cur = findViewById(R.id.currency);
        Button lan = findViewById(R.id.language);
        Button cap = findViewById(R.id.capital);
        Button other = findViewById(R.id.ocities);
        TextView oview = findViewById(R.id.oviewr);


        oview.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                det.setText("Australia, officially the Commonwealth of Australia, is a sovereign country comprising the mainland of the Australian continent, the island of Tasmania, and numerous smaller islands. It is the largest country in Oceania and the world's sixth-largest country by total area. ");
            }
        });

        cur.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                det.setText("Euro");
            }
        });
        lan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                det.setText("English");
            }
        });
        cap.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                det.setText("French");
            }
        });
        other.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                opencities();
            }
        });
    }
    public void opencities(){
        Intent cities = new Intent(this, cityinfrance.class);
        startActivity(cities);
    }

}