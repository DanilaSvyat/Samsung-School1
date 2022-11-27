package com.example.cw14;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnGreen, btnRed;
    private TextView tvCount;
    private int count;
    boolean textRed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count = 0;
        textRed = false;
        btnGreen = findViewById(R.id.btn_green);
        btnRed = findViewById(R.id.btn_red);
        tvCount = findViewById(R.id.tv_count);

        btnGreen.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        if (textRed) count--;
                        else count++;

                        changeColor();
                        tvCount.setText("Count: " + count);
                    }
                }
        );

        btnRed.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        if (textRed) count++;
                        else count--;

                        changeColor();
                        tvCount.setText("Count: " + count);
                    }
                }
        );
    }

    public void changeColor() {

        if (Math.random() < 0.5) {
            tvCount.setBackgroundColor(getResources().getColor(R.color.green));
            textRed = false;
        } else {
            tvCount.setBackgroundColor(getResources().getColor(R.color.red));
            textRed = true;
        }
    }

}