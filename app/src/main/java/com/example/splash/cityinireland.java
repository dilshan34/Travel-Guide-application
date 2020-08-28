package com.example.splash;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class cityinireland extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_cityinireland);
    }
    public void sl(View view) {
        Intent sl = new Intent(this, ireland.class);
        startActivity(sl);
    }
    public void s2(View view) {
        Intent s2 = new Intent(this, ireland.class);
        startActivity(s2);
    }
    public void s3(View view) {
        Intent s3 = new Intent(this, ireland.class);
        startActivity(s3);
    }
    public void s4(View view) {
        Intent s4 = new Intent(this, ireland.class);
        startActivity(s4);
    }
    public void s5(View view) {
        Intent s5 = new Intent(this, ireland.class);
        startActivity(s5);
    }
}