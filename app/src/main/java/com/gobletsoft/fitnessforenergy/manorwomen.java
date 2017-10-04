package com.gobletsoft.fitnessforenergy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class manorwomen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_manorwomen);

        Button btnErkek = (Button) findViewById(R.id.btnErkek);
        Button btnKadin = (Button) findViewById(R.id.btnKadin);

        btnErkek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(manorwomen.this, men.class);
                startActivity(intent);
            }
        });

        btnKadin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(manorwomen.this, women.class);
                startActivity(intent);
            }
        });
    }
}
