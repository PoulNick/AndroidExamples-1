package com.kotrots.soundexample;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    boolean isPlaying = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn_play = (Button) findViewById(R.id.button);
        final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.sound);

        btn_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPlaying) {
                    btn_play.setText("Play");
                    mediaPlayer.pause();
                    isPlaying = false;
                }
                else {
                    btn_play.setText("Pause");
                    mediaPlayer.start();
                    isPlaying = true;
                }

            }
        });
    }
}
