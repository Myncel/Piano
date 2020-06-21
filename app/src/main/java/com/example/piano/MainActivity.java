package com.example.piano;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button DO_low;
    Button RE;
    Button MI;
    Button FA;
    Button SOL;
    Button LA;
    Button SI;
    Button DO_high;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DO_low = (Button)findViewById(R.id.buttonDO_low);
        final MediaPlayer DO_soundMP = MediaPlayer.create(this,R.raw.do_low);
        DO_low.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DO_soundMP.start();
            }
        });

        RE = (Button)findViewById(R.id.buttonRE);
        final MediaPlayer RE_soundMP = MediaPlayer.create(this,R.raw.re);
        RE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RE_soundMP.start();
            }
        });

        MI = (Button)findViewById(R.id.buttonMI);
        final MediaPlayer MI_soundMP = MediaPlayer.create(this,R.raw.mi);
        MI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MI_soundMP.start();
            }
        });

        FA = (Button)findViewById(R.id.buttonFA);
        final MediaPlayer FA_soundMP = MediaPlayer.create(this,R.raw.fa);
        FA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FA_soundMP.start();
            }
        });

        SOL = (Button)findViewById(R.id.buttonSOL);
        final MediaPlayer SOL_soundMP = MediaPlayer.create(this,R.raw.sol);
        SOL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SOL_soundMP.start();
            }
        });

        LA = (Button)findViewById(R.id.buttonLA);
        final MediaPlayer LA_soundMP = MediaPlayer.create(this,R.raw.la);
        LA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LA_soundMP.start();
            }
        });

        SI = (Button)findViewById(R.id.buttonSI);
        final MediaPlayer SI_soundMP = MediaPlayer.create(this,R.raw.si);
        SI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SI_soundMP.start();
            }
        });

        DO_high = (Button)findViewById(R.id.buttonDO_high);
        final MediaPlayer DO1_soundMP = MediaPlayer.create(this,R.raw.do_high);
        DO_high.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DO1_soundMP.start();
            }
        });
    }
}
