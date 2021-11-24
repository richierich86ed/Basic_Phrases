package com.example.basic_phrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void hello(View view) {

        bt = findViewById(R.id.button1);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.hello);
        bt.setOnClickListener(v -> mp.start());

    }

    public void goodAfternoon(View view) {

        bt = findViewById(R.id.button2);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.good_afternoon);
        bt.setOnClickListener(v -> mp.start());

    }

    public void goodEvening(View view) {

        bt = findViewById(R.id.button3);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.good_evening);
        bt.setOnClickListener(v -> mp.start());

    }

    public void hiBye(View view) {

        bt = findViewById(R.id.button4);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.hi_bye);
        bt.setOnClickListener(v -> mp.start());
    }

    public void goodbye(View view) {

        bt = findViewById(R.id.button5);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.goodbye);
        bt.setOnClickListener(v -> mp.start());
    }

    public void please(View view) {

        bt = findViewById(R.id.button6);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.please);
        bt.setOnClickListener(v -> mp.start());
    }

    public void seeYou(View view) {

        bt = findViewById(R.id.button7);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.seeyou);
        bt.setOnClickListener(v -> mp.start());

    }

    public void seeYouLater(View view) {

        bt = findViewById(R.id.button8);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.seeyou_later);
        bt.setOnClickListener(v -> mp.start());

    }

    public void seeYouSoon(View view) {

        bt = findViewById(R.id.button9);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.seeyou_soon);
        bt.setOnClickListener(v -> mp.start());

    }

    public void seeYouTomorrow(View view) {

        bt = findViewById(R.id.button10);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.seeyou_tomorrow);
        bt.setOnClickListener(v -> mp.start());

    }

    public void thankYou(View view) {

        bt = findViewById(R.id.button11);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.thankyou_verymuch);
        bt.setOnClickListener(v -> mp.start());

    }

    public void youreWelcome(View view) {

        bt = findViewById(R.id.button12);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.youre_welcome);
        bt.setOnClickListener(v -> mp.start());

    }

    public void welcome(View view) {

        bt = findViewById(R.id.button13);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.welcome);
        bt.setOnClickListener(v -> mp.start());

    }

    public void imSorry(View view) {

        bt = findViewById(R.id.button14);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.im_sorry);
        bt.setOnClickListener(v -> mp.start());

    }

    public void excuseMe(View view) {

        bt = findViewById(R.id.button15);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.excuse_me);
        bt.setOnClickListener(v -> mp.start());

    }
}