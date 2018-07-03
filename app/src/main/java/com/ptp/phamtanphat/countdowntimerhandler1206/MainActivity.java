package com.ptp.phamtanphat.countdowntimerhandler1206;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    Button btnRandom;
    int[] manghinh = {R.drawable.iconbird, R.drawable.icondog, R.drawable.iconfrog, R.drawable.iconmouse, R.drawable.iconsnake};
    Random random;
    int index = 0;
    CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.imageview);
        btnRandom = findViewById(R.id.buttonRandomhinh);

        random = new Random();

        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                int index = random.nextInt(manghinh.length);
////
//                img.setImageResource(manghinh[index]);
                countDownTimer = new CountDownTimer(5000, 1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
//                        index = random.nextInt(manghinh.length);
//                        img.setImageResource(manghinh[index]);
                        int thoigian = (int) millisUntilFinished;
                        Log.d("BBB",(thoigian / 1000) +  "");
                    }

                    @Override
                    public void onFinish() {

                    }
                };
                countDownTimer.start();

            }
        });
    }
}
