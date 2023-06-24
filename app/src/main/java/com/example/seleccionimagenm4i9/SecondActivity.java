package com.example.seleccionimagenm4i9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initListeners();
        Intent move = getIntent();
        int idImagen = move.getIntExtra("clave",0);
        Log.d("Second activity", String.valueOf(idImagen));

        ImageButton imgSecond = findViewById(R.id.imgSecond);

        imgSecond.setImageResource(idImagen);

    }

    private void initListeners(){
        Button btnVolver = findViewById(R.id.btnVolver);

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(move);
            }
        });
    }
}