package com.example.finalprojectarcade;
//i am using my API here

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.squareup.picasso.Picasso;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import androidx.appcompat.app.AppCompatActivity;

public class GameSearch extends AppCompatActivity {
    EditText GameEdittext;
    TextView textView1;// this is my textview
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_search);
         GameEdittext =findViewById(R.id.search_bar);
         textView1 =findViewById(R.id.textview1);
         textView2 = findViewById(R.id.textview2);
         textView3 = findViewById(R.id.textview3);
         textView4 = findViewById(R.id.textview4);
         textView5 = findViewById(R.id.textview5);
         image = findViewById(R.id.image);
         // linking my textview
    }
    public void fetchData(View view) {
// ..// Instantiate the RequestQueue.
        RequestQueue queue = Volley.newRequestQueue(this);
        String url ="https://rawg-video-games-database.p.rapidapi.com/games/";/////the api works


// Request a string response from the provided URL.
        final String results = GameEdittext.getText().toString();


        final JsonObjectRequest stringRequest = new JsonObjectRequest(Request.Method.GET, url+results,null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        // would i put the settext here?/// i put it here and it didnt work
                        // Display the first 500 characters of the response string.
                        try {

                            String names =response.getString("name");
                            String released = response.getString("released");
                            String games = response.getString("description");
                         //   String genres =response.getString("genres");
                            String imageUrl = response.getString("background_image");
                            String  rating = response.getString("rating");
                            Picasso.get().load(imageUrl).into(image);
                            textView1.setText(names);
                            textView2.setText(released);
                            textView3.setText(games);
                            textView4.setText(rating);
                          //  textView5.setText(genres);



                            Log.d("results",names);
                            Log.d("results",rating);
                           // Log.d("results",genres);//he string is game i want to get the information from the edittext and put it into the textview...
                            Log.d("results",released);
                            Log.d("results",games);
                            Log.d("results",imageUrl);


                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }){

            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                Map<String,String> params = new HashMap<String, String>();
                params.put("x-rapidapi-host", "rawg-video-games-database.p.rapidapi.com");
                params.put("x-rapidapi-key","e930d87e87msh505a6c2f211a407p107028jsn32aae25b3e0d");
                return params;
            }
        };

// Add the request to the RequestQueue.
        queue.add(stringRequest);
    }
}