package com.example.splash;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class index extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_index);


    }





    public void s1(View view) {
        Intent sl = new Intent(this, srilanka.class);
        startActivity(sl);
    }

    public void aus(View view) {
        Intent aus = new Intent(this, australia.class);
        startActivity(aus);
    }

    public void brz(View view) {
        Intent brz = new Intent(this, brazil.class);
        startActivity(brz);
    }

    public void can(View view) {
        Intent can = new Intent(this, canada.class);
        startActivity(can);
    }

    public void chn(View view) {
        Intent chn = new Intent(this, china.class);
        startActivity(chn);
    }

    public void itl(View view) {
        Intent itl = new Intent(this, italy.class);
        startActivity(itl);
    }

    public void frn(View view) {
        Intent frn = new Intent(this, newzeland.class);
        startActivity(frn);
    }
    public void nor(View view) {
        Intent nor = new Intent(this, norway.class);
        startActivity(nor);
    }
    public void ire(View view) {
        Intent ire = new Intent(this, ireland.class);
        startActivity(ire);
    }
}