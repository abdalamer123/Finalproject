package com.example.finalprojectarcade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Gamespace extends AppCompatActivity {
    private Button TicTacToe;
    private Button GameSearch;
    private Button PuzzleSolver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamespace);
        TicTacToe = findViewById(R.id.TicTacToe);
        GameSearch = findViewById(R.id.GameSearch);
        PuzzleSolver = findViewById(R.id.PuzzleSolver);

        TicTacToe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTicTacToe();
            }
        });
        GameSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGameSearch();
            }
        });
        PuzzleSolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPuzzleSolver();
            }
        });


    }
    public void openTicTacToe(){
        Intent intent = new Intent(this,TicTacToe.class);
        startActivity(intent);
    }
    public void openGameSearch(){
        Intent intent = new Intent(this,GameSearch.class);
        startActivity(intent);
    }
    public void openPuzzleSolver(){
        Intent intent =  new Intent(this,PuzzleSolver.class);
        startActivity(intent);
    }
}