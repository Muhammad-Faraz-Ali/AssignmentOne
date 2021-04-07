package com.example.bsef18m043_a_01_animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class B extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        VideoView videoView2=findViewById(R.id.videoView2);
        videoView2.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video_02);

        MediaController mediaController=new MediaController(this);
        mediaController.setAnchorView(videoView2);
        videoView2.setMediaController(mediaController);

        videoView2.start();
    }
}