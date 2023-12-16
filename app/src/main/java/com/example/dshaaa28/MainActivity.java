package com.example.dshaaa28;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Получимссылкунасолнце
        ImageView sunImageView = findViewById(R.id.sun);
        // Анимациядлявосходасолнца
        Animation sunRiseAnimation = AnimationUtils.loadAnimation(this, R.anim.rise);
        // Подключаеманимациюкнужному View
        sunImageView.startAnimation(sunRiseAnimation);
        ImageView clockImageView = findViewById(R.id.clock);
        // анимациядлявращениячасов
        Animation clockTurnAnimation = AnimationUtils.loadAnimation(this, R.anim.clock_turn);
        clockImageView.startAnimation(clockTurnAnimation);
        // получим ссылку на часовую стрелку
        ImageView hourImageView = findViewById(R.id.hour_hand);
         // анимациядлястрелки
        Animation hourTurnAnimation = AnimationUtils.loadAnimation(this, R.anim.hour_turn);
        // присоединяеманимацию
        hourImageView.startAnimation(hourTurnAnimation);


    }


}
