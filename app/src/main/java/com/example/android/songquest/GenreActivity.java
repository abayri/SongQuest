package com.example.android.songquest;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class GenreActivity extends AppCompatActivity {

    @BindView(R.id.genre_text) TextView genreText;

    @BindView(R.id.song1) TextView song1;
    @BindView(R.id.song2) TextView song2;
    @BindView(R.id.song3) TextView song3;

    @BindView(R.id.song1_artist) TextView song1Artist;
    @BindView(R.id.song2_artist) TextView song2Artist;
    @BindView(R.id.song3_artist) TextView song3Artist;

    @BindView(R.id.song1_duration) TextView song1Duration;
    @BindView(R.id.song2_duration) TextView song2Duration;
    @BindView(R.id.song3_duration) TextView song3Duration;

    @OnClick(R.id.song1_group)
    public void song1Intent(View view) {
        Intent intent = new Intent(GenreActivity.this, PlayActivity.class);
        intent.putExtra(getString(R.string.play_song), song1.getText().toString());
        intent.putExtra(getString(R.string.play_artist), song1Artist.getText().toString());
        intent.putExtra(getString(R.string.play_duration), song1Duration.getText().toString());
        startActivity(intent);
    }

    @OnClick(R.id.song2_group)
    public void song2Intent(View view) {
        Intent intent = new Intent(GenreActivity.this, PlayActivity.class);
        intent.putExtra(getString(R.string.play_song), song2.getText().toString());
        intent.putExtra(getString(R.string.play_artist), song2Artist.getText().toString());
        intent.putExtra(getString(R.string.play_duration), song2Duration.getText().toString());
        startActivity(intent);
    }

    @OnClick(R.id.song3_group)
    public void song3Intent(View view) {
        Intent intent = new Intent(GenreActivity.this, PlayActivity.class);
        intent.putExtra(getString(R.string.play_song), song3.getText().toString());
        intent.putExtra(getString(R.string.play_artist), song3Artist.getText().toString());
        intent.putExtra(getString(R.string.play_duration), song3Duration.getText().toString());
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        // http://stackoverflow.com/questions/26651602/display-back-arrow-on-toolbar-android
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ButterKnife.bind(this);

        Intent intent = getIntent();
        genreText.setText(intent.getStringExtra(getString(R.string.key_name)));

        song1.setText(intent.getStringExtra(getString(R.string.key_song1)));
        song2.setText(intent.getStringExtra(getString(R.string.key_song2)));
        song3.setText(intent.getStringExtra(getString(R.string.key_song3)));

        song1Artist.setText(intent.getStringExtra(getString(R.string.key_song1_artist)));
        song2Artist.setText(intent.getStringExtra(getString(R.string.key_song2_artist)));
        song3Artist.setText(intent.getStringExtra(getString(R.string.key_song3_artist)));

        song1Duration.setText(intent.getStringExtra(getString(R.string.key_song1_duration)));
        song2Duration.setText(intent.getStringExtra(getString(R.string.key_song2_duration)));
        song3Duration.setText(intent.getStringExtra(getString(R.string.key_song3_duration)));

        handleIntent(getIntent());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);

        // Associate searchable configuration with the SearchView
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB)
        {
            SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
            SearchView searchView = (SearchView) menu.findItem(R.id.search).getActionView();
            searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        }

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        setIntent(intent);
        handleIntent(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent intent = new Intent(GenreActivity.this, MainActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    private void handleIntent(Intent intent) {
        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);

            intent = new Intent(GenreActivity.this, SearchResultsActivity.class);
            intent.putExtra(getString(R.string.search_results), query);
            startActivity(intent);
        }
    }
}
