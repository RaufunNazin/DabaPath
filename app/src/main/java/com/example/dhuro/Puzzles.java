package com.example.dhuro;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

public class Puzzles extends Home {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzles);

        Button buttonH = findViewById(R.id.button);
        buttonH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nowHome((View) view);
            }});
    }

    public void nowHome(View view) {
        Intent Home = new Intent(Puzzles.this, Home.class);
        startActivity(Home);
    }
}