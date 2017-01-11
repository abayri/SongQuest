package com.example.android.songquest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PlayActivity extends AppCompatActivity {

    @BindView(R.id.songPlay)
    TextView songPlay;
    @BindView(R.id.songArtistPlay)
    TextView songArtistPlay;
    @BindView(R.id.songDurationPlay)
    TextView songDurationPlay;

    @OnClick(R.id.playButton)
    public void playIntent(View view) {
        Toast.makeText(PlayActivity.this, getString(R.string.play_toast1), Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.previousButton)
    public void previousIntent(View view) {
        Toast.makeText(PlayActivity.this, getString(R.string.play_toast2), Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.nextButton)
    public void nextIntent(View view) {
        Toast.makeText(PlayActivity.this, getString(R.string.play_toast3), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        ButterKnife.bind(this);

        Intent intent = getIntent();

        songPlay.setText(intent.getStringExtra(getString(R.string.play_song)));
        songArtistPlay.setText(intent.getStringExtra(getString(R.string.play_artist)));
        songDurationPlay.setText(intent.getStringExtra(getString(R.string.play_duration)));
    }
}
