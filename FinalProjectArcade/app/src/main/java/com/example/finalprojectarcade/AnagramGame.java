package com.example.finalprojectarcade;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;

public class AnagramGame extends AppCompatActivity {
            TextView tv_info, tv_word;

            EditText et_games;

            Button b_check,b_new;

            Random r;

            String currentWord;

            String[] dictionary ={
                    "one",
                    "two",
                    "three",
                    "four",
                    "five,",
                    "six",
                    "seven",
                    "eight",
                    "nine",
                    "ten"
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anagram_game);

        tv_info = (TextView) findViewById(R.id.tv_info);

        tv_word = (TextView) findViewById(R.id.tv_word);

        et_games = (EditText) findViewById(R.id.et_games);

        b_check = (Button) findViewById(R.id.b_check);

        b_new = (Button) findViewById(R.id.b_new);

        r = new Random();

        newGame();

        b_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et_games.getText().toString().equalsIgnoreCase(currentWord)){
                    tv_info.setText("Awesome!!!!");
                    b_check.setEnabled(false);
                    b_new.setEnabled(true);
                }
            }
        });
        b_new.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newGame();
            }
        });
    }
    // the private string shuffles the algorithm
    private String shuffleWord(String word) {
        List<String> letters = Arrays.asList(word.split(""));
        Collections.shuffle(letters);
        String shuffled = "";
        for (String letter : letters) {
            shuffled += letter;
        }
        return shuffled;
    }
    private void newGame(){
        currentWord = dictionary[r.nextInt(dictionary.length)];//here you get a random word

        tv_word.setText(shuffleWord(currentWord));//this shows you the shuffled word

        et_games.setText("");//clear the text

        b_new.setEnabled(false );//switch buttons

        b_check.setEnabled(true);
    }
}