package com.example.ankit.experiment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EndActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end2);
    }
    public void restart1(View view)
    {
        Intent intent = new Intent(EndActivity2.this,MainActivity.class);
        startActivity(intent);
    }
}
