package com.zover.colors;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SeekBar Color_RED;
    SeekBar Color_GREEN;
    SeekBar Color_BLUE;
    TextView T_RED;
    TextView T_GREEN;
    TextView T_BLUE;
    Button BACK;

    int max = 255;
    int r_current = 0;
    int g_current = 0;
    int b_current = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);

        Color_RED = (SeekBar) findViewById(R.id.Color_RED);
        Color_GREEN = (SeekBar) findViewById(R.id.Color_GREEN);
        Color_BLUE = (SeekBar) findViewById(R.id.Color_BLUE);

        T_RED = (TextView) findViewById(R.id.T_RED);
        T_GREEN = (TextView) findViewById(R.id.T_GREEN);
        T_BLUE = (TextView) findViewById(R.id.T_BLUE);
        BACK = (Button) findViewById(R.id.BACK);


        T_RED.setText("R: ");
        T_GREEN.setText("G: ");
        T_BLUE.setText("B: ");

        Color_RED.setMax(max);
        Color_GREEN.setMax(max);
        Color_BLUE.setMax(max);

        BACK.setBackgroundColor(Color.TRANSPARENT);


        Color_RED.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                r_current = progress;
                T_RED.setText("R: " + r_current);

                BACK.setText(r_current + ", " + g_current + ", " + b_current);
                BACK.setBackgroundColor(Color.rgb(r_current, g_current, b_current));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }

        });

        Color_GREEN.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                g_current = progress;
                T_GREEN.setText("G: " + g_current);

                BACK.setText(r_current + ", " + g_current + ", " + b_current);
                BACK.setBackgroundColor(Color.rgb(r_current, g_current, b_current));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        Color_BLUE.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                b_current = progress;
                T_BLUE.setText("B: " + b_current);

                BACK.setText(r_current + ", " + g_current + ", " + b_current);
                BACK.setBackgroundColor(Color.rgb(r_current, g_current, b_current));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
