package com.example.seleccionimagenm4i9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int imgBrazos = R.drawable.baseline_accessibility_new_24;
    int imgMuleta = R.drawable.baseline_assist_walker_24;
    int imgMimir = R.drawable.baseline_airline_seat_individual_suite_24;
    int imgBluthu = R.drawable.baseline_bluetooth_24;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initListeners();
    }

    private void initListeners(){

        ImageButton imgBrazos = findViewById(R.id.ImgBrazos);
        ImageButton imgMuleta = findViewById(R.id.imgMuleta);
        ImageButton imgMimir = findViewById(R.id.imgMimir);
        ImageButton imgBluthu = findViewById(R.id.imgBluthu);

        imgBrazos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToSecondActivity();

            }
        });

        imgMuleta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToSecondActivity();

            }
        });

        imgMimir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToSecondActivity();

            }
        });

        imgBluthu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToSecondActivity();

            }
        });

    }

    public void  moveToSecondActivity(){
        Intent move = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(move);
    }
}