package com.gobletsoft.fitnessforenergy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class men extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_men);

        Button btnEKilovermek = (Button) findViewById(R.id.btnEKilovermek);
        Button btnEFitOlmak = (Button) findViewById(R.id.btnEFitOlmak);

        btnEKilovermek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(men.this, menKiloVermek.class);
                startActivity(intent);
            }
        });

        btnEFitOlmak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(men.this, menFitOlmak.class);
                startActivity(intent);
            }
        });
    }
}
