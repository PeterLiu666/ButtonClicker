package com.example.bottonclicker;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity
{
    private int count;
    private Button buttonClickerButton;
    private TextView textview_score_main;
    private ConstraintLayout constraintsLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // sets count to 0
        count = 0;

        // wiring widgets
        buttonClickerButton = findViewById(R.id.botton_main_clicker);
        textview_score_main = findViewById(R.id.textview_main_score);
        constraintsLayout = findViewById(R.id.constraint_layout_main);
    }
    public void onClickerClicks(View view)
    {

        count++;

        textview_score_main.setText("Score: " + count);

        changeBackgroundColor();
    }

    private void changeBackgroundColor()
    {
        int r = (int)(Math.random() * 256);
        int g = (int)(Math.random() * 256);
        int b = (int)(Math.random() * 256);
        int color = Color.rgb(r, g, b);
        constraintsLayout.setBackgroundColor(color);



    }

}
