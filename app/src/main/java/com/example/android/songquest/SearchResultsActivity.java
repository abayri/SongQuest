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
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SearchResultsActivity extends AppCompatActivity {

    @BindView(R.id.description) TextView resultsSentence;
    @BindView(R.id.results_id) TextView resultsDescription;

    @BindView(R.id.song1_group) RelativeLayout songGroup;

    @BindView(R.id.song1) TextView song;
    @BindView(R.id.song1_artist) TextView songArtist;
    @BindView(R.id.song1_duration) TextView songDuration;

    int numberOfSongs = 18;

    @OnClick(R.id.song1_group)
    public void song1Intent(View view) {
        Intent intent = new Intent(SearchResultsActivity.this, PlayActivity.class);
        intent.putExtra(getString(R.string.play_song), song.getText().toString());
        intent.putExtra(getString(R.string.play_artist), songArtist.getText().toString());
        intent.putExtra(getString(R.string.play_duration), songDuration.getText().toString());
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_results);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        String[] listOfSongs = new String[numberOfSongs];
        listOfSongs[0] = getString(R.string.rap_song1);
        listOfSongs[1] = getString(R.string.rap_song2);
        listOfSongs[2] = getString(R.string.rap_song3);
        listOfSongs[3] = getString(R.string.country_song1);
        listOfSongs[4] = getString(R.string.country_song2);
        listOfSongs[5] = getString(R.string.country_song3);
        listOfSongs[6] = getString(R.string.pop_song1);
        listOfSongs[7] = getString(R.string.pop_song2);
        listOfSongs[8] = getString(R.string.pop_song3);
        listOfSongs[9] = getString(R.string.rock_song1);
        listOfSongs[10] = getString(R.string.rock_song2);
        listOfSongs[11] = getString(R.string.rock_song3);
        listOfSongs[12] = getString(R.string.rAndB_song1);
        listOfSongs[13] = getString(R.string.rAndB_song2);
        listOfSongs[14] = getString(R.string.rAndB_song3);
        listOfSongs[15] = getString(R.string.indie_song1);
        listOfSongs[16] = getString(R.string.indie_song2);
        listOfSongs[17] = getString(R.string.indie_song3);

        String[] listOfSongArtists = new String[numberOfSongs];
        listOfSongArtists[0] = getString(R.string.rap_song1_artist);
        listOfSongArtists[1] = getString(R.string.rap_song2_artist);
        listOfSongArtists[2] = getString(R.string.rap_song3_artist);
        listOfSongArtists[3] = getString(R.string.country_song1_artist);
        listOfSongArtists[4] = getString(R.string.country_song2_artist);
        listOfSongArtists[5] = getString(R.string.country_song3_artist);
        listOfSongArtists[6] = getString(R.string.pop_song1_artist);
        listOfSongArtists[7] = getString(R.string.pop_song2_artist);
        listOfSongArtists[8] = getString(R.string.pop_song3_artist);
        listOfSongArtists[9] = getString(R.string.rock_song1_artist);
        listOfSongArtists[10] = getString(R.string.rock_song2_artist);
        listOfSongArtists[11] = getString(R.string.rock_song3_artist);
        listOfSongArtists[12] = getString(R.string.rAndB_song1_artist);
        listOfSongArtists[13] = getString(R.string.rAndB_song2_artist);
        listOfSongArtists[14] = getString(R.string.rAndB_song3_artist);
        listOfSongArtists[15] = getString(R.string.indie_song1_artist);
        listOfSongArtists[16] = getString(R.string.indie_song2_artist);
        listOfSongArtists[17] = getString(R.string.indie_song3_artist);

        String[] listOfSongDurations = new String[numberOfSongs];
        listOfSongDurations[0] = getString(R.string.rap_song1_duration);
        listOfSongDurations[1] = getString(R.string.rap_song2_duration);
        listOfSongDurations[2] = getString(R.string.rap_song3_duration);
        listOfSongDurations[3] = getString(R.string.country_song1_duration);
        listOfSongDurations[4] = getString(R.string.country_song2_duration);
        listOfSongDurations[5] = getString(R.string.country_song3_duration);
        listOfSongDurations[6] = getString(R.string.pop_song1_duration);
        listOfSongDurations[7] = getString(R.string.pop_song2_duration);
        listOfSongDurations[8] = getString(R.string.pop_song3_duration);
        listOfSongDurations[9] = getString(R.string.rock_song1_duration);
        listOfSongDurations[10] = getString(R.string.rock_song2_duration);
        listOfSongDurations[11] = getString(R.string.rock_song3_duration);
        listOfSongDurations[12] = getString(R.string.rAndB_song1_duration);
        listOfSongDurations[13] = getString(R.string.rAndB_song2_duration);
        listOfSongDurations[14] = getString(R.string.rAndB_song3_duration);
        listOfSongDurations[15] = getString(R.string.indie_song1_duration);
        listOfSongDurations[16] = getString(R.string.indie_song2_duration);
        listOfSongDurations[17] = getString(R.string.indie_song3_duration);

        ButterKnife.bind(this);

        resultsSentence.setVisibility(View.GONE);
        resultsDescription.setVisibility(View.GONE);
        songGroup.setVisibility(View.GONE);
        song.setVisibility(View.GONE);
        songArtist.setVisibility(View.GONE);
        songDuration.setVisibility(View.GONE);

        Intent intent = getIntent();
        String songSearch = intent.getStringExtra(getString(R.string.search_results));
        int counter = 0;

        if (songSearch != null) {
            for (int i = 0; i < numberOfSongs; i++) {
                if (songSearch.equals(listOfSongs[i]) || songSearch.equals(listOfSongArtists[i])) {
                    song.setText(listOfSongs[i]);
                    songArtist.setText(listOfSongArtists[i]);
                    songDuration.setText(listOfSongDurations[i]);

                    songGroup.setVisibility(View.VISIBLE);
                    song.setVisibility(View.VISIBLE);
                    songArtist.setVisibility(View.VISIBLE);
                    songDuration.setVisibility(View.VISIBLE);

                    counter++;
                }
            }
        }

        if (counter == 0) {
            resultsDescription.setText(intent.getStringExtra(getString(R.string.search_results)));

            resultsSentence.setVisibility(View.VISIBLE);
            resultsDescription.setVisibility(View.VISIBLE);
        }

        handleIntent(getIntent());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);

        // Associate searchable configuration with the SearchView
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
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
            Intent intent = new Intent(SearchResultsActivity.this, MainActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    private void handleIntent(Intent intent) {
        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);

            intent = new Intent(SearchResultsActivity.this, SearchResultsActivity.class);
            intent.putExtra(getString(R.string.search_results), query);
            startActivity(intent);
        }
    }

    public void onBackPressed() {
        Intent intent = new Intent(SearchResultsActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
