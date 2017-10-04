package com.gobletsoft.fitnessforenergy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class menFitOlmak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_men_fit_olmak);

        Button btnBilgi = (Button) findViewById(R.id.btnBilgi);

        btnBilgi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for (int i = 0; i <= 1; i++) {

                    Toast.makeText(getApplicationContext(), "Bu idmanla temel hareketlerle vücuda gerekli yüklemeyi vermesi ve her bölgenin maximum düzeyde\n" +
                            "çalıştırılması hedeflenmiştir.\n" +
                            "Birer gün arayla haftada 3 idman yapılması maximum verimi almanızı sağlayacaktır. Eğer yaparken\n" +
                            "zorlanmıyorsanız set sayısını 4’e çıkarabilirsiniz.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
