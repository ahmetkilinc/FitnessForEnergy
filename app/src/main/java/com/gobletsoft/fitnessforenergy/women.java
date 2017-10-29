package com.gobletsoft.fitnessforenergy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.liuguangqiang.swipeback.SwipeBackActivity;
import com.liuguangqiang.swipeback.SwipeBackLayout;

public class women extends SwipeBackActivity {

    private static final String TAG = "women";

    private AdView mAdView;

    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_women);
        setDragEdge(SwipeBackLayout.DragEdge.LEFT);


        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-0063127843759701/8243857423");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        mAdView = (AdView) findViewById(R.id.adview);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        Button btnKKilovermek = (Button) findViewById(R.id.btnKKilovermek);
        Button btnKFitOlmak = (Button) findViewById(R.id.btnKFitOlmak);

        btnKKilovermek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(women.this, womenKiloVermek.class);
                startActivity(intent);

                if (mInterstitialAd.isLoaded()) {

                    mInterstitialAd.show();
                } else {

                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });

        btnKFitOlmak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(women.this, WomenFitOlmak.class);
                startActivity(intent);

                if (mInterstitialAd.isLoaded()) {

                    mInterstitialAd.show();
                } else {

                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
    }
}
