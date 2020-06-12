package com.example.finalprojectarcade;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class GameSearch extends AppCompatActivity {
 EditText searchBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_search);

        searchBar = findViewById(R.id.search_bar);
    }

    public void fetchData(View view) {
        final TextView textView = (TextView) findViewById(R.id.textView);
        String GameSearched = searchBar.getText().toString();


    }
}