package com.example.dhuro;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Puzzles extends AppCompatActivity {
    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzles);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        // Set Home selected
        bottomNavigationView.setSelectedItemId(R.id.puzzles);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.home:
                    startActivity(new Intent(getApplicationContext(), Home.class));
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.quickPlay:
                    startActivity(new Intent(getApplicationContext(), QuickPlay.class));
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.puzzles:
                    return true;
                case R.id.news:
                    startActivity(new Intent(getApplicationContext(), News.class));
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.blogs:
                    startActivity(new Intent(getApplicationContext(), Blogs.class));
                    overridePendingTransition(0, 0);
                    return true;
            }
            return true;

        });
    }
}