package com.example.finalprojectarcade;

import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;

public class CoinFlip extends AppCompatActivity {
        Button b_flip;

        ImageView iv_coin;

        Random r;

        int coinSide; // 0 for heads 1 for tails
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coin_flip);

        b_flip = (Button) findViewById(R.id.b_Flip);
        iv_coin =(ImageView) findViewById(R.id.iv_coin);

        r = new Random();
        b_flip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coinSide = r.nextInt(2);//nextInt :Returns the next pseudorandom, uniformly distributed int value from this random number generator's sequence. The general contract of nextInt is that one int value is pseudorandomly generated and returned. All 232 possible int values are produced with (approximately) equal probability.
                if(coinSide == 0){
                    iv_coin.setImageResource(R.drawable.coinhead);
                    Toast.makeText(CoinFlip.this,"Heads",Toast.LENGTH_SHORT).show();
                }else if(coinSide == 1){
                    iv_coin.setImageResource(R.drawable.tails);
                    Toast.makeText(CoinFlip.this,"Tails",Toast.LENGTH_SHORT).show();

                }
                RotateAnimation rotate = new RotateAnimation(0,360,RotateAnimation.RELATIVE_TO_SELF,0.5f,RotateAnimation.RELATIVE_TO_SELF,0.5f);
                rotate.setDuration(1000);
                iv_coin.startAnimation(rotate);
            }

        });
    }
}