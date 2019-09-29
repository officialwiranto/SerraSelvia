package com.example.moveintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnMove;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMove = findViewById(R.id.btn_move_intent);
        btnMove.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (View.get.id()) {
            case R.id.btn_move_intent;
            startActivity(new Intent( packageContext: this, SecondActivity.class));
            break;
        }
    }

}
