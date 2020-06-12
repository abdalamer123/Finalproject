package com.example.finalprojectarcade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.buttontoArcade);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGamespace();
            }
        });
    }
    public void openGamespace(){// comment
        Intent intent = new Intent(this,Gamespace.class );//into the game we go
        startActivity(intent );
    }
}
//no
