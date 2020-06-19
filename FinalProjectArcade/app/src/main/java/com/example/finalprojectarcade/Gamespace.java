package com.example.finalprojectarcade;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Gamespace extends AppCompatActivity {
    private Button TicTacToe;/// i amm adding more games
    private Button GameSearch;
    private Button RockPaperScissors;
    private Button NumbersGame;
    private Button SlotMachine;
    private Button CoinFlip;
    private Button AnagramGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamespace);
        TicTacToe = findViewById(R.id.TicTacToe);
        GameSearch = findViewById(R.id.GameSearch);
        RockPaperScissors = findViewById(R.id.RockPaperScissors);
        NumbersGame = findViewById(R.id.NumbersGame);
        SlotMachine = findViewById(R.id.SlotMachine);
        CoinFlip = findViewById(R.id.CoinFlip);
        AnagramGame = findViewById(R.id.AnagramGame);

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
        RockPaperScissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRockPaperScissors();
            }
        });
    }
    public void openTicTacToe(){
        Intent intent = new Intent(this,TicTacToe.class);
        startActivity(intent);
    }
    public void openGameSearch() {
        Intent intent = new Intent(this, GameSearch.class);
        startActivity(intent);
    }
    public  void openRockPaperScissors(){
        Intent intent = new Intent(this,RockPaperScissors.class);
        startActivity(intent);
    }
}