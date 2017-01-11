package com.example.android.songquest;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

// References for toolbar, app bar and SearchView work:
// https://developer.android.com/training/appbar/setting-up.html
// https://developer.android.com/guide/topics/resources/menu-resource.html
// https://developer.android.com/training/search/index.html
// http://stackoverflow.com/questions/27227219/searchview-doesnt-appear-in-toolbar-android-lollipop
// http://stackoverflow.com/questions/13912003/searchmanager-getsearchableinfogetcomponentname-returns-null
// http://stackoverflow.com/questions/5094222/android-return-search-query-to-current-activity

public class MainActivity extends AppCompatActivity {

    // Declarations for all of the genre buttons
    // Reference for binding views: https://www.sitepoint.com/tidying-code-with-android-butterknife/
    @BindView(R.id.rap_button)
    Button rapButton;
    @BindView(R.id.country_button)
    Button countryButton;
    @BindView(R.id.pop_button)
    Button popButton;
    @BindView(R.id.rock_button)
    Button rockButton;
    @BindView(R.id.rAndB_button)
    Button rAndBButton;
    @BindView(R.id.indie_button)
    Button indieButton;

    @OnClick(R.id.rap_button)
    public void rapIntent(View view) {
        Intent intent = new Intent(MainActivity.this, GenreActivity.class);
        intent.putExtra(getString(R.string.key_name), getString(R.string.rap_title));

        intent.putExtra(getString(R.string.key_song1), getString(R.string.rap_song1));
        intent.putExtra(getString(R.string.key_song2), getString(R.string.rap_song2));
        intent.putExtra(getString(R.string.key_song3), getString(R.string.rap_song3));

        intent.putExtra(getString(R.string.key_song1_artist), getString(R.string.rap_song1_artist));
        intent.putExtra(getString(R.string.key_song2_artist), getString(R.string.rap_song2_artist));
        intent.putExtra(getString(R.string.key_song3_artist), getString(R.string.rap_song3_artist));

        intent.putExtra(getString(R.string.key_song1_duration), getString(R.string.rap_song1_duration));
        intent.putExtra(getString(R.string.key_song2_duration), getString(R.string.rap_song2_duration));
        intent.putExtra(getString(R.string.key_song3_duration), getString(R.string.rap_song3_duration));

        startActivity(intent);
    }

    @OnClick(R.id.country_button)
    public void countryIntent(View view) {
        Intent intent = new Intent(MainActivity.this, GenreActivity.class);
        intent.putExtra(getString(R.string.key_name), getString(R.string.country_title));

        intent.putExtra(getString(R.string.key_song1), getString(R.string.country_song1));
        intent.putExtra(getString(R.string.key_song2), getString(R.string.country_song2));
        intent.putExtra(getString(R.string.key_song3), getString(R.string.country_song3));

        intent.putExtra(getString(R.string.key_song1_artist), getString(R.string.country_song1_artist));
        intent.putExtra(getString(R.string.key_song2_artist), getString(R.string.country_song2_artist));
        intent.putExtra(getString(R.string.key_song3_artist), getString(R.string.country_song3_artist));

        intent.putExtra(getString(R.string.key_song1_duration), getString(R.string.country_song1_duration));
        intent.putExtra(getString(R.string.key_song2_duration), getString(R.string.country_song2_duration));
        intent.putExtra(getString(R.string.key_song3_duration), getString(R.string.country_song3_duration));

        startActivity(intent);
    }

    @OnClick(R.id.pop_button)
    public void popIntent(View view) {
        Intent intent = new Intent(MainActivity.this, GenreActivity.class);
        intent.putExtra(getString(R.string.key_name), getString(R.string.pop_title));

        intent.putExtra(getString(R.string.key_song1), getString(R.string.pop_song1));
        intent.putExtra(getString(R.string.key_song2), getString(R.string.pop_song2));
        intent.putExtra(getString(R.string.key_song3), getString(R.string.pop_song3));

        intent.putExtra(getString(R.string.key_song1_artist), getString(R.string.pop_song1_artist));
        intent.putExtra(getString(R.string.key_song2_artist), getString(R.string.pop_song2_artist));
        intent.putExtra(getString(R.string.key_song3_artist), getString(R.string.pop_song3_artist));

        intent.putExtra(getString(R.string.key_song1_duration), getString(R.string.pop_song1_duration));
        intent.putExtra(getString(R.string.key_song2_duration), getString(R.string.pop_song2_duration));
        intent.putExtra(getString(R.string.key_song3_duration), getString(R.string.pop_song3_duration));

        startActivity(intent);
    }

    @OnClick(R.id.rock_button)
    public void rockIntent(View view) {
        Intent intent = new Intent(MainActivity.this, GenreActivity.class);
        intent.putExtra(getString(R.string.key_name), getString(R.string.rock_title));

        intent.putExtra(getString(R.string.key_song1), getString(R.string.rock_song1));
        intent.putExtra(getString(R.string.key_song2), getString(R.string.rock_song2));
        intent.putExtra(getString(R.string.key_song3), getString(R.string.rock_song3));

        intent.putExtra(getString(R.string.key_song1_artist), getString(R.string.rock_song1_artist));
        intent.putExtra(getString(R.string.key_song2_artist), getString(R.string.rock_song2_artist));
        intent.putExtra(getString(R.string.key_song3_artist), getString(R.string.rock_song3_artist));

        intent.putExtra(getString(R.string.key_song1_duration), getString(R.string.rock_song1_duration));
        intent.putExtra(getString(R.string.key_song2_duration), getString(R.string.rock_song2_duration));
        intent.putExtra(getString(R.string.key_song3_duration), getString(R.string.rock_song3_duration));

        startActivity(intent);
    }

    @OnClick(R.id.rAndB_button)
    public void rAndBIntent(View view) {
        Intent intent = new Intent(MainActivity.this, GenreActivity.class);
        intent.putExtra(getString(R.string.key_name), getString(R.string.rAndB_title));

        intent.putExtra(getString(R.string.key_song1), getString(R.string.rAndB_song1));
        intent.putExtra(getString(R.string.key_song2), getString(R.string.rAndB_song2));
        intent.putExtra(getString(R.string.key_song3), getString(R.string.rAndB_song3));

        intent.putExtra(getString(R.string.key_song1_artist), getString(R.string.rAndB_song1_artist));
        intent.putExtra(getString(R.string.key_song2_artist), getString(R.string.rAndB_song2_artist));
        intent.putExtra(getString(R.string.key_song3_artist), getString(R.string.rAndB_song3_artist));

        intent.putExtra(getString(R.string.key_song1_duration), getString(R.string.rAndB_song1_duration));
        intent.putExtra(getString(R.string.key_song2_duration), getString(R.string.rAndB_song2_duration));
        intent.putExtra(getString(R.string.key_song3_duration), getString(R.string.rAndB_song3_duration));

        startActivity(intent);
    }

    @OnClick(R.id.indie_button)
    public void indieIntent(View view) {
        Intent intent = new Intent(MainActivity.this, GenreActivity.class);
        intent.putExtra(getString(R.string.key_name), getString(R.string.indie_title));

        intent.putExtra(getString(R.string.key_song1), getString(R.string.indie_song1));
        intent.putExtra(getString(R.string.key_song2), getString(R.string.indie_song2));
        intent.putExtra(getString(R.string.key_song3), getString(R.string.indie_song3));

        intent.putExtra(getString(R.string.key_song1_artist), getString(R.string.indie_song1_artist));
        intent.putExtra(getString(R.string.key_song2_artist), getString(R.string.indie_song2_artist));
        intent.putExtra(getString(R.string.key_song3_artist), getString(R.string.indie_song3_artist));

        intent.putExtra(getString(R.string.key_song1_duration), getString(R.string.indie_song1_duration));
        intent.putExtra(getString(R.string.key_song2_duration), getString(R.string.indie_song2_duration));
        intent.putExtra(getString(R.string.key_song3_duration), getString(R.string.indie_song3_duration));

        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        ButterKnife.bind(this);

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

    private void handleIntent(Intent intent) {
        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);

            intent = new Intent(MainActivity.this, SearchResultsActivity.class);
            intent.putExtra(getString(R.string.search_results), query);
            startActivity(intent);
        }
    }
}
