package com.example.zack.mp3play;

import android.content.res.AssetFileDescriptor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;
public class MainActivity extends AppCompatActivity {
    MediaPlayer mPlayer ;
    int playstate=0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button_id);

        mPlayer = MediaPlayer.create(this, R.raw.bass);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("hello");
                // Code here executes on main thread after user presses button
                if(playstate==0){
                    mPlayer.seekTo(0);
                    mPlayer.start();
                    playstate=1;

                }else{
                    mPlayer.stop();
                    playstate=0;
                    try {
                        mPlayer.prepare();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }



            }
        });
    }



}
