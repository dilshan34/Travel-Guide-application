package com.example.splash;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class srilanka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_srilanka);
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
                det.setText("Sri Lanka, officially the Democratic Socialist Republic of Sri Lanka, is an island country in South Asia, Located in the Indian Ocean southwest of the Bay of Bengal and southeast of the Arabian Sea.");
            }
        });

        cur.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                det.setText("Rupees");
            }
        });
        lan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                det.setText("Sinhala and English");
            }
        });
        cap.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                det.setText("Colombo");
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
        Intent cities = new Intent(this, cityinsrilanka.class);
        startActivity(cities);
    }
}
