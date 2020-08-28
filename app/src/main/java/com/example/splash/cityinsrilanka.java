package com.example.splash;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class cityinsrilanka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_cityinsrilanka);




    }

    public void s2(View view) {
        Intent s2 = new Intent(this, srilanka.class);
        startActivity(s2);

    }
    public void s3(View view) {
        Intent s3 = new Intent(this, srilanka.class);
        startActivity(s3);
    }
    public void s4(View view) {
        Intent s4 = new Intent(this, srilanka.class);
        startActivity(s4);
    }
    public void s5(View view) {
        Intent s5 = new Intent(this, srilanka.class);
        startActivity(s5);
    }
    public void s6(View view) {
        Intent s6 = new Intent(this, srilanka.class);
        startActivity(s6);
    }
}
