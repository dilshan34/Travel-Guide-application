package com.example.splash;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class canada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_canada);

        final TextView det = findViewById(R.id.details);

        Button cur = findViewById(R.id.currency);
        Button lan = findViewById(R.id.language);
        Button cap = findViewById(R.id.capital);
        Button other = findViewById(R.id.ocities);
        TextView oview = findViewById(R.id.oviewr);


        oview.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                det.setText("Canada is a country in the northern part of North America. Its ten provinces and three territories extend from the Atlantic to the Pacific and northward into the Arctic Ocean, covering 9.98 million square kilometres, making it the world's second-largest country by total area. ");
            }
        });

        cur.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                det.setText("Canadian Dollars");
            }
        });
        lan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                det.setText("English | French");
            }
        });
        cap.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                det.setText("Ottawa");
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
        Intent cities = new Intent(this, cityincanada.class);
        startActivity(cities);
    }

}