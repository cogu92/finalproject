package com.example.dell.finalproject;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MediaPlayer.OnPreparedListener {


    private MediaPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mPlayer = MediaPlayer.create(this, R.raw.bensoundbrazilsamba);
        this.mPlayer.start();
    }


    @Override
    public void onPrepared(MediaPlayer mp) {

    }
}
