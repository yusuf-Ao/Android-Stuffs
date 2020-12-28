package com.aycodes.myapplication;
//Created by Ahmed Yusuf.
//Copyright @ay.codes

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Fullscreen view
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Assign variables
        lottieAnimationView= findViewById(R.id.react_img);

        //Initialize react image animation
        lottieAnimationView.animate()
                .rotationBy(1200)
                .setDuration(2000)
                .setStartDelay(3000);


    }
}