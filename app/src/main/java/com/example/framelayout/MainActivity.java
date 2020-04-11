package com.example.framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView v1;
    private Button boton1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        v1 = (ImageView) findViewById(R.id.imageView);
        boton1 = (Button) findViewById(R.id.button);
    }

    public void Hide(View view){
        boton1.setVisibility(View.INVISIBLE);
        v1.setVisibility(View.VISIBLE);
    }
}