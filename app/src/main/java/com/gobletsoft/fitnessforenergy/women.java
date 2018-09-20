package com.gobletsoft.fitnessforenergy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.liuguangqiang.swipeback.SwipeBackActivity;
import com.liuguangqiang.swipeback.SwipeBackLayout;

public class women extends SwipeBackActivity {

    private static final String TAG = "women";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_women);
        setDragEdge(SwipeBackLayout.DragEdge.LEFT);

        Button btnKKilovermek = (Button) findViewById(R.id.btnKKilovermek);
        Button btnKFitOlmak = (Button) findViewById(R.id.btnKFitOlmak);

        btnKKilovermek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(women.this, womenKiloVermek.class);
                startActivity(intent);
            }
        });

        btnKFitOlmak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(women.this, WomenFitOlmak.class);
                startActivity(intent);

            }
        });
    }
}
