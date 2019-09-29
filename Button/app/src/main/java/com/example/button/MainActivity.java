package com.example.button;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);



    @Override
    public void onClick (View View) {
        switch (view.getId()){
            case R.id.btn1:
                Toast.makeText(getApplicationContext(),"BTN 1 telah diklik", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn2:
                Toast.maketext(getApplicationContext(), "BTN 2 telah diklik", Toast.LENGTH_SHORT).show();
                break;

                default:
                    break;
        }
        }
    }

