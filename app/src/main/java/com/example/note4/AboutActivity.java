package com.example.note4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // display the app version
        String versionName = BuildConfig.VERSION_NAME;
        TextView appVersionTextView = findViewById(R.id.appVersionTextView);
        appVersionTextView.setText(getString(R.string.app_version_name, versionName));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
